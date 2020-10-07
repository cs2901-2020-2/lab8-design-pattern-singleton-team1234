package lab;

public class ChocolateBoilerSingleton {

    private static ChocolateBoilerSingleton instance;

    private ChocolateBoilerSingleton(){
        instance = null;
    }

    public synchronized static ChocolateBoilerSingleton getInstance() {
        if (instance == null) {
            instance = new ChocolateBoilerSingleton();
        }
        return instance;
    }
}
