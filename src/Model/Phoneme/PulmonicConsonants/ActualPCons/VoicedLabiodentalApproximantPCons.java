package Model.Phoneme.PulmonicConsonants.ActualPCons;

import Model.Phoneme.PulmonicConsonants.GenericPCons;
import Model.Phoneme.PulmonicConsonants.MannerOfArticulation.ApproximantDecorator;
import Model.Phoneme.PulmonicConsonants.PlaceOfArticulation.LabioDentalDecorator;
import Model.Phoneme.PulmonicConsonants.Voice.VoicedDecorator;

public class VoicedLabiodentalApproximantPCons extends ASpecificPCons {

  public VoicedLabiodentalApproximantPCons() {
    attributes = new VoicedDecorator(new LabioDentalDecorator(new ApproximantDecorator(new GenericPCons())));
  }

  @Override
  public char getSymbol() {
    return 'ʋ';
  }
}

// /////////////////////////////////////////////////////////////////////////////

