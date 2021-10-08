package Model.Phoneme.Vowels.ActualVowels;

import Model.Phoneme.Vowels.Backness.CentralDecorator;
import Model.Phoneme.Vowels.GenericVowel;
import Model.Phoneme.Vowels.Height.CloseDecorator;
import Model.Phoneme.Vowels.Roundedness.RoundedDecorator;

public class CloseBackRoundedVowel extends ASpecificVowel {

  public CloseBackRoundedVowel() {
    attributes = new RoundedDecorator(new CentralDecorator(new CloseDecorator(new GenericVowel())));
  }

  @Override
  public char getSymbol() {
    return 'u';
  }
}
