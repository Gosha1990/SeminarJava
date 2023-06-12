import java.time.LocalTime;
import java.util.Scanner;
import java.util.Arrays;
public class App {
    public static void main(String[] args) throws Exception {

        // task_1();
        // task_2();
        // task_3();
        task_4();

    }

    private static void task_4() {
        String[] lines = { "dom", "domovoy", "domashniy" };
        System.out.println(findPfx(lines));
        System.out.println(lines[0].substring(0, findPfx(lines)) );
    }

    private static int findPfx(String[] lines){
        int res = 0;
        boolean pfxExist = true;
        while (pfxExist) {
            res++;
            for (int i = 0;i < (lines.length - 1);i++){

                if (lines[i].substring(0, res).compareTo(lines[i+1].substring(0,res)) != 0){
                    res--;
                    pfxExist = false;
                    break;
                }
            }
        }
        return res;   
    }

    private static void task_3() {
        // Дан массив nums = [3,2,2,3] и число val = 3.
        // Если в массиве есть числа, равные заданному, нужно перенести эти элементы в
        // конец массива.
        // Таким образом, первые несколько (или все) элементов массива должны быть
        // отличны от заданного, а остальные - равны ему.

        int[] arr = new int[] { 1, 1, 0, 3, 1, 1, 3, 0, 1 };
        int val = 3;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == val) {
                for (int j = i; j < arr.length - 1; j++)
                    arr[j] = arr[j + 1];
                arr[arr.length - 1] = val;
            }
        }

        for (int item : arr)
            System.out.printf("%d\t", item);
    }

    private static void task_2() {

        int[] arr = { 1, 1, 0, 1, 1, 1 };
        int cnt = 0;
        int max_cnt = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 1)
                cnt++;
            else {
                if (cnt > max_cnt)
                    max_cnt = cnt;
                cnt = 0;
            }
        }
        if (cnt > max_cnt)
            max_cnt = cnt;
        System.out.println(max_cnt);

    }

    private static void task_1() {

        System.out.println("Hello, World!");

        Scanner isScaner = new Scanner(System.in);
        System.out.printf("Enter your name: ");
        String name = isScaner.nextLine();
        // System.out.println("Hello, " + name);
        // Depends(name);
    }

    // public static void Depends(String name) {
    // LocalTime lt = java.time.LocalTime.now();
    // System.out.println(lt);
    // if (lt.getHour() >= 18 && lt.getHour() < 23) {
    // System.out.printf("Good evening, %s!\n", name);
    // } else if (lt.getHour() >= 23 || lt.getHour() < 5) {
    // System.out.printf("Good night, %s!\n", name);
    // } else if (lt.getHour() >= 5 || lt.getHour() < 12) {
    // System.out.printf("Good morning, %s!\n", name);
    // } else if (lt.getHour() >= 12 || lt.getHour() < 18) {
    // System.out.printf("Good afternoon, %s!\n", name);
    // }

}
