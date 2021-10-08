package Model.Phoneme.Vowels.ActualVowels;

import Model.Phoneme.Vowels.Backness.CentralDecorator;
import Model.Phoneme.Vowels.GenericVowel;
import Model.Phoneme.Vowels.Height.CloseMidDecorator;
import Model.Phoneme.Vowels.Roundedness.UnroundedDecorator;

public class ClosemidCentralUnroundedVowel extends ASpecificVowel {

  public ClosemidCentralUnroundedVowel() {
    attributes = new UnroundedDecorator(new CentralDecorator(new CloseMidDecorator(new GenericVowel())));
  }

  @Override
  public char getSymbol() {
    return 'ɘ';
  }
}
