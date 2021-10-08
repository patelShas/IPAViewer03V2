package Model.Phoneme.SupraSegmental.ActualSuperSegs;

import Model.Phoneme.SupraSegmental.ASuprasegmental;

import java.util.List;

public class LongSegs extends ASuprasegmental {

  @Override
  public char getSymbol() {
    return 'ː';
  }

  @Override
  public String PhonemeDescriptor() {
    return "long " + super.PhonemeDescriptor();
  }

  @Override
  public String HowToSound() {
    return super.HowToSound() + " The previous sound should be held out for a long moment.";
  }

  @Override
  public List<String> getTags() {
    List<String> temp = super.getTags();
    temp.add("length");
    return temp;
  }
}
