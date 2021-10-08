package Model.Phoneme.PulmonicConsonants.MannerOfArticulation;

import Model.Phoneme.PulmonicConsonants.APConsDecorator;
import Model.Phoneme.PulmonicConsonants.IPCons;

import java.util.List;

public class LateralApproximantDecorator extends APConsDecorator {

  public LateralApproximantDecorator(IPCons baseDesc) {
    super(baseDesc);
  }

  @Override
  public String PhonemeDescriptor() {
    return "lateral approximant " + super.PhonemeDescriptor();
  }

  @Override
  public String HowToSound() {
    return super.HowToSound() + " To create this sound you should "
        + "contract the sides of your tongue away from your teeth, allowing the airflow to move "
        + "between your tongue and teeth.";
  }

  @Override
  public List<String> getTags() {
    List<String> temp = super.getTags();
    temp.add("lateral approximant");
    return temp;
  }
}
