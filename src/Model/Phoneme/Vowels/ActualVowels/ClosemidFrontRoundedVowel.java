package Model.Phoneme.Vowels.ActualVowels;

import Model.Phoneme.Vowels.Backness.FrontDecorator;
import Model.Phoneme.Vowels.GenericVowel;
import Model.Phoneme.Vowels.Height.CloseMidDecorator;
import Model.Phoneme.Vowels.Roundedness.RoundedDecorator;

public class ClosemidFrontRoundedVowel extends ASpecificVowel {

  public ClosemidFrontRoundedVowel() {
    attributes = new RoundedDecorator(new FrontDecorator(new CloseMidDecorator(new GenericVowel())));
  }

  @Override
  public char getSymbol() {
    return 'ø';
  }
}
