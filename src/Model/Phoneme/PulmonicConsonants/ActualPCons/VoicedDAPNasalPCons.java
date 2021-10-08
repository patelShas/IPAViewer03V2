package Model.Phoneme.PulmonicConsonants.ActualPCons;

import Model.Phoneme.PulmonicConsonants.GenericPCons;
import Model.Phoneme.PulmonicConsonants.MannerOfArticulation.NasalDecorator;
import Model.Phoneme.PulmonicConsonants.PlaceOfArticulation.DentalAlveolarPostDecorator;
import Model.Phoneme.PulmonicConsonants.Voice.VoicedDecorator;

public class VoicedDAPNasalPCons extends ASpecificPCons {

  public VoicedDAPNasalPCons() {
    attributes = new VoicedDecorator(
        new DentalAlveolarPostDecorator(new NasalDecorator(new GenericPCons())));
  }

  @Override
  public char getSymbol() {
    return 'n';
  }

}
