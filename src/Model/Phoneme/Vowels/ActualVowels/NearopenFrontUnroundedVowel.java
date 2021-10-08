package Model.Phoneme.Vowels.ActualVowels;

import Model.Phoneme.Vowels.Backness.FrontDecorator;
import Model.Phoneme.Vowels.GenericVowel;
import Model.Phoneme.Vowels.Height.NearOpenDecorator;
import Model.Phoneme.Vowels.Roundedness.UnroundedDecorator;

public class NearopenFrontUnroundedVowel extends ASpecificVowel {

  public NearopenFrontUnroundedVowel() {
    attributes = new UnroundedDecorator(new FrontDecorator(new NearOpenDecorator(new GenericVowel())));
  }

  @Override
  public char getSymbol() {
    return 'æ';
  }
}

