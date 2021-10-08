package Model.Phoneme.PulmonicConsonants.ActualPCons;

import Model.Phoneme.PulmonicConsonants.GenericPCons;
import Model.Phoneme.PulmonicConsonants.MannerOfArticulation.FricativeDecorator;
import Model.Phoneme.PulmonicConsonants.PlaceOfArticulation.BilabialDecorator;
import Model.Phoneme.PulmonicConsonants.Voice.VoicelessDecorator;

public class VoicelessBilabialFricativePCons extends ASpecificPCons {

  public VoicelessBilabialFricativePCons() {
    attributes = new VoicelessDecorator(new BilabialDecorator(new FricativeDecorator(new GenericPCons())));
  }

  @Override
  public char getSymbol() {
    return 'ɸ';
  }
}

