package Model.Phoneme.Vowels.ActualVowels;

import Model.Phoneme.Vowels.GenericVowel;
import Model.Phoneme.Vowels.IVowel;

import java.util.List;

public abstract class ASpecificVowel implements IVowel {

  IVowel attributes;

  public ASpecificVowel() {
    attributes = new GenericVowel();
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
