package Model.Phoneme.PulmonicConsonants.PlaceOfArticulation;

import Model.Phoneme.PulmonicConsonants.APConsDecorator;
import Model.Phoneme.PulmonicConsonants.IPCons;
import Model.References.PlaceOfArticulationInfo;

import java.util.List;

public class VelarDecorator extends APConsDecorator {

  public VelarDecorator(IPCons baseDesc) {
    super(baseDesc);
  }

  @Override
  public String PhonemeDescriptor() {
    return "velar " + super.PhonemeDescriptor();
  }

  @Override
  public String HowToSound() {
    return super.HowToSound() + " To create the "
        + new PlaceOfArticulationInfo().getName()
        + ", you need to press the back part of your tongue against your soft palate. ";
  }

  @Override
  public List<String> getTags() {
    List<String> temp = super.getTags();
    temp.add("velar");
    temp.add(new PlaceOfArticulationInfo().getName());
    return temp;
  }
}
