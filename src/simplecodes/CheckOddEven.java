package simplecodes;

import java.util.Scanner;

/**
 * Created by Tsigereda on 4/10/2017.
 */
public class CheckOddEven {
    public static void main(String[] args) {


        Scanner userinput = new Scanner(System.in);
        System.out.println("please enter the number to check");
        int num = userinput.nextInt();

        if(num%2==0){

            System.out.println(num + "  is even ");
        } else if(num%2 !=0){
            System.out.println(num + "  is odd");

        }



    }


}
