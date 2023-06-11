import java.time.LocalTime;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        task_1();

    }

    private static void task_1() {

        System.out.println("Hello, World!");

        Scanner isScaner = new Scanner(System.in);
        System.out.printf("Enter your name: ");
        String name = isScaner.nextLine();
        //System.out.println("Hello, " + name);
        Depends(name);
    }

    /**
     * @param name
     */
    public static void Depends(String name){
    LocalTime lt = java.time.LocalTime.now();
    System.out.println(lt);
    if(lt.getHour()>= 18 && lt.getHour()<23){
        System.out.printf("Good evening, %s!\n", name);
    }else if (lt.getHour()>= 23 || lt.getHour()<5 ){
            System.out.printf("Good night, %s!\n", name);
    }else if (lt.getHour()>= 5 || lt.getHour()<12 ){
            System.out.printf("Good morning, %s!\n", name);
    }else if (lt.getHour()>= 12 || lt.getHour()<18 ){
            System.out.printf("Good afternoon, %s!\n", name);
    }


}

}
