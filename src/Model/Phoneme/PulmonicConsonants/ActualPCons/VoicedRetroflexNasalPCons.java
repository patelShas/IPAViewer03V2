package Model.Phoneme.PulmonicConsonants.ActualPCons;

import Model.Phoneme.PulmonicConsonants.GenericPCons;
import Model.Phoneme.PulmonicConsonants.MannerOfArticulation.NasalDecorator;
import Model.Phoneme.PulmonicConsonants.PlaceOfArticulation.RetroflexDecorator;
import Model.Phoneme.PulmonicConsonants.Voice.VoicedDecorator;

public class VoicedRetroflexNasalPCons extends ASpecificPCons {

  public VoicedRetroflexNasalPCons() {
    attributes = new VoicedDecorator(
        new RetroflexDecorator(new NasalDecorator(new GenericPCons())));
  }

  @Override
  public char getSymbol() {
    return 'ɳ';
  }

}
