package Model.Phoneme.OtherSymbols;

import Model.Phoneme.Vowels.ActualVowels.ASpecificVowel;
import Model.Phoneme.Vowels.ActualVowels.MidCentralVowel;
import Model.Phoneme.Vowels.IVowel;

import java.util.List;

public class RColored extends ASpecificVowel {

  IVowel attributes;

  @Override
  public char getSymbol() {
    return 'ɝ';
  }

  public RColored() {
    attributes = new MidCentralVowel();
  }

  @Override
  public String PhonemeDescriptor() {
    return "r-colored vowel";
  }

  @Override
  public String HowToSound() {
    return attributes.HowToSound() + " "
        + "To give this sound it's 'r', you should turn the tip of your tongue upward for part"
        + " of the sound or bunch together the back of the tongue.";
  }

  @Override
  public List<String> getTags() {
    List<String> temp = attributes.getTags();
    temp.add("r-colored");
    return temp;
  }
}
