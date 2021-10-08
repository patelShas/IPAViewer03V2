package Model.Phoneme.SupraSegmental.ActualSuperSegs;

import Model.Phoneme.SupraSegmental.ASuprasegmental;

import java.util.List;

public class LinkingSegs extends ASuprasegmental {

  @Override
  public char getSymbol() {
    return '‿';
  }

  @Override
  public String PhonemeDescriptor() {
    return "linking " + super.PhonemeDescriptor();
  }

  @Override
  public String HowToSound() {
    return super.HowToSound() + " There should be no stop in the speech.";
  }

  @Override
  public List<String> getTags() {
    List<String> temp = super.getTags();
    temp.add("break");
    return temp;
  }
}
