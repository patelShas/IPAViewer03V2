package Model.Phoneme.Vowels.ActualVowels;

import Model.Phoneme.Vowels.Backness.FrontDecorator;
import Model.Phoneme.Vowels.GenericVowel;
import Model.Phoneme.Vowels.Height.CloseMidDecorator;
import Model.Phoneme.Vowels.Roundedness.UnroundedDecorator;

public class ClosemidFrontUnroundedVowel extends ASpecificVowel {

  public ClosemidFrontUnroundedVowel() {
    attributes = new UnroundedDecorator(new FrontDecorator(new CloseMidDecorator(new GenericVowel())));
  }

  @Override
  public char getSymbol() {
    return 'e';
  }
}


