package d18_09;

public class QyalityOptimizer extends Control {

 private double netSpeedMb;

    public QyalityOptimizer(int netSpeed) {
        this.netSpeedMb = netSpeed;
    }

    @Override
    public void doAction(VideoPlayer videoPlayer) {

        if (this.netSpeedMb*10.1<144) { videoPlayer.setVideoQuality(144);}
        else if (this.netSpeedMb*10.1<240) {videoPlayer.setVideoQuality(240);}
        else {videoPlayer.setVideoQuality(720);}



    }


    //get&set


    public double getNetSpeedMb() {
        return netSpeedMb;
    }

    public void setNetSpeedMb(int netSpeed) {
        this.netSpeedMb = netSpeed;
    }
}
