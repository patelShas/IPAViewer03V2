package Model.Phoneme.PulmonicConsonants.ActualPCons;

import Model.Phoneme.PulmonicConsonants.GenericPCons;
import Model.Phoneme.PulmonicConsonants.MannerOfArticulation.ApproximantDecorator;
import Model.Phoneme.PulmonicConsonants.PlaceOfArticulation.RetroflexDecorator;
import Model.Phoneme.PulmonicConsonants.Voice.VoicedDecorator;

public class VoicedRetroflexApproximantPCons extends ASpecificPCons {

  public VoicedRetroflexApproximantPCons() {
    attributes = new VoicedDecorator(
        new RetroflexDecorator(new ApproximantDecorator(new GenericPCons())));
  }

  @Override
  public char getSymbol() {
    return 'ɻ';
  }
}
