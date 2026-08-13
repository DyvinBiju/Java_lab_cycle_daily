interface Playable{
    void play();
    void stop();

}

class AudioFile implements Playable{
    public void play(){
        System.out.println("Audio is playing");
    }

    public void stop(){
        System.out.println("Audio is stopped");
    }
}

class VideoFile implements Playable{
    public void play(){
        System.out.println("Video is playing");
    }

    public void stop(){
        System.out.println("Video is stopped");
    }
}

public class MediaPlayer {
    public static void main(String[] args){
        Playable[] files = new Playable[2];
        files[0] = new AudioFile();
        files[1] = new VideoFile();

        for(int i=0;i<files.length;i++){
            files[i].play();
            files[i].stop();
        }
    }
}