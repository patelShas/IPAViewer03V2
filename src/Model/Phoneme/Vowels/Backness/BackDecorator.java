package Model.Phoneme.Vowels.Backness;

import Model.Phoneme.Vowels.AVowelDecorator;
import Model.Phoneme.Vowels.IVowel;

import java.util.List;

public class BackDecorator  extends AVowelDecorator {

  public BackDecorator(IVowel baseDesc) {
    super(baseDesc);
  }

  @Override
  public String PhonemeDescriptor() {
    return "back " + super.PhonemeDescriptor();
  }

  @Override
  public String HowToSound() {
    return super.HowToSound() + " You should put the highest point on your tongue near to the "
        + "back of your mouth.";
  }

  @Override
  public List<String> getTags() {
    List<String> tags = super.getTags();
    tags.add("back");
    tags.add("dark");
    return tags;
  }
}
