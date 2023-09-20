package d18_09;

public class VideoPlayer {

    private int videoLenght;
    private int currentMinute;
    private int volume;
    private int videoQuality;

    public VideoPlayer(int videoLenght, int currentMinute, int volume ) {
        this.videoLenght = videoLenght;
        this.currentMinute = currentMinute;
        this.volume = volume;

    }


    public void  printIt () {

        System.out.println("Trenutno vreme videa: " + this.currentMinute);
        System.out.println("Jacina zvuka: " + this.volume);
        System.out.println("Kvalitet videa: " + this.videoQuality);
    }















    //get&set


    public int getVideoLenght() {
        return videoLenght;
    }

    public int getCurrentMinute() {
        return currentMinute;
    }

    public int getVolume() {
        return volume;
    }

    public int getVideoQuality() {
        return videoQuality;
    }

    public void setVideoLenght(int videoLenght) {
        this.videoLenght = videoLenght;
    }

    public void setCurrentMinute(int currentMinute) {
        this.currentMinute = currentMinute;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    public void setVideoQuality(int videoQuality) {
        this.videoQuality = videoQuality;
    }
}
