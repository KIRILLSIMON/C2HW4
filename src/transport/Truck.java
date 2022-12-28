package transport;

public class Truck extends Transport implements Competing{
    public Truck(String brand, String model, double engineVolume) {
        super(brand, model, engineVolume);
    }

    @Override
    public void start() {
        System.out.println("грузовой автомобиль\""+getBrand()+"\"(\""+getModel()+"\") начал движение");
    }

    @Override
    public void stop() {
        System.out.println("\"грузовой автомобиль\""+getBrand()+"\"(\""+getModel()+"\") закончил движение");
    }


    @Override
    public void pitStop() {
        System.out.println("грузовой автомобиль прошёл ПИТ-СТОП");
    }

    @Override
    public int bestLoopTime() {
        return (int) (Math.random()*12);
    }

    @Override
    public int maxSpeed() {
        return (int) (Math.random()*120);
    }
}
