package Model.Phoneme.PulmonicConsonants.ActualPCons;

import Model.Phoneme.PulmonicConsonants.GenericPCons;
import Model.Phoneme.PulmonicConsonants.MannerOfArticulation.LateralFricativeDecorator;
import Model.Phoneme.PulmonicConsonants.PlaceOfArticulation.DentalDecorator;
import Model.Phoneme.PulmonicConsonants.Voice.VoicedDecorator;

public class VoicedDAPLateralFricativePCons extends ASpecificPCons {

  public VoicedDAPLateralFricativePCons() {
    attributes = new VoicedDecorator(
        new DentalDecorator(new LateralFricativeDecorator(new GenericPCons())));
  }

  @Override
  public char getSymbol() {
    return 'ɮ';
  }
}
