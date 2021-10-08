package Model.Phoneme.PulmonicConsonants.PlaceOfArticulation;

import Model.Phoneme.PulmonicConsonants.APConsDecorator;
import Model.Phoneme.PulmonicConsonants.IPCons;
import Model.References.PlaceOfArticulationInfo;

import java.util.List;

public class PalatalDecorator extends APConsDecorator {

  public PalatalDecorator(IPCons baseDesc) {
    super(baseDesc);
  }

  @Override
  public String PhonemeDescriptor() {
    return "palatal " + super.PhonemeDescriptor();
  }

  @Override
  public String HowToSound() {
    return super.HowToSound() + " To create the "
        + new PlaceOfArticulationInfo().getName()
        + ", you need to raise the body of the tongue against the hard palate. ";
  }

  @Override
  public List<String> getTags() {
    List<String> temp = super.getTags();
    temp.add("palatal");
    temp.add(new PlaceOfArticulationInfo().getName());
    return temp;
  }
}
