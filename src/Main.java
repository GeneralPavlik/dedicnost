import autosalon.Audi;
import autosalon.Auto;
import autosalon.Ferrari;
import autosalon.Octavia_IV_RS;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);



       Ferrari f = new Ferrari(471,2000000,"červená");
       f.jizdaStart();
       f.vypisInfo();

        Audi a = new Audi(606,4500000,"světle modrá");
        a.jizdaStart();
        a.vypisInfo();

        Octavia_IV_RS o = new Octavia_IV_RS(265,1059000,"limetková");
        o.jizdaStart();
        o.vypisInfo();


        System.out.println("Ferari cena: "+f.getCena());
        System.out.println("Audi cena: "+a.getCena());
        System.out.println("Octavia cena: "+o.getCena());





    }
}