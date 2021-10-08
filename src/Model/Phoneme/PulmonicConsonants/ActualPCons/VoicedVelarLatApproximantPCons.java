package Model.Phoneme.PulmonicConsonants.ActualPCons;

import Model.Phoneme.PulmonicConsonants.GenericPCons;
import Model.Phoneme.PulmonicConsonants.MannerOfArticulation.LateralApproximantDecorator;
import Model.Phoneme.PulmonicConsonants.PlaceOfArticulation.VelarDecorator;
import Model.Phoneme.PulmonicConsonants.Voice.VoicedDecorator;

public class VoicedVelarLatApproximantPCons extends ASpecificPCons {

  public VoicedVelarLatApproximantPCons() {
    attributes = new VoicedDecorator(
        new VelarDecorator(new LateralApproximantDecorator(new GenericPCons())));
  }

  @Override
  public char getSymbol() {
    return 'ʟ';
  }
}
