package Model.Phoneme.PulmonicConsonants.ActualPCons;

import Model.Phoneme.PulmonicConsonants.GenericPCons;
import Model.Phoneme.PulmonicConsonants.MannerOfArticulation.TapFlapDecorator;
import Model.Phoneme.PulmonicConsonants.PlaceOfArticulation.LabioDentalDecorator;
import Model.Phoneme.PulmonicConsonants.Voice.VoicedDecorator;

public class VoicedLabiodentalTapFlapPCons extends ASpecificPCons {

  public VoicedLabiodentalTapFlapPCons() {
    attributes = new VoicedDecorator(
        new LabioDentalDecorator(new TapFlapDecorator(new GenericPCons())));
  }

  @Override
  public char getSymbol() {
    return 'ⱱ';
  }

}
