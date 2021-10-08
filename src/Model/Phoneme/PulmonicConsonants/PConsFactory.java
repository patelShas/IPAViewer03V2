package Model.Phoneme.PulmonicConsonants;

import Model.Phoneme.IPhoneme;
import Model.Phoneme.IPhonemeFactory;
import Model.Phoneme.PulmonicConsonants.ActualPCons.*;

import java.util.Arrays;
import java.util.List;

public class PConsFactory implements IPhonemeFactory {

  private static final Character[] symbols = {'m', 'ɱ', 'n', 'ɳ', 'ɲ', 'ŋ', 'ɴ',
      'ʙ', 'r', 'ʀ', 'ⱱ', 'ɾ', 'ɽ',
      'ʋ', 'ɹ', 'ɻ', 'j', 'ɰ', 'l', 'ɭ', 'ʎ', 'ʟ',
      'ɸ', 'β', 'f', 'v', 'θ', 'ð',
      's', 'z', 'ʃ', 'ʒ', 'ʂ', 'ʐ',
      'ç', 'ʝ', 'x', 'ɣ', 'χ', 'ʁ',
      'ħ', 'ʕ', 'h', 'ɦ', 'ɬ', 'ɮ',
      'p', 'b', 't', 'd', 'ʈ', 'ɖ', 'c',
      'ɟ', 'k', 'ɡ', 'q', 'ɢ', 'ʔ'
  };

  @Override
  public List<Character> validSymbols() {
    return Arrays.asList(symbols);
  }

  @Override
  public IPhoneme makePhoneme(char symbol) {
    switch (symbol) {
      case 'm':
        return new VoicedBilabialNasalPCons();
      case 'ɱ':
        return new VoicedLabiodentalNasalPCons();
      case 'n':
        return new VoicedDAPNasalPCons();
      case 'ɳ':
        return new VoicedRetroflexNasalPCons();
      case 'ɲ':
        return new VoicedPalatalNasalPCons();
      case 'ŋ':
        return new VoicedVelarNasalPCons();
      case 'ɴ':
        return new VoicedUvularNasalPCons();

      case 'ʙ':
        return new VoicedBilabialTrillPCons();
      case 'r':
        return new VoicedDAPTrillPCons();
      case 'ʀ':
        return new VoicedUvularTrillPCons();
      case 'ⱱ':
        return new VoicedLabiodentalTapFlapPCons();
      case 'ɾ':
        return new VoicedDAPTapFlapPCons();
      case 'ɽ':
        return new VoicedRetroflexTapFlapPCons();

      case 'ʋ':
        return new VoicedLabiodentalApproximantPCons();
      case 'ɹ':
        return new VoicedDAPApproximantPCons();
      case 'ɻ':
        return new VoicedRetroflexApproximantPCons();
      case 'j':
        return new VoicedPalatalApproximantPCons();
      case 'ɰ':
        return new VoicedVelarApproximantPCons();
      case 'l':
        return new VoicedDAPLatApproximantPCons();
      case 'ɭ':
        return new VoicedRetroflexLatApproximantPCons();
      case 'ʎ':
        return new VoicedPalatalLatApproximantPCons();
      case 'ʟ':
        return new VoicedVelarLatApproximantPCons();

      case 'ɸ':
        return new VoicelessBilabialFricativePCons();
      case 'β':
        return new VoicedBilabialFricativePCons();
      case 'f':
        return new VoicelessLabioDentalFricativePCons();
      case 'v':
        return new VoicedLabioDentalFricativePCons();
      case 'θ':
        return new VoicelessDentalFricativePCons();
      case 'ð':
        return new VoicedDentalFricativePCons();

      case 's':
        return new VoicelessAlveolarFricativePCons();
      case 'z':
        return new VoicedAlveolarFricativePCons();
      case 'ʃ':
        return new VoicelessPostAlveolarFricativePCons();
      case 'ʒ':
        return new VoicedPostAlveolarFricativePCons();
      case 'ʂ':
        return new VoicelessRetroflexFricativePCons();
      case 'ʐ':
        return new VoicedRetroflexFricativePCons();

      case 'ç':
        return new VoicelessPalatalFricativePCons();
      case 'ʝ':
        return new VoicedPalatalFricativePCons();
      case 'x':
        return new VoicelessVelarFricativePCons();
      case 'ɣ':
        return new VoicedVelarFricativePCons();
      case 'χ':
        return new VoicelessUvularFricativePCons();
      case 'ʁ':
        return new VoicedUvularFricativePCons();

      case 'ħ':
        return new VoicelessPharyngealFricativePCons();
      case 'ʕ':
        return new VoicedPharyngealFricativePCons();
      case 'h':
        return new VoicelessGlottalFricativePCons();
      case 'ɦ':
        return new VoicedGlottalFricativePCons();
      case 'ɬ':
        return new VoicelessDAPFricativePCons();
      case 'ɮ':
        return new VoicedDAPLateralFricativePCons();

      case 'p':
        return new VoicelessBilabialPlosivePCons();
      case 'b':
        return new VoicedBilabialPlosivePCons();
      case 't':
        return new VoicelessDAPPlosivesPCons();
      case 'd':
        return new VoicedDentalAndAlveolarPlosivesPCons();
      case 'ʈ':
        return new VoicelessRetroflexPlosivesPCons();
      case 'ɖ':
        return new VoicedRetroflexPlosivesPCons();
      case 'c':
        return new VoicelessPalatalPlosivesPCons();

      case 'ɟ':
        return new VoicedPalatalPlosivesPCons();
      case 'k':
        return new VoicelessVelarPlosivesPCons();
      case 'ɡ':
        return new VoicedVelarPlosivesPCons();
      case 'q':
        return new VoicelessUvularPlosivesPCons();
      case 'ɢ':
        return new VoicedUvularPlosivesPCons();
      case 'ʔ':
        return new GlottalStopPCons();
      default:
        throw new IllegalStateException("Unexpected value: " + symbol);
    }
  }
}
