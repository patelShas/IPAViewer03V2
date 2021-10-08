package Model.Phoneme.PulmonicConsonants.ActualPCons;

import Model.Phoneme.PulmonicConsonants.GenericPCons;
import Model.Phoneme.PulmonicConsonants.MannerOfArticulation.FricativeDecorator;
import Model.Phoneme.PulmonicConsonants.PlaceOfArticulation.VelarDecorator;
import Model.Phoneme.PulmonicConsonants.Voice.VoicelessDecorator;

public class VoicelessVelarFricativePCons extends ASpecificPCons {

  public VoicelessVelarFricativePCons() {
    attributes = new VoicelessDecorator(
        new VelarDecorator(new FricativeDecorator(new GenericPCons())));
  }

  @Override
  public char getSymbol() {
    return 'x';
  }
}
