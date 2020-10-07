package lab;

public class ChocolateBoilerSingleton {

    private static ChocolateBoilerSingleton instance = null;

    private ChocolateBoilerSingleton(){

    }

    public static ChocolateBoilerSingleton getInstance(){

        if(instance == null) {

            synchronized (ChocolateBoilerSingleton.class){
                if(instance == null){
                    instance = new ChocolateBoilerSingleton();
                }
            }
        }

        return instance;

    }




}
