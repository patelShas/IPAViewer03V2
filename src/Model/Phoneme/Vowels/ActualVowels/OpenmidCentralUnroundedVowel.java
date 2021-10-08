package Model.Phoneme.Vowels.ActualVowels;

import Model.Phoneme.Vowels.Backness.CentralDecorator;
import Model.Phoneme.Vowels.GenericVowel;
import Model.Phoneme.Vowels.Height.OpenMidDecorator;
import Model.Phoneme.Vowels.Roundedness.UnroundedDecorator;

public class OpenmidCentralUnroundedVowel extends ASpecificVowel {

  public OpenmidCentralUnroundedVowel() {
    attributes = new UnroundedDecorator(new CentralDecorator(new OpenMidDecorator(new GenericVowel())));
  }

  @Override
  public char getSymbol() {
    return 'ɜ';
  }
}
