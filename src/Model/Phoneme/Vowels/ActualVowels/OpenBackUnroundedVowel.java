package Model.Phoneme.Vowels.ActualVowels;

import Model.Phoneme.Vowels.Backness.BackDecorator;
import Model.Phoneme.Vowels.GenericVowel;
import Model.Phoneme.Vowels.Height.OpenDecorator;
import Model.Phoneme.Vowels.Roundedness.UnroundedDecorator;

public class OpenBackUnroundedVowel extends ASpecificVowel {

  public OpenBackUnroundedVowel() {
    attributes = new UnroundedDecorator(new BackDecorator(new OpenDecorator(new GenericVowel())));
  }

  @Override
  public char getSymbol() {
    return 'ɑ';
  }
}
