package Model.Phoneme.PulmonicConsonants.MannerOfArticulation;

import Model.Phoneme.PulmonicConsonants.APConsDecorator;
import Model.Phoneme.PulmonicConsonants.IPCons;

import java.util.List;

public class NasalDecorator extends APConsDecorator {

  public NasalDecorator(IPCons baseDesc) {
    super(baseDesc);
  }

  @Override
  public String PhonemeDescriptor() {
    return "nasal " + super.PhonemeDescriptor();
  }

  @Override
  public String HowToSound() {
    return super.HowToSound() + " To create this sound you must lower your soft palate so that "
        + "your airflow goes mostly through your nose.";
  }

  @Override
  public List<String> getTags() {
    List<String> temp = super.getTags();
    temp.add("nasal");
    return temp;
  }
}
