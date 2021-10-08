package Model.Phoneme.PulmonicConsonants.Voice;

import Model.Phoneme.PulmonicConsonants.APConsDecorator;
import Model.Phoneme.PulmonicConsonants.IPCons;

import java.util.List;

public class VoicelessDecorator extends APConsDecorator {

  public VoicelessDecorator(IPCons baseDesc) {
    super(baseDesc);
  }

  @Override
  public String PhonemeDescriptor() {
    return "voiceless " + super.PhonemeDescriptor();
  }

  @Override
  public String HowToSound() {
    return super.HowToSound() + " You should also be creating this sound "
        + "without using your voice box. "
        + "You can gauge this by putting your fingers over your adam's apple. "
        + "You should feel little to no vibrations.";
  }

  @Override
  public List<String> getTags() {
    List<String> temp = super.getTags();
    temp.add("voiceless");
    return temp;
  }
}
