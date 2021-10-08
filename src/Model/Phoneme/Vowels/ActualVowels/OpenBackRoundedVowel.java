package Model.Phoneme.Vowels.ActualVowels;

import Model.Phoneme.Vowels.Backness.BackDecorator;
import Model.Phoneme.Vowels.GenericVowel;
import Model.Phoneme.Vowels.Height.OpenDecorator;
import Model.Phoneme.Vowels.Roundedness.RoundedDecorator;

public class OpenBackRoundedVowel extends ASpecificVowel {

  public OpenBackRoundedVowel() {
    attributes = new RoundedDecorator(new BackDecorator(new OpenDecorator(new GenericVowel())));
  }

  @Override
  public char getSymbol() {
    return 'ɒ';
  }
}
