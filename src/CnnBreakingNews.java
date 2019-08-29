import javax.microedition.midlet.MIDlet;
import javax.microedition.io.*;

public class CnnBreakingNews extends MIDlet {

  public void startApp () {
    try {
      boolean must_first_exit = platformRequest("http://m.cnn.com/en");
    } catch (ConnectionNotFoundException ex) {
      ex.printStackTrace();
    }
    destroyApp (false);
    notifyDestroyed ();
  }
  public void pauseApp () {}
  public void destroyApp (boolean unconditional) {}
}

