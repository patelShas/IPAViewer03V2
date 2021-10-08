package Model.Phoneme.PulmonicConsonants.ActualPCons;

import Model.Phoneme.PulmonicConsonants.GenericPCons;
import Model.Phoneme.PulmonicConsonants.MannerOfArticulation.NasalDecorator;
import Model.Phoneme.PulmonicConsonants.PlaceOfArticulation.PalatalDecorator;
import Model.Phoneme.PulmonicConsonants.Voice.VoicedDecorator;

public class VoicedPalatalNasalPCons extends ASpecificPCons {

  public VoicedPalatalNasalPCons() {
    attributes = new VoicedDecorator(new PalatalDecorator(new NasalDecorator(new GenericPCons())));
  }

  @Override
  public char getSymbol() {
    return 'ɲ';
  }

}
