package Model.Phoneme.Vowels.ActualVowels;

import Model.Phoneme.Vowels.Backness.FrontDecorator;
import Model.Phoneme.Vowels.GenericVowel;
import Model.Phoneme.Vowels.Height.NearCloseDecorator;
import Model.Phoneme.Vowels.Roundedness.UnroundedDecorator;

public class NearcloseNearfrontRoundedVowel extends ASpecificVowel {

  public NearcloseNearfrontRoundedVowel() {
    attributes = new UnroundedDecorator(new FrontDecorator(new NearCloseDecorator(new GenericVowel())));
  }

  @Override
  public char getSymbol() {
    return 'ʏ';
  }

}
