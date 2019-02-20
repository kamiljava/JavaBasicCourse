package algorithms.model;

public class RGB {
    int  R,G,B;

    @Override
    public String toString() {
        return "[" + R + "," + G +","+ B+"]";
    }

    public RGB(int r, int g, int b) {
        R = r;
        G = g;
        B = b;
    }

    public int getR() {
        return R;
    }

    public void setR(int r) {
        R = r;
    }

    public int getG() {
        return G;
    }

    public void setG(int g) {
        G = g;
    }

    public int getB() {
        return B;
    }

    public void setB(int b) {
        B = b;
    }
}
