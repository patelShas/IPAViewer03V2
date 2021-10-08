package Model.Phoneme.Vowels.Height;

import Model.Phoneme.Vowels.AVowelDecorator;
import Model.Phoneme.Vowels.IVowel;

import java.util.List;

public class OpenDecorator extends AVowelDecorator {

  public OpenDecorator(IVowel baseDesc) {
    super(baseDesc);
  }

  @Override
  public String PhonemeDescriptor() {
    return "open " + super.PhonemeDescriptor();
  }

  @Override
  public String HowToSound() {
    return super.HowToSound() + " You should put your tongue at the bottom of your mouth, "
        + "as far from its roof as possible.";
  }

  @Override
  public List<String> getTags() {
    List<String> tags = super.getTags();
    tags.add("open");
    tags.add("low");
    return tags;
  }
}
