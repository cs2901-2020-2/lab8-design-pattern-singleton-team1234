package lab;

public class ChocolateBoilerSingleton {

    private static ChocolateBoilerSingleton instance = null;
    private static int semaphore = 0;
    private boolean empty;
    private boolean boiled;

    private ChocolateBoilerSingleton(){

    }
    public void fill(){
        if(isEmpty()){
            empty = false;
            boiled = false;
        }
    }

    public void drain(){
        if(isEmpty() && isBoiled()){
            //drain the boiled milk and chocolate
            empty = true;
        }
    }

    public void boil(){
        if(!isEmpty() && isBoiled()){
            //bring the contents to a boil
            boiled = true;
        }
    }

    public boolean isEmpty(){
        return empty;
    }

    public boolean isBoiled(){
        return boiled;
    }

    private static synchronized int increaseSema () {
        int prev = semaphore;
        semaphore++;
        return prev;
    }

    public static ChocolateBoilerSingleton getInstance(){
        if (increaseSema() == 0)
            instance = new ChocolateBoilerSingleton();
        return instance;
    }
}
