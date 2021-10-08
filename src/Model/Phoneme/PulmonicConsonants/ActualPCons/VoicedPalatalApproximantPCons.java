package Model.Phoneme.PulmonicConsonants.ActualPCons;

import Model.Phoneme.PulmonicConsonants.GenericPCons;
import Model.Phoneme.PulmonicConsonants.MannerOfArticulation.ApproximantDecorator;
import Model.Phoneme.PulmonicConsonants.PlaceOfArticulation.PalatalDecorator;
import Model.Phoneme.PulmonicConsonants.Voice.VoicedDecorator;

public class VoicedPalatalApproximantPCons extends ASpecificPCons {

  public VoicedPalatalApproximantPCons() {
    attributes = new VoicedDecorator(
        new PalatalDecorator(new ApproximantDecorator(new GenericPCons())));
  }

  @Override
  public char getSymbol() {
    return 'j';
  }
}
