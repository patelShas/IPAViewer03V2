package Model.Phoneme.PulmonicConsonants.ActualPCons;

import Model.Phoneme.PulmonicConsonants.GenericPCons;
import Model.Phoneme.PulmonicConsonants.MannerOfArticulation.PlosiveDecorator;
import Model.Phoneme.PulmonicConsonants.PlaceOfArticulation.UvularDecorator;
import Model.Phoneme.PulmonicConsonants.Voice.VoicedDecorator;

public class VoicedUvularPlosivesPCons extends ASpecificPCons {

  public VoicedUvularPlosivesPCons() {
    attributes = new VoicedDecorator(new UvularDecorator(new PlosiveDecorator(new GenericPCons())));
  }

  @Override
  public char getSymbol() {
    return 'ɢ';
  }
}
