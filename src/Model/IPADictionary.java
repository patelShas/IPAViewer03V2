package Model;

import Model.Phoneme.IPhoneme;
import Model.Phoneme.MegaFactory;
import Model.Phoneme.OtherSymbols.OtherFactory;
import Model.Phoneme.PulmonicConsonants.PConsFactory;
import Model.Phoneme.SupraSegmental.SuperSegsFactory;
import Model.Phoneme.Vowels.VowelFactory;

import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

public class IPADictionary implements IDictionary {

  private String[][] mappings;
  private List<String> curEntries;
  private int curEntryChoice;
  private IPhoneme curSound;
  private final MegaFactory mf = new MegaFactory();

  /**
   * A convenience constructor that creates a dictionary using the full current source en_US.txt
   */
  public IPADictionary() {
    this(
            "en_US.txt"
    );
  }
  public IPADictionary(String filePath) {
    if (filePath == null) {throw new IllegalArgumentException("A path name is required");}
    mapItOut(filePath);
    curEntries = new ArrayList<>();
    curSound = null;
  }

  /**
   * Will create a set of mappings from the dictionary's source to something that could be used by
   *     the dictionary's other methods.
   * @throws IllegalArgumentException if the File could not be read.
   */
  private void mapItOut(String filePath) {
    String[] arrayOfEntries = new String[0];
    try {
//      InputStream is = new FileInputStream(new File(filePath));
      InputStream is = getClass().getClassLoader().getResourceAsStream(filePath);
      String rawDict = new String(is.readAllBytes(), StandardCharsets.UTF_8);
      arrayOfEntries = rawDict.split("\\r?\\n");
    } catch (IOException e) {
      e.printStackTrace();
    }
    /*
    try {
      arrayOfEntries = Files.readString(new File(filePath).toPath()).split("\\r?\\n");
    } catch (IOException e) {
      throw new IllegalArgumentException("The file could not be read from");
    }
     */
    mappings = new String[arrayOfEntries.length][];
    for (int i = 0; i < arrayOfEntries.length; i++) {
      mappings[i] = arrayOfEntries[i].split("[\\s,]+");
    }
  }

  /**
   * Retrieves the pronunciations in the dictionary for the given query.
   * @param query The word we want to know the possible pronunciations of.
   * @return A list of the pronunciations for this word.
   */
  private List<String> getPronunciations(String query) {
    int index = getWordIndex(query);
    List<String> ans = new ArrayList<>();
    if (mappings[index].length < 1) {
      throw new IllegalArgumentException("There were no pronunciations in this entry!");
    }
    for (int i = 1; i < mappings[index].length; i++) {
      ans.add(mappings[index][i]);
    }
    return ans;
  }
  /**
   * Retrieves index in the mapping for where the specified query and its entries are.
   * @param query The word we want to look up.
   * @return The index of the query's entry.
   * @throws IllegalArgumentException If the word could not be found in the mappings.
   */
  private int getWordIndex(String query) throws IllegalArgumentException {
    int pivot = 0;
    int left = 0;
    int right = mappings.length - 1;
    while (left <= right) {
      pivot = left + (right - left) / 2;
      if (mappings[pivot][0].equals(query)) {
        return pivot;
      }
      if (query.compareTo(mappings[pivot][0]) < 0) {
        right = pivot - 1;
      } else {
        left = pivot + 1;
      }
    }
    throw new IllegalArgumentException("We could not find the word");
  }


  /*
   * Methods allChars and AllcharsUncluded exist to help figure out what chars need to get added
   */
  private String allChars() {
    StringBuilder temp = new StringBuilder("");
    for (int i = 0; i < mappings.length; i++) {
      String[] entry = mappings[i];
      for (int j = 1; j < entry.length; j++) {
        String s = entry[j];
        for (int k = 0; k < s.length(); k++) {
          char c = s.charAt(k);
          if (temp.toString().indexOf(c) == -1) {
            temp.append(c);
          }
        }
      }
    }
    return temp.toString();
  }
  public String allCharsUncluded() {
    StringBuilder temp = new StringBuilder("");
    VowelFactory v = new VowelFactory();
    PConsFactory p = new PConsFactory();
    SuperSegsFactory s = new SuperSegsFactory();
    OtherFactory o = new OtherFactory();
    String base = allChars();
    for (int i = 0; i < base.length(); i++) {
      char c = base.charAt(i);
      if (!p.validSymbols().contains(c) && !v.validSymbols().contains(c) && !s.validSymbols()
          .contains(c) && !o.validSymbols().contains(c)) {
        temp.append(c);
      }
    }
    return temp.toString();
  }
  /*
   * A cool helper function that counts how many steps it takes to find a word.
   */
  private int stepsToFind(String query) throws IllegalArgumentException {
    int pivot = 0;
    int left = 0;
    int right = mappings.length - 1;
    int count = 0;
    while (left <= right) {
      count++;
      pivot = left + (right - left) / 2;
      if (mappings[pivot][0].equals(query)) {
        return count;
      }
      if (query.compareTo(mappings[pivot][0]) < 0) {
        right = pivot - 1;
      } else {
        left = pivot + 1;
      }
    }
    throw new IllegalArgumentException("We could not find the word");
  }

  @Override
  public List<String> lookUpQuery(String word) {
    curEntryChoice = 0;
    curSound = null;
    if (word == null) {
      curEntries = new ArrayList<>();
      throw new IllegalArgumentException("You cannot search a null word!");
    }
    curEntries = getPronunciations(word.toLowerCase(Locale.ROOT));
    return curEntries;
  }

  @Override
  public List<String> getAllEntries() {
    if (curEntries == null) {
      return new ArrayList<>();
    } else {
      return curEntries;
    }
  }

  @Override
  public void selectPronunciation(int PronunciationIndex) {
    if (curEntries.size() == 0) {
      throw new IllegalArgumentException("There are no pronunciations to choose from");
    } else if (PronunciationIndex >= curEntries.size() || PronunciationIndex < 0) {
      System.out.println(PronunciationIndex);
      throw new IllegalArgumentException("Invalid pronunciation index!");
    } else {
      curSound = null;
      curEntryChoice = PronunciationIndex;
    }
  }

  @Override
  public String getCurrentPronunc() {
    if (curEntries.size() > 0) {
      return curEntries.get(curEntryChoice);
    } else {
      return "";
    }
  }

  @Override
  public void selectPhoneme(int PIndex) {
    if (PIndex >= getCurrentPronunc().length() || PIndex < 0) {
      throw new IllegalArgumentException("That is not a valid index.");
    }
    char c = getCurrentPronunc().charAt(PIndex);
    if (c == '/') {
      throw new IllegalArgumentException("That's not a sound for a symbol. It just means the"
          + " beginning or end of a full pronunciation.");
    }
    curSound = mf.makePhoneme(c);
  }

  @Override
  public String getPhonemeSign() {
    if (curSound == null) {
      return "";
    } else {
      return String.valueOf(curSound.getSymbol());
    }
  }

  @Override
  public String getPhonemeName() {
    if (curSound == null) {
      return "";
    } else {
      return curSound.PhonemeDescriptor();
    }
  }

  @Override
  public String getPhonemeDesc() {
    if (curSound == null) {
      return "";
    } else {
      return curSound.HowToSound();
    }
  }


}
