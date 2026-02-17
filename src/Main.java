import java.util.Arrays;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        System.out.println("#1");
        int inputArray1[] = {50, 20, 65, 55, 14};
        int[] outputArray1 = new int[4];
        //общее
        for (int element : inputArray1) {
            outputArray1[0] = outputArray1[0] + element;
        }
        //большее
        for (int i = 0; i < inputArray1.length; i++) {
            if (inputArray1[i] > outputArray1[1]) {
                outputArray1[1] = inputArray1[i];
            }
        }
        //меньшее
        outputArray1[2] = outputArray1[1];
        for (int i = 0; i < inputArray1.length; i++) {
            if (inputArray1[i] < outputArray1[2]) {
                outputArray1[2] = inputArray1[i];
            }
        }
        //средне
        outputArray1[3] = outputArray1[0] / (inputArray1.length - 1);
        //вывод
        System.out.println(Arrays.toString(inputArray1) + "\n" + Arrays.toString(outputArray1));


        System.out.println("#2");
        int inputArray2[] = {50, 20, 65, 55, 14};
        float[] outputArray2 = new float[5];
        float tax = 0.13F;
        for (int i = 0; i < inputArray2.length; i++) {
            outputArray2[i] = (float) (inputArray2[i] * tax);
        }
        System.out.println(Arrays.toString(inputArray2) + "\n" + Arrays.toString(outputArray2));


        System.out.println("#3");
        int inputArray3[] = {7333, 2, 6, 5, 1};
        boolean[] outputArray3 = new boolean[5];
        for (int i = 0; i < inputArray3.length; i++) {
            outputArray3[i] = inputArray3[i] > 5;
        }
        System.out.println(Arrays.toString(inputArray3) + "\n" + Arrays.toString(outputArray3));


        System.out.println("#4");
        int inputArray4[] = {5, 1, -1, 0, 3};
        boolean[] outputArray4 = new boolean[5];
        for (int i = 0; i < inputArray4.length; i++) {
            if (inputArray4[i] < 0) {
                outputArray4[i] = false;
                break;
            } else {
                outputArray4[i] = true;
            }
        }
        System.out.println(Arrays.toString(inputArray4) + "\n" + Arrays.toString(outputArray4));

        System.out.println("#5");
        int inputArray5[] = {5, 1, -1, 0, 3};
        boolean[] outputArray5 = new boolean[5];
        int profitableMonth = 0;
        for (int i = 0; i < inputArray5.length; i++) {
            outputArray5[i] = inputArray5[i] > 0;
            if (inputArray5[i] > 0) {
                profitableMonth++;
            }
        }
        System.out.println(profitableMonth + " месяцев были прибыльными");
        System.out.println(Arrays.toString(inputArray5) + "\n" + Arrays.toString(outputArray5));
    }
}