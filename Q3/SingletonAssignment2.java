// Manoj Kumar Vemuri ID 2022213
package Exercise3;

public class SingletonAssignment2 {
    private static SingletonAssignment2 instance;//Our main instance
    private static int maxInstance = 0;//Counting our instances
    private static SingletonAssignment2 lastInstance = null;//holder for last instance

    //constructor
    private SingletonAssignment2() {
    }

    public static SingletonAssignment2 getInstance() {
        if (maxInstance < 3) {
            instance = new SingletonAssignment2();
            maxInstance++;
            lastInstance = instance;
            System.out.print("Instance␣created␣at:" + System.currentTimeMillis());
            return instance;
        } else {
            System.out.println("\n\nYou cannot print more than three instances");
            return lastInstance;
        }

    }
}

