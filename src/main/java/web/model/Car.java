package web.model;

public class Car {

    private String model;
    private String series;
    private int number;

    public Car() {
    }

    public Car(String model, String series, int number) {
        this.model = model;
        this.series = series;
        this.number = number;
    }

    public String getModel() {
        return model;
    }

    public String getSeries() {
        return series;
    }

    public int getNumber() {
        return number;
    }

    @Override
    public String toString() {
        return "Car{" +
                "model='" + model + '\'' +
                ", series='" + series + '\'' +
                ", number=" + number +
                '}';
    }
}
