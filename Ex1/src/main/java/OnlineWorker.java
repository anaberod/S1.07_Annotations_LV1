public class OnlineWorker extends Worker{

    public static final double INTERNET_FLAT_RATE = 50;


    public OnlineWorker(String name, String surname, double hourlywage) {
        super(name, surname, hourlywage);
    }

    @Override
    public double calculateSalary(double workedhours) {
        return super.calculateSalary(workedhours) + INTERNET_FLAT_RATE;
    }
}
