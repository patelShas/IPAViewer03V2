package Controller;

import Model.IDictionary;
import View.IDictViewer;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

public class IPADictController implements IDictController {
  private final IDictionary model;
  private final IDictViewer view;


  public IPADictController(IDictionary model, IDictViewer view) {
    this.model = model;
    this.view = view;
  }

  @Override
  public void executeSingleCommand(Readable command) {
    Scanner sc = new Scanner(command);
    executeCommandFromScanner(sc);
  }

  @Override
  public void executeManyCommands(Readable commands) {
    Scanner sc = new Scanner(commands);
    while (sc.hasNext()) {
      executeCommandFromScanner(sc);
    }
  }

  private void executeCommandFromScanner(Scanner sc) {
    while (sc.hasNext()) {
      String s = sc.next();
      if (s.equals("IPALookup")) {
        while (s.equals("IPALookup") || s.equals("IPALearn")) {
          s = sc.next();
        }
        try {
          model.lookUpQuery(s);
          view.renderSuccess("Found an entry for " + s);
          return;
        } catch (IllegalArgumentException e) {
          view.renderError(e.getMessage());
          return;
        }
      } else if (s.equals("IPALearn")) {
        while (!s.equals("variant") && !s.equals("sound")) {
          s = sc.next();
        }
        String varOrSound = new String(s);
        while (!sc.hasNextInt()) {
          sc.next();
        }
        int i = sc.nextInt();
        if (varOrSound.equals("variant")) {
          try {
            model.selectPronunciation(i);
            view.renderSuccess("selected pronunciation " + (i + 1));
            return;
          } catch (IllegalArgumentException e) {
            view.renderError(e.getMessage());
            return;
          }
        } else if (varOrSound.equals("sound")) {
          try {
            model.selectPhoneme(i);
            view.renderSuccess("selected phoneme " + (i));
            return;
          } catch (IllegalArgumentException e) {
            view.renderError(e.getMessage());
            return;
          }
        }
      }
    }
  }


  @Override
  public void executeScript(File script) throws FileNotFoundException {
    Scanner sc = new Scanner(new FileReader(script));
    while (sc.hasNext()) {
      executeCommandFromScanner(sc);
    }
  }
}
