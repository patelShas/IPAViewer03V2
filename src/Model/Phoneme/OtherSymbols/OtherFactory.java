package Model.Phoneme.OtherSymbols;

import Model.Phoneme.IPhoneme;
import Model.Phoneme.IPhonemeFactory;

import java.util.Arrays;
import java.util.List;

public class OtherFactory implements IPhonemeFactory {

  private static final Character[] symbols = {'ɫ', 'w', 'ɝ'};

  @Override
  public List<Character> validSymbols() {
    return Arrays.asList(symbols);
  }

  @Override
  public IPhoneme makePhoneme(char symbol) {
    switch (symbol) {
      case 'ɫ':
        return new ValAlvLatApro();
      case 'w':
        return new VoicedLabVelApro();
      case 'ɝ':
        return new RColored();
      default:
        throw new IllegalStateException("Unexpected value: " + symbol);
    }
  }
}
