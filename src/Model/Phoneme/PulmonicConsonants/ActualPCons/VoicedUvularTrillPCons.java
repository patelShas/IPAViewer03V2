package Model.Phoneme.PulmonicConsonants.ActualPCons;

import Model.Phoneme.PulmonicConsonants.GenericPCons;
import Model.Phoneme.PulmonicConsonants.MannerOfArticulation.TrillDecorator;
import Model.Phoneme.PulmonicConsonants.PlaceOfArticulation.UvularDecorator;
import Model.Phoneme.PulmonicConsonants.Voice.VoicedDecorator;

public class VoicedUvularTrillPCons extends ASpecificPCons {

  public VoicedUvularTrillPCons() {
    attributes = new VoicedDecorator(new UvularDecorator(new TrillDecorator(new GenericPCons())));
  }

  @Override
  public char getSymbol() {
    return 'ʀ';
  }

}
