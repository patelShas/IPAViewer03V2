package Model.Phoneme.PulmonicConsonants.PlaceOfArticulation;

import Model.Phoneme.PulmonicConsonants.APConsDecorator;
import Model.Phoneme.PulmonicConsonants.IPCons;
import Model.References.PlaceOfArticulationInfo;

import java.util.List;

public class LabioDentalDecorator extends APConsDecorator {

  public LabioDentalDecorator(IPCons baseDesc) {
    super(baseDesc);
  }

  @Override
  public String PhonemeDescriptor() {
    return "labiodental " + super.PhonemeDescriptor();
  }

  @Override
  public String HowToSound() {
    return super.HowToSound() + " You must touch your lower lip with your upper front teeth to "
        + "create the "
        + new PlaceOfArticulationInfo().getName() + ".";
  }

  @Override
  public List<String> getTags() {
    List<String> temp = super.getTags();
    temp.add("labiodental");
    temp.add(new PlaceOfArticulationInfo().getName());
    return temp;
  }
}
