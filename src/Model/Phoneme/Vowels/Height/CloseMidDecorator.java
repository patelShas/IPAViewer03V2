package Model.Phoneme.Vowels.Height;

import Model.Phoneme.Vowels.AVowelDecorator;
import Model.Phoneme.Vowels.IVowel;

import java.util.List;

public class CloseMidDecorator extends AVowelDecorator {

  public CloseMidDecorator(IVowel baseDesc) {super(baseDesc);}

  @Override
  public String PhonemeDescriptor() {
    return "close-mid " + super.PhonemeDescriptor();
  }

  @Override
  public String HowToSound() {
    return super.HowToSound() + " You should put your tongue between the top and bottom of your "
        + "mouth, about one-third from the top and two-thirds from the bottom.";
  }

  @Override
  public List<String> getTags() {
    List<String> tags = super.getTags();
    tags.add("close-mid");
    tags.add("mid-close");
    tags.add("high-mid");
    tags.add("mid-high");
    tags.add("half-close");
    return tags;
  }
}
