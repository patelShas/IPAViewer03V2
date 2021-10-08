package Model.Phoneme.PulmonicConsonants.ActualPCons;

import Model.Phoneme.PulmonicConsonants.GenericPCons;
import Model.Phoneme.PulmonicConsonants.MannerOfArticulation.TrillDecorator;
import Model.Phoneme.PulmonicConsonants.PlaceOfArticulation.DentalAlveolarPostDecorator;
import Model.Phoneme.PulmonicConsonants.Voice.VoicedDecorator;

public class VoicedDAPTrillPCons extends ASpecificPCons {

  public VoicedDAPTrillPCons() {
    attributes = new VoicedDecorator(
        new DentalAlveolarPostDecorator(new TrillDecorator(new GenericPCons())));
  }

  @Override
  public char getSymbol() {
    return 'r';
  }

}
