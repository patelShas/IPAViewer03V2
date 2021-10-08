package Model.Phoneme.Vowels.ActualVowels;

import Model.Phoneme.Vowels.Backness.FrontDecorator;
import Model.Phoneme.Vowels.GenericVowel;
import Model.Phoneme.Vowels.Height.OpenDecorator;
import Model.Phoneme.Vowels.Roundedness.RoundedDecorator;

public class OpenFrontRoundedVowel extends ASpecificVowel {

  public OpenFrontRoundedVowel() {
    attributes = new RoundedDecorator(new FrontDecorator(new OpenDecorator(new GenericVowel())));
  }

  @Override
  public char getSymbol() {
    return 'ɶ';
  }
}
