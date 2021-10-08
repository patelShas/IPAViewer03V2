package Model.Phoneme.Vowels.ActualVowels;

import Model.Phoneme.Vowels.Backness.FrontDecorator;
import Model.Phoneme.Vowels.GenericVowel;
import Model.Phoneme.Vowels.Height.OpenDecorator;
import Model.Phoneme.Vowels.Roundedness.UnroundedDecorator;

public class OpenFrontUnroundedVowel extends ASpecificVowel {

  public OpenFrontUnroundedVowel() {
    attributes = new UnroundedDecorator(new FrontDecorator(new OpenDecorator(new GenericVowel())));
  }

  @Override
  public char getSymbol() {
    return 'a';
  }
}

