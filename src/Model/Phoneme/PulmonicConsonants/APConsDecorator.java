package Model.Phoneme.PulmonicConsonants;

import java.util.List;

public abstract class APConsDecorator extends GenericPCons {

  private final IPCons baseDesc;

  public APConsDecorator(IPCons baseDesc) {
    this.baseDesc = baseDesc;
  }

  @Override
  public String PhonemeDescriptor() {
    return baseDesc.PhonemeDescriptor();
  }

  @Override
  public String HowToSound() {
    return baseDesc.HowToSound();
  }

  @Override
  public List<String> getTags() {
    return baseDesc.getTags();
  }

}
