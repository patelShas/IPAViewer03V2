package Model.Phoneme.PulmonicConsonants.PlaceOfArticulation;

import Model.Phoneme.PulmonicConsonants.APConsDecorator;
import Model.Phoneme.PulmonicConsonants.IPCons;
import Model.References.PlaceOfArticulationInfo;

import java.util.List;

public class DentalDecorator extends APConsDecorator {

  public DentalDecorator(IPCons baseDesc) {
    super(baseDesc);
  }

  @Override
  public String PhonemeDescriptor() {
    return "dental " + super.PhonemeDescriptor();
  }

  @Override
  public String HowToSound() {
    return super.HowToSound() + " You must put your tongue against your upper teeth "
        + "to create the "
        + new PlaceOfArticulationInfo().getName() + ".";
  }

  @Override
  public List<String> getTags() {
    List<String> temp = super.getTags();
    temp.add("dental");
    temp.add(new PlaceOfArticulationInfo().getName());
    return temp;
  }

}
