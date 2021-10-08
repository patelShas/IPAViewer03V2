package Model.Phoneme.PulmonicConsonants.PlaceOfArticulation;

import Model.Phoneme.PulmonicConsonants.APConsDecorator;
import Model.Phoneme.PulmonicConsonants.IPCons;
import Model.References.PlaceOfArticulationInfo;

import java.util.List;

public class DentalAlveolarPostDecorator extends APConsDecorator {

  public DentalAlveolarPostDecorator(IPCons baseDesc) {
    super(baseDesc);
  }

  @Override
  public String PhonemeDescriptor() {
    return "dental and alveolar " + super.PhonemeDescriptor();
  }

  @Override
  public String HowToSound() {
    return super.HowToSound() + " You can "
        + "create the "
        + new PlaceOfArticulationInfo().getName()
        + " by putting together your tongue and the back of your upper teeth, "
        + "the gum ridge right behind your upper teeth, "
        + "or the area right behind that gum ridge.";
  }

  @Override
  public List<String> getTags() {
    List<String> temp = super.getTags();
    temp.add("dental");
    temp.add("alveolar");
    temp.add("post-alveolar");
    temp.add(new PlaceOfArticulationInfo().getName());
    return temp;
  }

}

