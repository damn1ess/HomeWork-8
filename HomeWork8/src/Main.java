import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        //Task 1
        int [] goodBoy = new int [3];
        goodBoy[0] = 1;
        goodBoy[1] = 2;
        goodBoy[2] = 3;

        double [] sheet = {1.57, 7.654, 9.986};

        int [] scary = new int[5];
        scary[0] = 1231;
        scary[1] = 240;
        scary[2] = 3122;
        scary[3] = 4987;
        scary[4] = 555;


        //Task 2
        System.out.println("Задача 2");
        System.out.println(goodBoy[0] + ", " + goodBoy[1] + ", " + goodBoy[2]);
        System.out.println(sheet[0] + ", " + sheet[1] + ", " + sheet[2]);
        System.out.println(scary[0] + ", " + scary[1] + ", " + scary[2] + ", " + scary[3] + ", " + scary[4]);


        //Task 3
        System.out.println("\nЗадача 3");
        System.out.println(goodBoy[2] + ", " + goodBoy[1] + ", " + goodBoy[0]);
        System.out.println(sheet[2] + ", " + sheet[1] + ", " + sheet[0]);
        System.out.println(scary[4] + ", " + scary[3] + ", " + scary[2] + ", " + scary[1] + ", " + scary[0]);


        //Task 4
        System.out.println("\nЗадача 4 ");
        for (int i = 0; i < goodBoy.length; i++) {
            if (goodBoy[i] % 2 != 0) {
                goodBoy[i] = goodBoy[i] + 1;
            }
            System.out.print(Arrays.toString(goodBoy));
        }
        }
}