package Model.Phoneme.Vowels.Height;

import Model.Phoneme.Vowels.AVowelDecorator;
import Model.Phoneme.Vowels.IVowel;

import java.util.List;

public class OpenMidDecorator extends AVowelDecorator {

  public OpenMidDecorator(IVowel baseDesc) {super(baseDesc);}

  @Override
  public String PhonemeDescriptor() {
    return "open-mid " + super.PhonemeDescriptor();
  }

  @Override
  public String HowToSound() {
    return super.HowToSound() + " You should put your tongue between the top and bottom of your "
        + "mouth, about two-thirds from the top and one-third from the bottom.";
  }

  @Override
  public List<String> getTags() {
    List<String> tags = super.getTags();
    tags.add("open-mid");
    tags.add("mid-open");
    tags.add("low-mid");
    tags.add("mid-low");
    tags.add("half-open");
    return tags;
  }
}
