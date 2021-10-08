package Model.Phoneme.PulmonicConsonants.ActualPCons;

import Model.Phoneme.PulmonicConsonants.GenericPCons;
import Model.Phoneme.PulmonicConsonants.MannerOfArticulation.TapFlapDecorator;
import Model.Phoneme.PulmonicConsonants.PlaceOfArticulation.RetroflexDecorator;
import Model.Phoneme.PulmonicConsonants.Voice.VoicedDecorator;

public class VoicedRetroflexTapFlapPCons extends ASpecificPCons {

  public VoicedRetroflexTapFlapPCons() {
    attributes = new VoicedDecorator(
        new RetroflexDecorator(new TapFlapDecorator(new GenericPCons())));
  }

  @Override
  public char getSymbol() {
    return 'ɽ';
  }

}
