package Model.Phoneme.Vowels.Height;

import Model.Phoneme.Vowels.AVowelDecorator;
import Model.Phoneme.Vowels.IVowel;

import java.util.List;

public class CloseDecorator extends AVowelDecorator {

  public CloseDecorator(IVowel baseDesc) {
    super(baseDesc);
  }

   @Override
  public String PhonemeDescriptor() {
    return "close " + super.PhonemeDescriptor();
  }

  @Override
  public String HowToSound() {
    return super.HowToSound() + " You should put your tongue as close to the roof of the mouth "
        + "as possible without blocking airflow.";
  }

  @Override
  public List<String> getTags() {
    List<String> tags = super.getTags();
    tags.add("close");
    tags.add("high");
    return tags;
  }
}
