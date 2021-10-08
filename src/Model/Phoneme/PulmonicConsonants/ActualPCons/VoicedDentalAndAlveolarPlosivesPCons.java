package Model.Phoneme.PulmonicConsonants.ActualPCons;

import Model.Phoneme.PulmonicConsonants.GenericPCons;
import Model.Phoneme.PulmonicConsonants.MannerOfArticulation.PlosiveDecorator;
import Model.Phoneme.PulmonicConsonants.PlaceOfArticulation.DentalAlveolarPostDecorator;
import Model.Phoneme.PulmonicConsonants.Voice.VoicedDecorator;

public class VoicedDentalAndAlveolarPlosivesPCons extends ASpecificPCons {

  public VoicedDentalAndAlveolarPlosivesPCons() {
    attributes = new VoicedDecorator(
        new DentalAlveolarPostDecorator(new PlosiveDecorator(new GenericPCons())));
  }

  @Override
  public char getSymbol() {
    return 'd';
  }
}
