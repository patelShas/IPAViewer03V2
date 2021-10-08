package Model.Phoneme.PulmonicConsonants.ActualPCons;

import Model.Phoneme.PulmonicConsonants.GenericPCons;
import Model.Phoneme.PulmonicConsonants.MannerOfArticulation.LateralApproximantDecorator;
import Model.Phoneme.PulmonicConsonants.PlaceOfArticulation.PalatalDecorator;
import Model.Phoneme.PulmonicConsonants.Voice.VoicedDecorator;

public class VoicedPalatalLatApproximantPCons extends ASpecificPCons {

  public VoicedPalatalLatApproximantPCons() {
    attributes = new VoicedDecorator(
        new PalatalDecorator(new LateralApproximantDecorator(new GenericPCons())));
  }

  @Override
  public char getSymbol() {
    return 'ʎ';
  }
}
