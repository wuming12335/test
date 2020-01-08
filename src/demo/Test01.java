package demo;

import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;

import sun.audio.AudioData;
import sun.audio.AudioPlayer;
import sun.audio.AudioStream;
import sun.audio.ContinuousAudioDataStream;

public class Test01 {

	public static void main(String[] args) throws Exception {

		InputStream inputStream = new FileInputStream("D:\\test\\À…Œ≤‘Á»À - õQëÈ~÷ÿ§ §Í∫œ§¶ﬂ\√¸~.wav");
//		AudioPlayer.player.start(inputStream);
		
		
		AudioStream stream = new AudioStream(inputStream);
		
		AudioData data = stream.getData();
		
		ContinuousAudioDataStream gg = new ContinuousAudioDataStream (data); 

		AudioPlayer.player.start(gg);
		
		Thread.sleep(10000);
		
		AudioPlayer.player.stop(gg);
		
		Thread.sleep(10000);
		
		AudioPlayer.player.start(gg);
		
		
	}

}
