package Model;

import java.util.List;

public interface IDictionary {

  /**
   * Will return the entries in the dictionary for how to pronounce the word.
   * @param word The word we want to look up in the dictionary
   * @return A list of Strings matching each posible pronunciation.
   */
  public List<String> lookUpQuery(String word);

  public List<String> getAllEntries();

  /**
   * Will set the specified pronunciation to be the one under current examination.
   * @param PronunciationIndex The index in a list of pronunciations for whichever
   *                           we want to specify.
   */
  public void selectPronunciation(int PronunciationIndex);

  public String getCurrentPronunc();

  /**
   * Will set the specified sound symbol to be the one under current examination.
   * @param PIndex The index in a pronunciation's string for which symbol we want to examine.
   */
  public void selectPhoneme(int PIndex);

  public String getPhonemeSign();


  /**
   * Will retrieve a name description for the currently examined phoneme.
   * @return A string describing the phoneme.
   */
  public String getPhonemeName();

  /**
   * Will retrieve a name description for how to pronounce the currently examined phoneme.
   * @return A string describing how to read the phoneme.
   */
  public String getPhonemeDesc();

}
