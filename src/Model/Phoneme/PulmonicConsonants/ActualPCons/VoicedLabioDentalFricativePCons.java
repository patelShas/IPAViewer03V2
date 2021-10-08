package Model.Phoneme.PulmonicConsonants.ActualPCons;

import Model.Phoneme.PulmonicConsonants.GenericPCons;
import Model.Phoneme.PulmonicConsonants.MannerOfArticulation.FricativeDecorator;
import Model.Phoneme.PulmonicConsonants.PlaceOfArticulation.LabioDentalDecorator;
import Model.Phoneme.PulmonicConsonants.Voice.VoicedDecorator;

public class VoicedLabioDentalFricativePCons extends ASpecificPCons {

  public VoicedLabioDentalFricativePCons() {
    attributes = new VoicedDecorator(
        new LabioDentalDecorator(new FricativeDecorator(new GenericPCons())));
  }

  @Override
  public char getSymbol() {
    return 'v';
  }
}
