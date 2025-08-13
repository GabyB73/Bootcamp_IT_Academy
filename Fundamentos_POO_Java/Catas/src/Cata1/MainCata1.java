package Cata1;

public class MainCata1 {

    public static void main(String[] args) {

        int numero = 0;

        int arrayNum[] = {1, 2, 3, 4, 2, 6, 7, 8, 2, 10};


        for (int i = 0; i < arrayNum.length; i++) {


            System.out.println(arrayNum[i]);


            if (arrayNum[i] == arrayNum[i]) {

                numero++;

                System.out.println(numero);

            }


        }


    }

}
