package Model.Phoneme.Vowels.ActualVowels;

import Model.Phoneme.Vowels.Backness.CentralDecorator;
import Model.Phoneme.Vowels.GenericVowel;
import Model.Phoneme.Vowels.Height.OpenDecorator;
import Model.Phoneme.Vowels.Roundedness.UnroundedDecorator;

public class OpenCentralUnroundVowel extends ASpecificVowel {

  public OpenCentralUnroundVowel() {
    attributes = new UnroundedDecorator(new CentralDecorator(new OpenDecorator(new GenericVowel())));
  }

  @Override
  public char getSymbol() {
    return 'ä';
  }
}
