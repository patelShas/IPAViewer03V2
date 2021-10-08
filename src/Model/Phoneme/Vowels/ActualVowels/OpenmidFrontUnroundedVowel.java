package Model.Phoneme.Vowels.ActualVowels;

import Model.Phoneme.Vowels.Backness.FrontDecorator;
import Model.Phoneme.Vowels.GenericVowel;
import Model.Phoneme.Vowels.Height.OpenMidDecorator;
import Model.Phoneme.Vowels.Roundedness.UnroundedDecorator;

public class OpenmidFrontUnroundedVowel extends ASpecificVowel {

  public OpenmidFrontUnroundedVowel() {
    attributes = new UnroundedDecorator(new FrontDecorator(new OpenMidDecorator(new GenericVowel())));
  }

  @Override
  public char getSymbol() {
    return 'ɛ';
  }
}


