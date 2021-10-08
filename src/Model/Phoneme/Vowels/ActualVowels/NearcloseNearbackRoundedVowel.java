package Model.Phoneme.Vowels.ActualVowels;

import Model.Phoneme.Vowels.Backness.BackDecorator;
import Model.Phoneme.Vowels.GenericVowel;
import Model.Phoneme.Vowels.Height.NearCloseDecorator;
import Model.Phoneme.Vowels.Roundedness.UnroundedDecorator;

public class NearcloseNearbackRoundedVowel extends ASpecificVowel {

  public NearcloseNearbackRoundedVowel() {
    attributes = new UnroundedDecorator(new BackDecorator(new NearCloseDecorator(new GenericVowel())));
  }

  @Override
  public char getSymbol() {
    return 'ʊ';
  }

}
