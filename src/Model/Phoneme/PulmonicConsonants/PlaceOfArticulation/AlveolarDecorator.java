package Model.Phoneme.PulmonicConsonants.PlaceOfArticulation;

import Model.Phoneme.PulmonicConsonants.APConsDecorator;
import Model.Phoneme.PulmonicConsonants.IPCons;
import Model.References.PlaceOfArticulationInfo;

import java.util.List;

public class AlveolarDecorator extends APConsDecorator {

  public AlveolarDecorator(IPCons baseDesc) {
    super(baseDesc);
  }

  @Override
  public String PhonemeDescriptor() {
    return "alveolar " + super.PhonemeDescriptor();
  }

  @Override
  public String HowToSound() {
    return super.HowToSound() + " You must put your tongue against the alveolar ridge "
        + "to create the "
        + new PlaceOfArticulationInfo().getName() + "."
        + " It is most common in English to use the tip of your tongue, but it also works, and is "
        + "more common in some languages, to use the flat area of the tongue just behind the tip.";
  }

  @Override
  public List<String> getTags() {
    List<String> temp = super.getTags();
    temp.add("alveolar");
    temp.add(new PlaceOfArticulationInfo().getName());
    return temp;
  }

}
