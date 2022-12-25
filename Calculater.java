package caseprogram;
import java.util.*;
public class Calculater {
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();
        int oprator = sc.nextInt();

        switch(oprator){
            case 1 :
                System.out.println(x+y);
                break;
            case 2 :
                System.out.println(x-y);
                break;
            case 3 :
                System.out.println(x*y);
                break;
            case 4 :
                if (y==0) {
                    System.out.println("invalid division");
                }
                    else {
                    System.out.println(x / y);
                }
                    break;
                    case 5 :
                        if ( y==0) {
                            System.out.println("invalid remainder");
                        }
                        else {
                            System.out.println(x % y);
                        }
                        break;
            default :
                System.out.println("invalid oprator");
        }

    }
}
