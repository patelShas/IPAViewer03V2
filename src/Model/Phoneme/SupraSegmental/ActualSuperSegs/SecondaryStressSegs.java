package Model.Phoneme.SupraSegmental.ActualSuperSegs;

import Model.Phoneme.SupraSegmental.ASuprasegmental;

import java.util.List;

public class SecondaryStressSegs extends ASuprasegmental {

  @Override
  public char getSymbol() {
    return 'ˌ';
  }

  @Override
  public String PhonemeDescriptor() {
    return "secondary stress " + super.PhonemeDescriptor();
  }

  @Override
  public String HowToSound() {
    return super.HowToSound() + " The next element or syllable is "
        + "the second most stressed in the word.";
  }

  @Override
  public List<String> getTags() {
    List<String> temp = super.getTags();
    temp.add("stress");
    return temp;
  }
}
