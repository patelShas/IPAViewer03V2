package Model.Phoneme.Vowels.ActualVowels;

import Model.Phoneme.Vowels.Backness.CentralDecorator;
import Model.Phoneme.Vowels.GenericVowel;
import Model.Phoneme.Vowels.Height.NearOpenDecorator;

public class NearopenCentralVowel extends ASpecificVowel {

  public NearopenCentralVowel() {
    attributes = new CentralDecorator(new NearOpenDecorator(new GenericVowel()));
  }

  @Override
  public char getSymbol() {
    return 'ɐ';
  }
}
