package Model.Phoneme.Vowels.ActualVowels;

import Model.Phoneme.Vowels.Backness.FrontDecorator;
import Model.Phoneme.Vowels.GenericVowel;
import Model.Phoneme.Vowels.Height.OpenMidDecorator;
import Model.Phoneme.Vowels.Roundedness.RoundedDecorator;

public class OpenmidFrontRoundedVowel extends ASpecificVowel {

  public OpenmidFrontRoundedVowel() {
    attributes = new RoundedDecorator(new FrontDecorator(new OpenMidDecorator(new GenericVowel())));
  }

  @Override
  public char getSymbol() {
    return 'œ';
  }
}
