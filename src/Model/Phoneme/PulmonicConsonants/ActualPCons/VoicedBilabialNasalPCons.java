package Model.Phoneme.PulmonicConsonants.ActualPCons;

import Model.Phoneme.PulmonicConsonants.GenericPCons;
import Model.Phoneme.PulmonicConsonants.MannerOfArticulation.NasalDecorator;
import Model.Phoneme.PulmonicConsonants.PlaceOfArticulation.BilabialDecorator;
import Model.Phoneme.PulmonicConsonants.Voice.VoicedDecorator;

public class VoicedBilabialNasalPCons extends ASpecificPCons{

  public VoicedBilabialNasalPCons() {
    attributes = new VoicedDecorator(new BilabialDecorator(new NasalDecorator(new GenericPCons())));
  }

  @Override
  public char getSymbol() {
    return 'm';
  }

}

