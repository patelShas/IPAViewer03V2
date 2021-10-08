package Model.Phoneme.OtherSymbols;

import Model.Phoneme.IPhoneme;
import Model.Phoneme.PulmonicConsonants.ActualPCons.ASpecificPCons;
import Model.Phoneme.PulmonicConsonants.GenericPCons;
import Model.Phoneme.PulmonicConsonants.MannerOfArticulation.ApproximantDecorator;
import Model.Phoneme.PulmonicConsonants.PlaceOfArticulation.VelarDecorator;
import Model.Phoneme.PulmonicConsonants.Voice.VoicedDecorator;

import java.util.List;

public class VoicedLabVelApro extends ASpecificPCons {
  IPhoneme attributes;

  public VoicedLabVelApro() {
    attributes = new VoicedDecorator(new VelarDecorator(new ApproximantDecorator(new GenericPCons())));
  }

  @Override
  public char getSymbol() {
    return 'w';
  }

  @Override
  public String PhonemeDescriptor() {
    return "labial " + attributes.PhonemeDescriptor();
  }

  @Override
  public String HowToSound() {
    return attributes.HowToSound() + ""
        + " While making this sound you should also round your lips.";
  }

  @Override
  public List<String> getTags() {
    List<String> temp = attributes.getTags();
    temp.add("labial");
    return temp;
  }
}
