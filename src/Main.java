import java.util.Arrays;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        System.out.println("№1");
        int[] weight = new int[3];
        weight[0] = 1;
        weight[1] = 2;
        weight[2] = 3;
        double[] inDooble = new double[]{1.57, 7.654, 9.986};
        int[] wet = new int[]{1, 7, 10};

        System.out.println("№2");
        System.out.print("weight: ");
        for (int i = 0; i < weight.length; i++) {
            if (i == (weight.length - 1)) {
                System.out.print(weight[i] + "\n");
                break;
            }
            System.out.print(weight [i] + ", ");
        }
        System.out.print("inDooble: ");
        System.out.print(Arrays.toString(inDooble));
        System.out.print("\nwet: ");
        System.out.print(Arrays.toString(wet));

        System.out.println("\n №3");
        System.out.print("weight: ");
        for (int i = (weight.length-1); i >= 0; i--) {
            if (i == 0) {
                System.out.print(weight[i] + "\n");
                break;
            }
            System.out.print(weight [i] + ", ");
        }
        System.out.print("inDooble: ");
        for (int i = (inDooble.length-1); i >= 0; i--) {
            if (i == 0) {
                System.out.print(inDooble[i] + "\n");
                break;
            }
            System.out.print(inDooble [i] + ", ");
        }
        System.out.print("wet: ");
        for (int i = (wet.length-1); i >= 0; i--) {
            if (i == 0) {
                System.out.print(wet[i] + "\n");
                break;
            }
            System.out.print(wet [i] + ", ");
        }

        System.out.println("№4");
        for (int i = 0; i < weight.length; i++) {
            if ( weight [i] % 2 != 0) {
                weight [i] = weight [i] + 1;
            }
            if (i == (weight.length - 1)) {
                System.out.print(weight[i] + "\n");
                break;
            }
            System.out.print(weight [i] + ", ");
        }
    }
}