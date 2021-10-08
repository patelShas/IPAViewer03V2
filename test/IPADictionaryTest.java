import static org.junit.Assert.*;

import Model.IDictionary;
import Model.IPADictionary;
import java.io.InputStream;
import javafx.scene.image.Image;
import org.junit.Test;

public class IPADictionaryTest {

  @Test
  public void testConstructor() {
    IDictionary dummyDick = new IPADictionary();
  }

  @Test
  public void findRes() {
    String fileName = "sampleDict.txt";

    // The class loader that loaded the class
    ClassLoader classLoader = getClass().getClassLoader();
    InputStream inputStream = classLoader.getResourceAsStream(fileName);

    // the stream holding the file content
    if (inputStream == null) {
      throw new IllegalArgumentException("file not found! " + fileName);
    } else {
      System.out.println(inputStream);
    }


    assertNotNull(classLoader.getResourceAsStream("sampleDict.txt"));
    assertNotNull(classLoader.getResourceAsStream("en_US.txt"));
    assertNotNull(classLoader.getResourceAsStream("speech.png"));
    Image im = new Image(classLoader.getResourceAsStream("speech.png"));
    assertNotNull(im);
  }

}