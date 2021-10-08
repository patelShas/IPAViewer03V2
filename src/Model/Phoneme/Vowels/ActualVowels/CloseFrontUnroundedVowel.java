package Model.Phoneme.Vowels.ActualVowels;

import Model.Phoneme.Vowels.Backness.FrontDecorator;
import Model.Phoneme.Vowels.GenericVowel;
import Model.Phoneme.Vowels.Height.CloseDecorator;
import Model.Phoneme.Vowels.Roundedness.UnroundedDecorator;

public class CloseFrontUnroundedVowel extends ASpecificVowel {

  public CloseFrontUnroundedVowel() {
    attributes = new UnroundedDecorator(new FrontDecorator(new CloseDecorator(new GenericVowel())));
  }

  @Override
  public char getSymbol() {
    return 'i';
  }
}
