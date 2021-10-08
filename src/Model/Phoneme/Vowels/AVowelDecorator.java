package Model.Phoneme.Vowels;

import java.util.List;

public abstract class AVowelDecorator extends GenericVowel {

  private final IVowel baseDesc;

  public AVowelDecorator(IVowel baseDesc) {
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
