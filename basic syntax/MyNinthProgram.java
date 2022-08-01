package learningjava;

public class MyNinthProgram {

    public static void main(String[] args) {

        int[] array = new int[6];

        array[0] = 10;
        array[1] = 20;
        array[2] = 30;
        array[3] = 40;
        array[4] = 50;
        array[5] = 60;

        for (int x = 0; x < array.length; x++) {
            System.out.println(array[x]);
        }

//        ALTERNATIVE WAY
//       for (int i : array) {
//            System.out.println(i);
//       }

        String[] arrays = {"Maria", "João", "Ana", "José"};

        for (int y = 0; y < arrays.length; y++) {
            System.out.println(arrays[y]);
        }
    }
}
