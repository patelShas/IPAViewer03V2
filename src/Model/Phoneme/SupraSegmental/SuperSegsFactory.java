package Model.Phoneme.SupraSegmental;

import Model.Phoneme.IPhoneme;
import Model.Phoneme.IPhonemeFactory;
import Model.Phoneme.SupraSegmental.ActualSuperSegs.*;

import java.util.Arrays;
import java.util.List;

public class SuperSegsFactory implements IPhonemeFactory {

  private static final Character[] symbols = {
      'ˈ', 'ˌ', 'ː', 'ˑ', '̆', '|', '‖', '‿'
  };

  @Override
  public List<Character> validSymbols() {
    return Arrays.asList(symbols);
  }

  @Override
  public IPhoneme makePhoneme(char symbol) {
    switch (symbol) {
      case 'ˈ':
        return new PrimaryStressSegs();
      case 'ˌ':
        return new SecondaryStressSegs();
      case 'ː':
        return new LongSegs();
      case 'ˑ':
        return new HalfLongSegs();
      case '̆':
        return new ExtraShortSegs();
      case '|':
        return new MinorBreakSegs();
      case '‖':
        return new MajorBreakSegs();
      case '‿':
        return new LinkingSegs();
      default:
        throw new IllegalStateException("Unexpected value: " + symbol);
    }
  }
}
