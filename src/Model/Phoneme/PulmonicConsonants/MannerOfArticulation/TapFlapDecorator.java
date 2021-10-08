package Model.Phoneme.PulmonicConsonants.MannerOfArticulation;

import Model.Phoneme.PulmonicConsonants.APConsDecorator;
import Model.Phoneme.PulmonicConsonants.IPCons;

import java.util.List;

public class TapFlapDecorator extends APConsDecorator {

  public TapFlapDecorator(IPCons baseDesc) {
    super(baseDesc);
  }

  @Override
  public String PhonemeDescriptor() {
    return "flap " + super.PhonemeDescriptor();
  }

  @Override
  public String HowToSound() {
    return super.HowToSound() + " To create this sound you must contract your muscles so that your "
        + "articulators are thrown against each other.";
  }

  @Override
  public List<String> getTags() {
    List<String> temp = super.getTags();
    temp.add("flap");
    temp.add("tap");
    return temp;
  }
}
