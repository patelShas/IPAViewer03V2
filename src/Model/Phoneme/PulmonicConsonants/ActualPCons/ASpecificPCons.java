package Model.Phoneme.PulmonicConsonants.ActualPCons;

import Model.Phoneme.PulmonicConsonants.GenericPCons;
import Model.Phoneme.PulmonicConsonants.IPCons;

import java.util.List;

public abstract class ASpecificPCons implements IPCons {
  IPCons attributes;

  public ASpecificPCons() {
    attributes = new GenericPCons();
  }

  @Override
  public String PhonemeDescriptor() {
    return attributes.PhonemeDescriptor();
  }

  @Override
  public String HowToSound() {
    return attributes.HowToSound();
  }

  @Override
  public List<String> getTags() {
    return attributes.getTags();
  }
}
