import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        //Задача 1
        int[] arrayInt = new int[]{1, 2, 3};

        float[] arrayFloat = {1.57f, 7.654f, 9.986f};

        String[] pets = {"Dog", "Cat", "Parrot"};
        int[] petsAges = new int[3];
        petsAges[0] = 2;
        petsAges[1] = 1;
        petsAges[2] = 4;

        //Задача 2
        for (int i = 0; i < arrayInt.length; i++) {
            System.out.print(arrayInt[i]);
            if (i != arrayInt.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.print("\n");

        for (int i = 0; i < arrayFloat.length; i++) {
            System.out.print(arrayFloat[i]);
            if (i != arrayFloat.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.print("\n");

        for (int i = 0; i < pets.length; i++) {
            System.out.print(pets[i]);
            if (i != pets.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.print("\n");

        System.out.print("\n");
        //Задача 3
        for (int i = arrayInt.length - 1; i >= 0; i--) {
            System.out.print(arrayInt[i]);
            if (i != 0) {
                System.out.print(", ");
            }
        }
        System.out.print("\n");

        for (int i = arrayFloat.length - 1; i >= 0; i--) {
            System.out.print(arrayFloat[i]);
            if (i != 0) {
                System.out.print(", ");
            }
        }
        System.out.print("\n");

        for (int i = pets.length - 1; i >= 0; i--) {
            System.out.print(pets[i]);
            if (i != 0) {
                System.out.print(", ");
            }
        }
        System.out.print("\n");

        System.out.print("\n");
        //Задача 4
        for (int i = 0; i < arrayInt.length; i++) {
            if (arrayInt[i] % 2 != 0) {
                arrayInt[i] += 1;
            }
        }
        System.out.println(Arrays.toString(arrayInt));
    }
}