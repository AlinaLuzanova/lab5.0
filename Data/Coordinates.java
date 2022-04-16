package Data;

public class Coordinates {
    private Float  x;
    private float y;
    private static Float max_x = Float.valueOf(754);
    public Coordinates(Float x, float y){
        this.x=x;
        this.y=y;

    }

    @Override
    public String toString() {
        String info = "Координаты организации: \n";

        info += ("Coordinates: \n");
        info += ("             x: " + x + '\n');
        info += ("             y: " + y + '\n');
        return info;

    }

    public Float getX() {
        return x;
    }
    public float getY(){
        return y;
    }
}
