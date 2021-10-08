package Model.Phoneme.Vowels;

import Model.Phoneme.IPhoneme;
import Model.Phoneme.IPhonemeFactory;
import Model.Phoneme.Vowels.ActualVowels.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class VowelFactory implements IPhonemeFactory {

  private static final Character[] symbols = {'u', 'ɯ', 'ʉ', 'ɨ', 'y', 'i'
      , 'o', 'ɤ', 'ɵ', 'ɘ', 'ø', 'e', 'ə', 'ʊ'
      , 'ʏ', 'ɪ', 'ɐ', 'æ', 'ɒ'
      , 'ɑ', 'ä', 'ɶ', 'a', 'ɔ'
      , 'ʌ', 'ɞ', 'ɜ', 'œ', 'ɛ'};


  @Override
  public List<Character> validSymbols() {
    return new ArrayList<>(Arrays.asList(symbols));
  }

  @Override
  public IPhoneme makePhoneme(char symbol) {
    switch (symbol) {
      case 'u':
        return new CloseBackRoundedVowel();
      case 'ɯ':
        return new CloseBackUnroundedVowel();
      case 'ʉ':
        return new CloseCentralRoundedVowel();
      case 'ɨ':
        return new CloseCentralUnroundedVowel();
      case 'y':
        return new CloseFrontRoundedVowel();
      case 'i':
        return new CloseFrontUnroundedVowel();
      case 'o':
        return new ClosemidBackRoundedVowel();
      case 'ɤ':
        return new ClosemidBackUnroundedVowel();
      case 'ɵ':
        return new ClosemidCentralRoundedVowel();
      case 'ɘ':
        return new ClosemidCentralUnroundedVowel();
      case 'ø':
        return new ClosemidFrontRoundedVowel();
      case 'e':
        return new ClosemidFrontUnroundedVowel();
      case 'ə':
        return new MidCentralVowel();
      case 'ʊ':
        return new NearcloseNearbackRoundedVowel();
      case 'ʏ':
        return new NearcloseNearfrontRoundedVowel();
      case 'ɪ':
        return new NearcloseNearfrontUnroundedVowel();
      case 'ɐ':
        return new NearopenCentralVowel();
      case 'æ':
        return new NearopenFrontUnroundedVowel();
      case 'ɒ':
        return new OpenBackRoundedVowel();
      case 'ɑ':
        return new OpenBackUnroundedVowel();
      case 'ä':
        return new OpenCentralUnroundVowel();
      case 'ɶ':
        return new OpenFrontRoundedVowel();
      case 'a':
        return new OpenFrontUnroundedVowel();
      case 'ɔ':
        return new OpenmidBackRoundedVowel();
      case 'ʌ':
        return new OpenmidBackUnroundedVowel();
      case 'ɞ':
        return new OpenmidCentralRoundedVowel();
      case 'ɜ':
        return new OpenmidCentralUnroundedVowel();
      case 'œ':
        return new OpenmidFrontRoundedVowel();
      case 'ɛ':
        return new OpenmidFrontUnroundedVowel();
      default:
        throw new IllegalStateException("Unexpected value: " + symbol);
    }
  }
}
