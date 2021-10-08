package Model.Phoneme.Vowels.ActualVowels;

import Model.Phoneme.Vowels.Backness.BackDecorator;
import Model.Phoneme.Vowels.GenericVowel;
import Model.Phoneme.Vowels.Height.OpenMidDecorator;
import Model.Phoneme.Vowels.Roundedness.UnroundedDecorator;

public class OpenmidBackUnroundedVowel extends ASpecificVowel {

  public OpenmidBackUnroundedVowel() {
    attributes = new UnroundedDecorator(new BackDecorator(new OpenMidDecorator(new GenericVowel())));
  }

  @Override
  public char getSymbol() {
    return 'ʌ';
  }
}
