package Model.Phoneme.Vowels.ActualVowels;

import Model.Phoneme.Vowels.Backness.FrontDecorator;
import Model.Phoneme.Vowels.GenericVowel;
import Model.Phoneme.Vowels.Height.NearCloseDecorator;
import Model.Phoneme.Vowels.Roundedness.UnroundedDecorator;

public class NearcloseNearfrontUnroundedVowel extends ASpecificVowel {

  public NearcloseNearfrontUnroundedVowel() {
    attributes = new UnroundedDecorator(new FrontDecorator(new NearCloseDecorator(new GenericVowel())));
  }

  @Override
  public char getSymbol() {
    return 'ɪ';
  }

}

