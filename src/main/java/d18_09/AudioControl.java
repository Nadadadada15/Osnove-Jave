package d18_09;

public class AudioControl extends Control {

    private boolean isTurningUp;

    public AudioControl(boolean isTurningUp) {
        this.isTurningUp = isTurningUp;
    }

    @Override
    public void doAction(VideoPlayer videoPlayer) {

        if (isTurningUp) {
            if (videoPlayer.getVolume() < 100) {
                videoPlayer.setVolume(videoPlayer.getVolume() + 1);
            } else {
                videoPlayer.setVolume(100);
            }

        } else {
            if (videoPlayer.getVolume() > 0) {
                videoPlayer.setVolume(videoPlayer.getVolume() - 1);
            } else {
                videoPlayer.setVolume(0);
            }
        }


    }


}
