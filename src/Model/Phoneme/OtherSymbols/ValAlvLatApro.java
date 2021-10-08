package Model.Phoneme.OtherSymbols;

import Model.Phoneme.IPhoneme;
import Model.Phoneme.PulmonicConsonants.ActualPCons.ASpecificPCons;
import Model.Phoneme.PulmonicConsonants.GenericPCons;
import Model.Phoneme.PulmonicConsonants.MannerOfArticulation.LateralApproximantDecorator;
import Model.Phoneme.PulmonicConsonants.PlaceOfArticulation.AlveolarDecorator;
import Model.References.PlaceOfArticulationInfo;

import java.util.List;

public class ValAlvLatApro extends ASpecificPCons {

  IPhoneme attributes;

  public ValAlvLatApro() {
    attributes = new AlveolarDecorator(new LateralApproximantDecorator(new GenericPCons()));
  }

  @Override
  public char getSymbol() {
    return 'ɫ';
  }

  @Override
  public String PhonemeDescriptor() {
    return "velarized " + attributes.PhonemeDescriptor();
  }

  @Override
  public String HowToSound() {
    return attributes.HowToSound() + ""
        + " This sound actually has a noticeable feature in that it also has a secondary " +
        new PlaceOfArticulationInfo().getName() + ". "
        + "Aside from the earlier mentioned one, you must also bring the back or root of your "
        + "tongue to approach your soft palate or the back of your tongue.";
  }

  @Override
  public List<String> getTags() {
    List<String> temp = attributes.getTags();
    temp.add("velar");
    return temp;
  }
}
