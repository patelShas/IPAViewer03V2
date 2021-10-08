package Model.Phoneme.PulmonicConsonants.ActualPCons;

import Model.Phoneme.PulmonicConsonants.GenericPCons;
import Model.Phoneme.PulmonicConsonants.MannerOfArticulation.PlosiveDecorator;
import Model.Phoneme.PulmonicConsonants.PlaceOfArticulation.BilabialDecorator;
import Model.Phoneme.PulmonicConsonants.Voice.VoicelessDecorator;

public class VoicelessBilabialPlosivePCons extends ASpecificPCons {

  public VoicelessBilabialPlosivePCons() {
    attributes = new VoicelessDecorator(new BilabialDecorator(new PlosiveDecorator(new GenericPCons())));
  }

  @Override
  public char getSymbol() {
    return 'p';
  }
}

