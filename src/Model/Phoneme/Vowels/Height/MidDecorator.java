package Model.Phoneme.Vowels.Height;

import Model.Phoneme.Vowels.AVowelDecorator;
import Model.Phoneme.Vowels.IVowel;

import java.util.List;

public class MidDecorator extends AVowelDecorator {
  public MidDecorator(IVowel baseDesc) {super(baseDesc);}

  @Override
  public String PhonemeDescriptor() {
    return "mid " + super.PhonemeDescriptor();
  }

  @Override
  public String HowToSound() {
    return super.HowToSound() + " You should put your tongue halfway between the top and bottom "
        + "of your mouth.";
  }

  @Override
  public List<String> getTags() {
    List<String> tags = super.getTags();
    tags.add("mid");
    tags.add("true-mid");
    return tags;
  }
}
