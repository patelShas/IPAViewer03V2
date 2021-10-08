package Model.Phoneme.Vowels.ActualVowels;

import Model.Phoneme.Vowels.Backness.CentralDecorator;
import Model.Phoneme.Vowels.GenericVowel;
import Model.Phoneme.Vowels.Height.OpenMidDecorator;
import Model.Phoneme.Vowels.Roundedness.RoundedDecorator;

public class OpenmidCentralRoundedVowel extends ASpecificVowel {

  public OpenmidCentralRoundedVowel() {
    attributes = new RoundedDecorator(new CentralDecorator(new OpenMidDecorator(new GenericVowel())));
  }

  @Override
  public char getSymbol() {
    return 'ɞ';
  }
}
