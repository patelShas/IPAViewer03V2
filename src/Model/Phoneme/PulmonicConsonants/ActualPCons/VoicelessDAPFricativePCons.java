package Model.Phoneme.PulmonicConsonants.ActualPCons;

import Model.Phoneme.PulmonicConsonants.GenericPCons;
import Model.Phoneme.PulmonicConsonants.MannerOfArticulation.LateralFricativeDecorator;
import Model.Phoneme.PulmonicConsonants.PlaceOfArticulation.DentalDecorator;
import Model.Phoneme.PulmonicConsonants.Voice.VoicelessDecorator;

public class VoicelessDAPFricativePCons extends ASpecificPCons {

  public VoicelessDAPFricativePCons() {
    attributes = new VoicelessDecorator(
        new DentalDecorator(new LateralFricativeDecorator(new GenericPCons())));
  }

  @Override
  public char getSymbol() {
    return 'ɬ';
  }
}
