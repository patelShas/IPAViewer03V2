package Model.Phoneme.Vowels.Height;

import Model.Phoneme.Vowels.AVowelDecorator;
import Model.Phoneme.Vowels.IVowel;

import java.util.List;

public class NearCloseDecorator extends AVowelDecorator {

  public NearCloseDecorator(IVowel baseDesc) {
    super(baseDesc);
  }

  @Override
  public String PhonemeDescriptor() {
    return "near-close " + super.PhonemeDescriptor();
  }

  @Override
  public String HowToSound() {
    return super.HowToSound() + " You should put your tongue close to the roof of the mouth, but "
        + "not as much as you could. There should still be room to move your tongue a bit closer "
        + "without blocking airflow.";
  }

  @Override
  public List<String> getTags() {
    List<String> tags = super.getTags();
    tags.add("near-close");
    tags.add("near-high");
    return tags;
  }

}
