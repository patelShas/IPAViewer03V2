package Model.Phoneme.PulmonicConsonants.ActualPCons;

import Model.Phoneme.PulmonicConsonants.GenericPCons;
import Model.Phoneme.PulmonicConsonants.MannerOfArticulation.LateralApproximantDecorator;
import Model.Phoneme.PulmonicConsonants.PlaceOfArticulation.DentalAlveolarPostDecorator;
import Model.Phoneme.PulmonicConsonants.Voice.VoicedDecorator;

public class VoicedDAPLatApproximantPCons extends ASpecificPCons {

  public VoicedDAPLatApproximantPCons() {
    attributes = new VoicedDecorator(
        new DentalAlveolarPostDecorator(new LateralApproximantDecorator(new GenericPCons())));
  }

  @Override
  public char getSymbol() {
    return 'l';
  }
}
