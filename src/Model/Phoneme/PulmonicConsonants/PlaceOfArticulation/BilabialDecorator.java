package Model.Phoneme.PulmonicConsonants.PlaceOfArticulation;

import Model.Phoneme.PulmonicConsonants.APConsDecorator;
import Model.Phoneme.PulmonicConsonants.IPCons;
import Model.References.PlaceOfArticulationInfo;

import java.util.List;

public class BilabialDecorator extends APConsDecorator {

  public BilabialDecorator(IPCons baseDesc) {
    super(baseDesc);
  }

  @Override
  public String PhonemeDescriptor() {
    return "bilabial " + super.PhonemeDescriptor();
  }

  @Override
  public String HowToSound() {
    return super.HowToSound() + " You must put both your lips together to create the "
        + new PlaceOfArticulationInfo().getName() + ".";
  }

  @Override
  public List<String> getTags() {
    List<String> temp  = super.getTags();
    temp.add("bilabial");
    temp.add(new PlaceOfArticulationInfo().getName());
    return temp;
  }
}

