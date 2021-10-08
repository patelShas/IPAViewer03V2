package Model.Phoneme.Vowels.ActualVowels;

import Model.Phoneme.Vowels.Backness.BackDecorator;
import Model.Phoneme.Vowels.GenericVowel;
import Model.Phoneme.Vowels.Height.CloseMidDecorator;
import Model.Phoneme.Vowels.Roundedness.RoundedDecorator;

public class ClosemidBackRoundedVowel extends ASpecificVowel {

  public ClosemidBackRoundedVowel() {
    attributes = new RoundedDecorator(new BackDecorator(new CloseMidDecorator(new GenericVowel())));
  }

  @Override
  public char getSymbol() {
    return 'o';
  }
}
