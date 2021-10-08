package Model.Phoneme.Vowels.ActualVowels;

import Model.Phoneme.Vowels.Backness.CentralDecorator;
import Model.Phoneme.Vowels.GenericVowel;
import Model.Phoneme.Vowels.Height.CloseMidDecorator;
import Model.Phoneme.Vowels.Roundedness.RoundedDecorator;

public class ClosemidCentralRoundedVowel extends ASpecificVowel {

  public ClosemidCentralRoundedVowel() {
    attributes = new RoundedDecorator(new CentralDecorator(new CloseMidDecorator(new GenericVowel())));
  }

  @Override
  public char getSymbol() {
    return 'ɵ';
  }
}
