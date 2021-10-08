package Model.Phoneme.PulmonicConsonants.ActualPCons;

import Model.Phoneme.PulmonicConsonants.GenericPCons;
import Model.Phoneme.PulmonicConsonants.MannerOfArticulation.PlosiveDecorator;
import Model.Phoneme.PulmonicConsonants.PlaceOfArticulation.RetroflexDecorator;
import Model.Phoneme.PulmonicConsonants.Voice.VoicelessDecorator;

public class VoicelessRetroflexPlosivesPCons extends ASpecificPCons {

  public VoicelessRetroflexPlosivesPCons() {
    attributes = new VoicelessDecorator(
        new RetroflexDecorator(new PlosiveDecorator(new GenericPCons())));
  }

  @Override
  public char getSymbol() {
    return 'ʈ';
  }
}
