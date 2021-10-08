package Model.Phoneme.PulmonicConsonants.ActualPCons;

import Model.Phoneme.PulmonicConsonants.GenericPCons;
import Model.Phoneme.PulmonicConsonants.MannerOfArticulation.TrillDecorator;
import Model.Phoneme.PulmonicConsonants.PlaceOfArticulation.BilabialDecorator;
import Model.Phoneme.PulmonicConsonants.Voice.VoicedDecorator;

public class VoicedBilabialTrillPCons extends ASpecificPCons {

  public VoicedBilabialTrillPCons() {
    attributes = new VoicedDecorator(new BilabialDecorator(new TrillDecorator(new GenericPCons())));
  }

  @Override
  public char getSymbol() {
    return 'ʙ';
  }

}

