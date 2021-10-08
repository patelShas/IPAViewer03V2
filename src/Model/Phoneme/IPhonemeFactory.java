package Model.Phoneme;

import java.util.List;

public interface IPhonemeFactory {

  public List<Character> validSymbols();

  public IPhoneme makePhoneme(char symbol);

}
