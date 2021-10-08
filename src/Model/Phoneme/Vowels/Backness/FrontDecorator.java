package Model.Phoneme.Vowels.Backness;

import Model.Phoneme.Vowels.AVowelDecorator;
import Model.Phoneme.Vowels.IVowel;

import java.util.List;

public class FrontDecorator  extends AVowelDecorator {

  public FrontDecorator(IVowel baseDesc) {
    super(baseDesc);
  }

  @Override
  public String PhonemeDescriptor() {
    return "front " + super.PhonemeDescriptor();
  }

  @Override
  public String HowToSound() {
    return super.HowToSound() + " You should put the highest point on your tongue near to the "
        + "front of your mouth.";
  }

  @Override
  public List<String> getTags() {
    List<String> tags = super.getTags();
    tags.add("front");
    tags.add("bright");
    return tags;
  }
}
