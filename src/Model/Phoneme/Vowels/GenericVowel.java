package Model.Phoneme.Vowels;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class GenericVowel implements IVowel {

  @Override
  public char getSymbol() {
    throw new IllegalArgumentException("A symbol has not been specified for this!");
  }

  @Override
  public String PhonemeDescriptor() {
    return "vowel";
  }

  @Override
  public String HowToSound() {
    return "You should pronounce this sound with an open vocal tract, allowing air to move "
        + "without being blocked or stopped.";
  }

  @Override
  public List<String> getTags() {
    return new ArrayList<>(Arrays.asList("vowel"));
  }

}
