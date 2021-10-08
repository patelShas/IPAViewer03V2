package Model.Phoneme.PulmonicConsonants.MannerOfArticulation;

import Model.Phoneme.PulmonicConsonants.APConsDecorator;
import Model.Phoneme.PulmonicConsonants.IPCons;
import Model.References.PlaceOfArticulationInfo;

import java.util.List;

public class ApproximantDecorator extends APConsDecorator {

  public ApproximantDecorator(IPCons baseDesc) {
    super(baseDesc);
  }

  @Override
  public String PhonemeDescriptor() {
    return "approximant " + super.PhonemeDescriptor();
  }

  @Override
  public String HowToSound() {
    return super.HowToSound() + " To create this sound you should actually create a bit of distance"
        + "at the " + new PlaceOfArticulationInfo().getName() + " between your articulators. "
        + "The distance should be enough to not completely block the airflow while"
        + " still altering it.";
  }

  @Override
  public List<String> getTags() {
    List<String> temp = super.getTags();
    temp.add("approximant");
    return temp;
  }
}
