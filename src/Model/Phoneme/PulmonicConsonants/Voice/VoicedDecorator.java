package Model.Phoneme.PulmonicConsonants.Voice;

import Model.Phoneme.PulmonicConsonants.APConsDecorator;
import Model.Phoneme.PulmonicConsonants.IPCons;

import java.util.List;


public class VoicedDecorator extends APConsDecorator {

  public VoicedDecorator(IPCons baseDesc) {
    super(baseDesc);
  }

  @Override
  public String PhonemeDescriptor() {
    return "voiced " + super.PhonemeDescriptor();
  }

  @Override
  public String HowToSound() {
    return super.HowToSound() + " You should also be using your voice box to create this sound. "
        + "You can gauge this by putting your fingers over your adam's apple. "
        + "You should be able to feel vibrations.";
  }

  @Override
  public List<String> getTags() {
    List<String> temp = super.getTags();
    temp.add("voiced");
    return temp;
  }
}

