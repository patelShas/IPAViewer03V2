package Model.Phoneme.PulmonicConsonants.ActualPCons;

import Model.Phoneme.PulmonicConsonants.GenericPCons;
import Model.Phoneme.PulmonicConsonants.MannerOfArticulation.TapFlapDecorator;
import Model.Phoneme.PulmonicConsonants.PlaceOfArticulation.DentalAlveolarPostDecorator;
import Model.Phoneme.PulmonicConsonants.Voice.VoicedDecorator;

public class VoicedDAPTapFlapPCons extends ASpecificPCons {

  public VoicedDAPTapFlapPCons() {
    attributes = new VoicedDecorator(
        new DentalAlveolarPostDecorator(new TapFlapDecorator(new GenericPCons())));
  }

  @Override
  public char getSymbol() {
    return 'ɾ';
  }

}
