package Model.Phoneme.SupraSegmental.ActualSuperSegs;

import Model.Phoneme.SupraSegmental.ASuprasegmental;

import java.util.List;

public class ExtraShortSegs extends ASuprasegmental {

  @Override
  public char getSymbol() {
    return '̆';
  }

  @Override
  public String PhonemeDescriptor() {
    return "extra-short " + super.PhonemeDescriptor();
  }

  @Override
  public String HowToSound() {
    return super.HowToSound() + " The previous sound should be held out for "
        + "a shorter amount of time than usual.";
  }

  @Override
  public List<String> getTags() {
    List<String> temp = super.getTags();
    temp.add("length");
    return temp;
  }
}
