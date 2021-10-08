package Model.Phoneme.Vowels.Roundedness;

import Model.Phoneme.Vowels.AVowelDecorator;
import Model.Phoneme.Vowels.IVowel;

import java.util.List;

public class UnroundedDecorator extends AVowelDecorator {

  public UnroundedDecorator(IVowel baseDesc) {
    super(baseDesc);
  }

  @Override
  public String PhonemeDescriptor() {
    return "unrounded " + super.PhonemeDescriptor();
  }

  @Override
  public String HowToSound() {
    return super.HowToSound() + " Your lips should be kept relaxed.";
  }

  @Override
  public List<String> getTags() {
    List<String> tags = super.getTags();
    tags.add("unrounded");
    return tags;
  }

}
