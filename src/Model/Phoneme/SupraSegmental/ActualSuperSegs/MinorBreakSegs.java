package Model.Phoneme.SupraSegmental.ActualSuperSegs;

import Model.Phoneme.SupraSegmental.ASuprasegmental;

import java.util.List;

public class MinorBreakSegs extends ASuprasegmental {

  @Override
  public char getSymbol() {
    return '|';
  }

  @Override
  public String PhonemeDescriptor() {
    return "minor break " + super.PhonemeDescriptor();
  }

  @Override
  public String HowToSound() {
    return super.HowToSound() + " There should be a stop in the speech for a moment.";
  }

  @Override
  public List<String> getTags() {
    List<String> temp = super.getTags();
    temp.add("break");
    return temp;
  }
}
