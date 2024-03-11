package Controller;

import javax.sound.sampled.*;
import java.io.File;

public class Sons {

	public static void getSong() {
		new Thread(()->{
			try {
				AudioInputStream audioStream = AudioSystem.getAudioInputStream(new File("Sons/Wine Bottles Clinking"));
				Clip clip = AudioSystem.getClip();
				
				clip.addLineListener(event -> {
					if(event.getType() == LineEvent.Type.STOP) {
						clip.close();
					}
				});
				clip.open();
				clip.start();
			}catch(Exception e) {}
		});
		
	}

}
