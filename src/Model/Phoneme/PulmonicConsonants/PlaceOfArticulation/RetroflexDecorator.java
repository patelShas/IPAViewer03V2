package Model.Phoneme.PulmonicConsonants.PlaceOfArticulation;

import Model.Phoneme.PulmonicConsonants.APConsDecorator;
import Model.Phoneme.PulmonicConsonants.IPCons;
import Model.References.PlaceOfArticulationInfo;

import java.util.List;

public class RetroflexDecorator extends APConsDecorator {

  public RetroflexDecorator(IPCons baseDesc) {
    super(baseDesc);
  }

  @Override
  public String PhonemeDescriptor() {
    return "retroflex " + super.PhonemeDescriptor();
  }

  @Override
  public String HowToSound() {
    return super.HowToSound() + " To create the "
        + new PlaceOfArticulationInfo().getName()
        + ", you need to put your tongue against a spot between "
        + "your alveolar ridge and hard palate. "
        + "There is a wide range of what you can do for this. Your tongue can be flat, concave, or"
        + "even keep its tip curled. "
        + "The point of contact on your tongue can be with its tip, the blade of your tongue, "
        + "or even its underside. "
        + "The point of contact on your roof of your mouth can be with the alveolar ridge, "
        + "just behind it, "
        + "or even the hard palate. ";
  }

  @Override
  public List<String> getTags() {
    List<String> temp = super.getTags();
    temp.add("retroflex");
    temp.add(new PlaceOfArticulationInfo().getName());
    return temp;
  }
}
