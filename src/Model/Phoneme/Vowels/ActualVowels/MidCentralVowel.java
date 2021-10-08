package Model.Phoneme.Vowels.ActualVowels;

import Model.Phoneme.Vowels.Backness.CentralDecorator;
import Model.Phoneme.Vowels.GenericVowel;
import Model.Phoneme.Vowels.Height.MidDecorator;

public class MidCentralVowel extends ASpecificVowel {

  public MidCentralVowel() {
    attributes = new CentralDecorator(new MidDecorator(new GenericVowel()));
  }

  @Override
  public char getSymbol() {
    return 'ə';
  }
}
