package Model.Phoneme.PulmonicConsonants.ActualPCons;

import Model.Phoneme.PulmonicConsonants.GenericPCons;
import Model.Phoneme.PulmonicConsonants.MannerOfArticulation.FricativeDecorator;
import Model.Phoneme.PulmonicConsonants.PlaceOfArticulation.AlveolarDecorator;
import Model.Phoneme.PulmonicConsonants.Voice.VoicedDecorator;

public class VoicedAlveolarFricativePCons extends ASpecificPCons {

  public VoicedAlveolarFricativePCons() {
    attributes = new VoicedDecorator(
        new AlveolarDecorator(new FricativeDecorator(new GenericPCons())));
  }

  @Override
  public char getSymbol() {
    return 'z';
  }
}
