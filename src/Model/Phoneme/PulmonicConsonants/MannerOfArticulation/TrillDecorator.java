package Model.Phoneme.PulmonicConsonants.MannerOfArticulation;

import Model.Phoneme.PulmonicConsonants.APConsDecorator;
import Model.Phoneme.PulmonicConsonants.IPCons;
import Model.References.PlaceOfArticulationInfo;

import java.util.List;

public class TrillDecorator extends APConsDecorator {

  public TrillDecorator(IPCons baseDesc) {
    super(baseDesc);
  }

  @Override
  public String PhonemeDescriptor() {
    return "trill " + super.PhonemeDescriptor();
  }

  @Override
  public String HowToSound() {
    return super.HowToSound() + " Whatever you are using to create the "
        + new PlaceOfArticulationInfo().getName() + ", you must hold it while using your airstream to"
        + "vibrate it. This vibration will create the sound.";
  }

  @Override
  public List<String> getTags() {
    List<String> temp = super.getTags();
    temp.add("trill");
    return temp;
  }
}
