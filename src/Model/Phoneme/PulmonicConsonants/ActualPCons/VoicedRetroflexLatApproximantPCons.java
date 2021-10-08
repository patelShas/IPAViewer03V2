package Model.Phoneme.PulmonicConsonants.ActualPCons;

import Model.Phoneme.PulmonicConsonants.GenericPCons;
import Model.Phoneme.PulmonicConsonants.MannerOfArticulation.LateralApproximantDecorator;
import Model.Phoneme.PulmonicConsonants.PlaceOfArticulation.RetroflexDecorator;
import Model.Phoneme.PulmonicConsonants.Voice.VoicedDecorator;

public class VoicedRetroflexLatApproximantPCons extends ASpecificPCons {

  public VoicedRetroflexLatApproximantPCons() {
    attributes = new VoicedDecorator(
        new RetroflexDecorator(new LateralApproximantDecorator(new GenericPCons())));
  }

  @Override
  public char getSymbol() {
    return 'ɭ';
  }
}
