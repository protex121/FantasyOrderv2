package fantasorder.gfx;

import javax.sound.sampled.*;

public class AudioPlayer {
    private Clip clip;
    public double gain = 0;
    
    public AudioPlayer(String s){
        try{
            AudioInputStream ais = AudioSystem.getAudioInputStream(getClass().getResourceAsStream(s));
            AudioFormat baseFormat = ais.getFormat();
            AudioFormat decodeFormat = new AudioFormat(AudioFormat.Encoding.PCM_SIGNED, baseFormat.getSampleRate(),
            16,baseFormat.getChannels(),baseFormat.getChannels()*2,baseFormat.getSampleRate(),false);
            
            AudioInputStream dais = AudioSystem.getAudioInputStream(decodeFormat,ais);
            clip = AudioSystem.getClip();
            clip.open(dais);
            FloatControl gainControl = (FloatControl) clip.getControl(FloatControl.Type.MASTER_GAIN);
            gain = 0.50;               
            float dB = (float) (Math.log(gain) / Math.log(10.0) * 20.0);
            gainControl.setValue(dB);
            
            
            
        }catch(Exception e){
            e.printStackTrace();
        }
    }
    
    public void play(){
        if(clip == null){
            return;
        }
        stop();
        clip.setFramePosition(0);
        clip.start();
    }
    public void stop(){
        if(clip.isRunning()){
            clip.stop();
        }
    }
    
    public void close(){
        stop();
        clip.close();
    }
    
}
