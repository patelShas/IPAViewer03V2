package Model.Phoneme.PulmonicConsonants.PlaceOfArticulation;

import Model.Phoneme.PulmonicConsonants.APConsDecorator;
import Model.Phoneme.PulmonicConsonants.IPCons;
import Model.References.PlaceOfArticulationInfo;

import java.util.List;

public class PharyngealDecorator extends APConsDecorator {

  public PharyngealDecorator(IPCons baseDesc) {
    super(baseDesc);
  }

  @Override
  public String PhonemeDescriptor() {
    return "pharyngeal " + super.PhonemeDescriptor();
  }

  @Override
  public String HowToSound() {
    return super.HowToSound() + " This sound is made using your pharynx. "
        + " To create the "
        + new PlaceOfArticulationInfo().getName()
        + ", you need to press the root of your tongue against your mid to upper throat, "
        + "behind the nasal cavity. ";
  }

  @Override
  public List<String> getTags() {
    List<String> temp = super.getTags();
    temp.add("pharyngeal");
    temp.add(new PlaceOfArticulationInfo().getName());
    return temp;
  }
}
