package day25_arrayLists;

import java.util.ArrayList;
import java.util.List;

public class C04_FibonacciSayisi {
    public static void main(String[] args) {

        // Soru 4- Verilen pozitif bir n tamsayisini alarak,
        //         bize ilk n tane tane Fibonacci sayisini bir list olarak donduren
        //         bir method olusturun.

        //    Fibonacci serisi : 0 1 1 2 3 5 8 13 21 34 55 89 144 233

        System.out.println(fibonacciListesiOlustur(26));

    } // main method sonu

    public static List<Integer> fibonacciListesiOlustur(int fibonacciSayiAdedi)  {

        List <Integer>  fibonacciSerisi =new ArrayList<>();
        int ilk = 0;
        int ikinci = 1;
        int temp;

        if (fibonacciSayiAdedi <= 0)  {
            System.out.println("Lutfen giciklik yapmayiniz");
            return fibonacciSerisi;

        } else if (fibonacciSayiAdedi == 1) {
        fibonacciSerisi.add(ilk);
        return fibonacciSerisi;

        } else {
            fibonacciSerisi.add(ilk); //  [0
           fibonacciSerisi.add(ikinci); // [0,1

            for (int i = 0; i <= fibonacciSayiAdedi - 2  ; i++) {

                fibonacciSerisi.add(ilk + ikinci) ; //  [0,1,1
                temp = ilk + ikinci;
                ilk=ikinci;
                ikinci=temp;
            }
            return fibonacciSerisi;
        }

    }

    // [0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144, 233, 377, 610, 987, 1597, 2584, 4181, 6765, 10946, 17711, 28657, 46368, 75025, 121393]


} // class body'nin sonu
