package Model.Phoneme.PulmonicConsonants.MannerOfArticulation;

import Model.Phoneme.PulmonicConsonants.APConsDecorator;
import Model.Phoneme.PulmonicConsonants.IPCons;
import Model.References.PlaceOfArticulationInfo;

import java.util.List;

public class FricativeDecorator extends APConsDecorator {

  public FricativeDecorator(IPCons baseDesc) {
    super(baseDesc);
  }

  @Override
  public String PhonemeDescriptor() {
    return "fricative " + super.PhonemeDescriptor();
  }

  @Override
  public String HowToSound() {
    return super.HowToSound() + " To create this sound you force air through the "
        + new PlaceOfArticulationInfo().getName() + " you have created.";
  }

  @Override
  public List<String> getTags() {
    List<String> temp = super.getTags();
    temp.add("fricative");
    return temp;
  }
}
