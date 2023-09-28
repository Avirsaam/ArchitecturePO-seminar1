package ModelElements;

public class Angle3D {
    int pitch;
    int yaw;
    int roll;

    public Angle3D() {
        pitch = 0;
        yaw = 0;
        roll = 0;
    }

    public Angle3D(int pitch, int yaw, int roll) {
        this.pitch = pitch;
        this.yaw = yaw;
        this.roll = roll;
    }
}
