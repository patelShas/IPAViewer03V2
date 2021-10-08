package Model.Phoneme;

import java.util.List;

/**
 * Representation for some phoneme recognized by the model and it's attributes
 */
public interface IPhoneme {

  /**
   * The character(s) that would represent this phoneme in any word's entry
   * @return A string of the representative symbols, usually a character.
   * @throws IllegalArgumentException if the phoneme is some abstraction or category rather than
   *     an actual specifc phoneme.
   */
  public char getSymbol();

  /**
   * A description of this phoneme and what category it is.
   * @return A string of adjectives describing the phoneme.
   */
  public String PhonemeDescriptor();

  /**
   * A description of what needs to be done to
   * @return
   */
  public String HowToSound();

  public List<String> getTags();

}
