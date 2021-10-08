package Model.Phoneme.PulmonicConsonants.ActualPCons;

import Model.Phoneme.PulmonicConsonants.GenericPCons;
import Model.Phoneme.PulmonicConsonants.MannerOfArticulation.ApproximantDecorator;
import Model.Phoneme.PulmonicConsonants.PlaceOfArticulation.VelarDecorator;
import Model.Phoneme.PulmonicConsonants.Voice.VoicedDecorator;

public class VoicedVelarApproximantPCons extends ASpecificPCons {

  public VoicedVelarApproximantPCons() {
    attributes = new VoicedDecorator(
        new VelarDecorator(new ApproximantDecorator(new GenericPCons())));
  }

  @Override
  public char getSymbol() {
    return 'ɰ';
  }
}
