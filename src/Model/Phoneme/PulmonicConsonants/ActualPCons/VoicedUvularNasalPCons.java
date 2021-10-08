package Model.Phoneme.PulmonicConsonants.ActualPCons;

import Model.Phoneme.PulmonicConsonants.GenericPCons;
import Model.Phoneme.PulmonicConsonants.MannerOfArticulation.NasalDecorator;
import Model.Phoneme.PulmonicConsonants.PlaceOfArticulation.UvularDecorator;
import Model.Phoneme.PulmonicConsonants.Voice.VoicedDecorator;

public class VoicedUvularNasalPCons extends ASpecificPCons {

  public VoicedUvularNasalPCons() {
    attributes = new VoicedDecorator(new UvularDecorator(new NasalDecorator(new GenericPCons())));
  }

  @Override
  public char getSymbol() {
    return 'ɴ';
  }

}
