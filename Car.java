import java.sql.SQLOutput;

public class Car {
    private double motor;
    private String model;
    private Color color;
    private static int count;
    public Car(Color color,String model){
        count++;
        this.color=color;
        this.model=model;

    }
    public Car(){
        this.color=Color.BEYAZ;
        count++;

    }
    public Car(Color color){
        this.color=color;
        count++;

    }
    public Car(Color color,String model, double motor){
        this.color= color;
        this.motor=motor;
        this.model=model;
        count++;

    }
    public void carInfo(){
        System.out.println("RENK="+getColor().getAvatar());
        System.out.println("MODEL="+getModel());
        System.out.println("MOTOR="+getMotor());
        System.out.println();
        System.out.println("Üretilen Araç Sayısı="+getCount());

    }

    public double getMotor() {
        return motor;
    }

    public String getModel() {
        return model;
    }

    public Color getColor() {
        return color;
    }

    public void setCar(Color color, String model, double motor){
        this.color=color;
        this.model=model;
        this.motor=motor;

    }
    public void changeColor(Color color){
        this.color=color;
    }

    public int getCount() {
        return count;
    }
}
