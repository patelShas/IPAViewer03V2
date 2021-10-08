package Model.Phoneme.Vowels.ActualVowels;

import Model.Phoneme.Vowels.Backness.CentralDecorator;
import Model.Phoneme.Vowels.GenericVowel;
import Model.Phoneme.Vowels.Height.CloseDecorator;
import Model.Phoneme.Vowels.Roundedness.UnroundedDecorator;

public class CloseCentralUnroundedVowel extends ASpecificVowel {

  public CloseCentralUnroundedVowel() {
    attributes = new UnroundedDecorator(new CentralDecorator(new CloseDecorator(new GenericVowel())));
  }

  @Override
  public char getSymbol() {
    return 'ɨ';
  }
}
