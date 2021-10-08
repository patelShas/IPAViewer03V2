package Model.Phoneme.Vowels.ActualVowels;

import Model.Phoneme.Vowels.Backness.FrontDecorator;
import Model.Phoneme.Vowels.GenericVowel;
import Model.Phoneme.Vowels.Height.CloseDecorator;
import Model.Phoneme.Vowels.Roundedness.RoundedDecorator;

public class CloseFrontRoundedVowel extends ASpecificVowel {

  public CloseFrontRoundedVowel() {
    attributes = new RoundedDecorator(new FrontDecorator(new CloseDecorator(new GenericVowel())));
  }

  @Override
  public char getSymbol() {
    return 'y';
  }
}
