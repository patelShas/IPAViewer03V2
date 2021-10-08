package Model.Phoneme.PulmonicConsonants;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * A generic pulmonic consonant, with nothing more specific known
 */
public class GenericPCons implements IPCons {

  @Override
  public char getSymbol() {
    throw new IllegalArgumentException("A symbol has not been specified for this!");
  }

  @Override
  public String PhonemeDescriptor() {
    return "pulmonic consonant";
  }

  @Override
  public String HowToSound() {
    return "This sound is produced by the air you push out of your lungs.";
  }

  @Override
  public List<String> getTags() {
    return new ArrayList<>(Arrays.asList("consonant", "pulmonic"));
  }
}
