package Model.Phoneme.PulmonicConsonants.PlaceOfArticulation;

import Model.Phoneme.PulmonicConsonants.APConsDecorator;
import Model.Phoneme.PulmonicConsonants.IPCons;
import Model.References.PlaceOfArticulationInfo;

import java.util.List;

public class GlottalDecorator extends APConsDecorator {

  public GlottalDecorator(IPCons baseDesc) {
    super(baseDesc);
  }

  @Override
  public String PhonemeDescriptor() {
    return "glottal " + super.PhonemeDescriptor();
  }

  @Override
  public String HowToSound() {
    return super.HowToSound() + " To create the "
        + new PlaceOfArticulationInfo().getName()
        + ", you need to use your glottis. This consonant doesn't really have a point of contact"
        + " besides the glottis, but it is the flow of air and using your glottis that is "
        + "important. ";
  }

  @Override
  public List<String> getTags() {
    List<String> temp = super.getTags();
    temp.add("glottal");
    temp.add(new PlaceOfArticulationInfo().getName());
    return temp;
  }
}
