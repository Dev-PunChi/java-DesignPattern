package Singleton;

public class King {
    private King() {}
    private static King instance = null;
    public synchronized static King getInstance() {
        if (instance == null) {
            instance = new King();
        }
        return instance;
    }

    public void say() {
        System.out.println("I am only one...");
    }
}
