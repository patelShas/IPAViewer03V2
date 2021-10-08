package Model.Phoneme.PulmonicConsonants.ActualPCons;

import Model.Phoneme.PulmonicConsonants.GenericPCons;
import Model.Phoneme.PulmonicConsonants.MannerOfArticulation.FricativeDecorator;
import Model.Phoneme.PulmonicConsonants.PlaceOfArticulation.UvularDecorator;
import Model.Phoneme.PulmonicConsonants.Voice.VoicedDecorator;

public class VoicedUvularFricativePCons extends ASpecificPCons {

  public VoicedUvularFricativePCons() {
    attributes = new VoicedDecorator(
        new UvularDecorator(new FricativeDecorator(new GenericPCons())));
  }

  @Override
  public char getSymbol() {
    return 'ʁ';
  }
}
