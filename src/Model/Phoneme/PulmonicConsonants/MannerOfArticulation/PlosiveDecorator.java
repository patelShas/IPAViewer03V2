package Model.Phoneme.PulmonicConsonants.MannerOfArticulation;

import Model.Phoneme.PulmonicConsonants.APConsDecorator;
import Model.Phoneme.PulmonicConsonants.IPCons;

import java.util.List;

public class PlosiveDecorator extends APConsDecorator {

  public PlosiveDecorator(IPCons baseDesc) {
    super(baseDesc);
  }

  @Override
  public String PhonemeDescriptor() {
    return "plosive " + super.PhonemeDescriptor();
  }

  @Override
  public String HowToSound() {
    return super.HowToSound() + " To create this sound you must for a moment block the vocal tract "
        + "so that all airflow ceases.";
  }

  @Override
  public List<String> getTags() {
    List<String> temp = super.getTags();
    temp.add("plosive");
    return temp;
  }
}

