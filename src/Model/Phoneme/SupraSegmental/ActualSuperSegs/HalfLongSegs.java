package Model.Phoneme.SupraSegmental.ActualSuperSegs;

import Model.Phoneme.SupraSegmental.ASuprasegmental;

import java.util.List;

public class HalfLongSegs extends ASuprasegmental {

  @Override
  public char getSymbol() {
    return 'ˑ';
  }

  @Override
  public String PhonemeDescriptor() {
    return "half-long " + super.PhonemeDescriptor();
  }

  @Override
  public String HowToSound() {
    return super.HowToSound() + " The previous sound should be held out for "
        + "a bit of a moment.";
  }

  @Override
  public List<String> getTags() {
    List<String> temp = super.getTags();
    temp.add("length");
    return temp;
  }
}
