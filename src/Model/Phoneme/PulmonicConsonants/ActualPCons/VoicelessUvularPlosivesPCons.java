package Model.Phoneme.PulmonicConsonants.ActualPCons;

import Model.Phoneme.PulmonicConsonants.GenericPCons;
import Model.Phoneme.PulmonicConsonants.MannerOfArticulation.PlosiveDecorator;
import Model.Phoneme.PulmonicConsonants.PlaceOfArticulation.UvularDecorator;
import Model.Phoneme.PulmonicConsonants.Voice.VoicelessDecorator;

public class VoicelessUvularPlosivesPCons extends ASpecificPCons {

  public VoicelessUvularPlosivesPCons() {
    attributes = new VoicelessDecorator(
        new UvularDecorator(new PlosiveDecorator(new GenericPCons())));
  }

  @Override
  public char getSymbol() {
    return 'q';
  }
}
