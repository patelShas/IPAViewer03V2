package Model.Phoneme.Vowels.ActualVowels;

import Model.Phoneme.Vowels.Backness.BackDecorator;
import Model.Phoneme.Vowels.GenericVowel;
import Model.Phoneme.Vowels.Height.CloseMidDecorator;
import Model.Phoneme.Vowels.Roundedness.UnroundedDecorator;

public class ClosemidBackUnroundedVowel extends ASpecificVowel {

  public ClosemidBackUnroundedVowel() {
    attributes = new UnroundedDecorator(new BackDecorator(new CloseMidDecorator(new GenericVowel())));
  }

  @Override
  public char getSymbol() {
    return 'ɤ';
  }
}
