public class main {
    @SuppressWarnings("deprecation")

    public static void main(String[] args) {

        Worker normalWorker = new Worker("Jhon", "Smith", 18);
        PresentialWorker presentialWorker = new PresentialWorker("Sarah", "Craig", 15.5);
        OnlineWorker onlineWorker = new OnlineWorker("Richard", "Jones", 9.75);

        System.out.println("Normal worker salaray: " + normalWorker.calculateSalary(35));
        System.out.println("Online worker salary: " + onlineWorker.calculateSalary(35));
        System.out.println("Presential worker salary: " + presentialWorker.calculateSalary(35));

        presentialWorker.clockInWithPunchCard();
        onlineWorker.connectViaModem();



    }
}
