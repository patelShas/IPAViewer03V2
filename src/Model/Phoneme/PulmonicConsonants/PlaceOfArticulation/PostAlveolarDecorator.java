package Model.Phoneme.PulmonicConsonants.PlaceOfArticulation;

import Model.Phoneme.PulmonicConsonants.APConsDecorator;
import Model.Phoneme.PulmonicConsonants.IPCons;
import Model.References.PlaceOfArticulationInfo;

import java.util.List;

public class PostAlveolarDecorator extends APConsDecorator {

  public PostAlveolarDecorator(IPCons baseDesc) {
    super(baseDesc);
  }

  @Override
  public String PhonemeDescriptor() {
    return "post-alveolar " + super.PhonemeDescriptor();
  }

  @Override
  public String HowToSound() {
    return super.HowToSound() + " You must put your tongue after the alveolar ridge "
        + "to create the "
        + new PlaceOfArticulationInfo().getName() + ". ";
  }

  @Override
  public List<String> getTags() {
    List<String> temp = super.getTags();
    temp.add("post-alveolar");
    temp.add(new PlaceOfArticulationInfo().getName());
    return temp;
  }

}
