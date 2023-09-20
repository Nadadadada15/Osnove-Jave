package d18_09;

public class TimeControl extends Control {

    private boolean skipForward;

    public TimeControl(boolean skipForward) {
        this.skipForward = skipForward;
    }


    @Override
    public void doAction(VideoPlayer videoPlayer) {

        if (skipForward) {
            if (videoPlayer.getCurrentMinute() + 15 <videoPlayer.getVideoLenght()) {
                videoPlayer.setCurrentMinute(videoPlayer.getCurrentMinute() + 15);

            } else {
                videoPlayer.setCurrentMinute(videoPlayer.getVideoLenght());
            }
        } else {
            if (videoPlayer.getCurrentMinute() - 15 > 0) {
                videoPlayer.setCurrentMinute(videoPlayer.getCurrentMinute() - 15);
            } else {
                videoPlayer.setCurrentMinute(0);
            }
        }

    }

    public boolean isSkipForward() {
        return skipForward;
    }

    public void setSkipForward(boolean skipForward) {
        this.skipForward = skipForward;
    }
}