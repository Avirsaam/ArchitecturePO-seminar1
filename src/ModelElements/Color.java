package ModelElements;

public class Color {
    int red = 0;
    int green = 0;
    int blue = 0;

    public Color() {
    }

    public Color(int red, int green, int blue, int alpha) {
        this.red = red;
        this.green = green;
        this.blue = blue;
        this.alpha = alpha;
    }

    int alpha = 255;

    public Color(int red, int green, int blue) {
        this.red = red;
        this.green = green;
        this.blue = blue;
    }


}
