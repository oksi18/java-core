package hm2.task1;

public class WorkStation extends Laptop{
    Video video;

    public WorkStation() {
    }

    public WorkStation(int CPus, int RAM, double monitor, int weight, Video video) {
        super(CPus, RAM, monitor, weight);
        this.video = video;
    }

    public Video getVideo() {
        return video;
    }

    public void setVideo(Video video) {
        this.video = video;
    }

    @Override
    public String toString() {
        return "WorkStation{" +
                "video=" + video +
                '}' + super.toString();
    }
}
