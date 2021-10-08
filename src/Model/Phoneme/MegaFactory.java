package Model.Phoneme;

import Model.Phoneme.OtherSymbols.OtherFactory;
import Model.Phoneme.PulmonicConsonants.PConsFactory;
import Model.Phoneme.SupraSegmental.SuperSegsFactory;
import Model.Phoneme.Vowels.VowelFactory;

import java.util.ArrayList;
import java.util.List;

public class MegaFactory implements IPhonemeFactory {
  private final IPhonemeFactory v = new VowelFactory();
  private final IPhonemeFactory o = new OtherFactory();
  private final IPhonemeFactory p = new PConsFactory();
  private final IPhonemeFactory s = new SuperSegsFactory();

  @Override
  public List<Character> validSymbols() {
    List<Character> temp = new ArrayList<>();
    temp.addAll(v.validSymbols());
    temp.addAll(o.validSymbols());
    temp.addAll(p.validSymbols());
    temp.addAll(s.validSymbols());
    return temp;
  }

  @Override
  public IPhoneme makePhoneme(char symbol) {
    if (v.validSymbols().contains(symbol)) {return v.makePhoneme(symbol);}
    if (o.validSymbols().contains(symbol)) {return o.makePhoneme(symbol);}
    if (p.validSymbols().contains(symbol)) {return p.makePhoneme(symbol);}
    if (s.validSymbols().contains(symbol)) {return s.makePhoneme(symbol);}
    throw new IllegalArgumentException("An appropriate match could not be made.");
  }
}
