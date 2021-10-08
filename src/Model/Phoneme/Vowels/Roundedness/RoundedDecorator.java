package Model.Phoneme.Vowels.Roundedness;

import Model.Phoneme.Vowels.AVowelDecorator;
import Model.Phoneme.Vowels.IVowel;

import java.util.List;

public class RoundedDecorator extends AVowelDecorator {

  public RoundedDecorator(IVowel baseDesc) {
    super(baseDesc);
  }

  @Override
  public String PhonemeDescriptor() {
    return "rounded " + super.PhonemeDescriptor();
  }

  @Override
  public String HowToSound() {
    return super.HowToSound() + " Your lips should be curled to form a circular opening.";
  }

  @Override
  public List<String> getTags() {
    List<String> tags = super.getTags();
    tags.add("rounded");
    return tags;
  }

}
