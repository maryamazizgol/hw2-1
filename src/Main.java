/**
 * Created by MM on 10/4/2019.
 */

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner=new Scanner (System.in);
        System.out.println ("Enter the name of the company: ");
        String string=scanner.nextLine ();

        S500 a= new S500();
         a.inform();
        Cls350 b= new Cls350();
        b.inform();
        Gla45 c= new Gla45();
        c.inform();
        E230 d= new E230();
        d.inform();
       C200 e= new C200();
        e.inform();



    }









}
