package Model.Phoneme.PulmonicConsonants.ActualPCons;

import Model.Phoneme.PulmonicConsonants.GenericPCons;
import Model.Phoneme.PulmonicConsonants.MannerOfArticulation.PlosiveDecorator;
import Model.Phoneme.PulmonicConsonants.PlaceOfArticulation.BilabialDecorator;
import Model.Phoneme.PulmonicConsonants.Voice.VoicedDecorator;

public class VoicedBilabialPlosivePCons extends ASpecificPCons {

  public VoicedBilabialPlosivePCons() {
    attributes = new VoicedDecorator(
        new BilabialDecorator(new PlosiveDecorator(new GenericPCons())));
  }

  @Override
  public char getSymbol() {
    return 'b';
  }
}
