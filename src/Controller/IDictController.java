package Controller;

import java.io.File;
import java.io.FileNotFoundException;

/**
 * An interface to make it easier to communicate with and manipulate a model of an IPADictionary.
 */
public interface IDictController {

  /**
   * Would allow a single commands to be executed onto the model.
   * Commands are formatted as:
   * <ul>
   *   <li>"IPALookup xxxx" to search up the term xxxx.
   *   <li>"IPALearn variant x" to select a pronunciation, x being a positive integer.
   *   <li>"IPALearn sound x" to select a phoneme, x being a positive integer.
   * </ul>
   * Commands that are only partly complete will be left waiting for completion.
   * @param command However the object reads is interpreted as a command to be executed.
   */
  public void executeSingleCommand(Readable command);

  /**
   * Would allow a series of commands to be executed onto the model.
   * Commands are formatted as:
   * <ul>
   *   <li>"IPALookup xxxx" to search up the term xxxx.
   *   <li>"IPALearn variant x" to select a pronunciation, x being a positive integer.
   *   <li>"IPALearn sound x" to select a phoneme, x being a positive integer.
   * </ul>
   * Commands that are only partly complete will be left waiting for completion.
   * @param commands However the object reads is interpreted as commands to be executed.
   */
  public void executeManyCommands(Readable commands);

  /**
   * Will read and execute a series of commands from a specified file.
   * @param script The specified file to be read for commands.
   * @throws FileNotFoundException If the specified file caanot be found.
   */
  public void executeScript(File script) throws FileNotFoundException;


}
