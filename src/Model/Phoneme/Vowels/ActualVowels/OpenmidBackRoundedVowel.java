package Model.Phoneme.Vowels.ActualVowels;

import Model.Phoneme.Vowels.Backness.BackDecorator;
import Model.Phoneme.Vowels.GenericVowel;
import Model.Phoneme.Vowels.Height.OpenMidDecorator;
import Model.Phoneme.Vowels.Roundedness.RoundedDecorator;

public class OpenmidBackRoundedVowel extends ASpecificVowel {

  public OpenmidBackRoundedVowel() {
    attributes = new RoundedDecorator(new BackDecorator(new OpenMidDecorator(new GenericVowel())));
  }

  @Override
  public char getSymbol() {
    return 'ɔ';
  }
}
