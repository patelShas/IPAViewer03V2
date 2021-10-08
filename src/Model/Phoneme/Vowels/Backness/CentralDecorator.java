package Model.Phoneme.Vowels.Backness;

import Model.Phoneme.Vowels.AVowelDecorator;
import Model.Phoneme.Vowels.IVowel;

import java.util.List;

public class CentralDecorator  extends AVowelDecorator {

  public CentralDecorator(IVowel baseDesc) {
    super(baseDesc);
  }

  @Override
  public String PhonemeDescriptor() {
    return "central " + super.PhonemeDescriptor();
  }

  @Override
  public String HowToSound() {
    return super.HowToSound() + " You should put the highest point on your tongue about midway "
        + "between the "
        + "front and back of your mouth.";
  }

  @Override
  public List<String> getTags() {
    List<String> tags = super.getTags();
    tags.add("central");
    tags.add("mixed");
    return tags;
  }
}
