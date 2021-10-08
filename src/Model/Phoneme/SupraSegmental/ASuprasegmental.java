package Model.Phoneme.SupraSegmental;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public abstract class ASuprasegmental implements ISupraSegmental {

  @Override
  public String PhonemeDescriptor() {
    return "suprasegmental";
  }

  @Override
  public String HowToSound() {
    return "This is a symbol concerning the sounds around it.";
  }

  @Override
  public List<String> getTags() {
    return new ArrayList<>(Arrays.asList("suprasegmental"));
  }
}
