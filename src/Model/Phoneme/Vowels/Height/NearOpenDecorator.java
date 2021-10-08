package Model.Phoneme.Vowels.Height;

import Model.Phoneme.Vowels.AVowelDecorator;
import Model.Phoneme.Vowels.IVowel;

import java.util.List;

public class NearOpenDecorator extends AVowelDecorator {

  public NearOpenDecorator(IVowel baseDesc) {
    super(baseDesc);
  }

  @Override
  public String PhonemeDescriptor() {
    return "near-open " + super.PhonemeDescriptor();
  }

  @Override
  public String HowToSound() {
    return super.HowToSound() + " You should put your tongue close to the bottom of the mouth, but "
        + "not as much as you could. Your tongue should still be raised just slightly.";
  }

  @Override
  public List<String> getTags() {
    List<String> tags = super.getTags();
    tags.add("near-open");
    tags.add("near-low");
    return tags;
  }

}