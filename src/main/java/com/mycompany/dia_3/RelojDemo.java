
package com.mycompany.dia_3;

import java.util.Scanner;

public class RelojDemo {    
    public static void main (String [] args) {
        String h,m,s;
        int h_aux=0,m_aux=0,s_aux=0;
        
        Scanner reader = new Scanner (System.in);

        do {
            System.out.println ("Ingrese la hora, minuto y segundo: ");
            h = reader.nextLine();
            m = reader.nextLine();
            s = reader.nextLine();
            try {
                h_aux = Integer.parseInt(h);
                m_aux = Integer.parseInt(m);
                s_aux = Integer.parseInt(s);
            }
            catch (Exception e) {
                System.out.println("No es un numero");
                System.exit (0);
            }
        }
        while (h_aux<0 || h_aux>23 || m_aux<0 || m_aux>59 || s_aux<0 || s_aux>59);
        
        Reloj r1 = new Reloj (3605);
        r1.tick();
        System.out.println(r1.toString());
        r1.tick();
        System.out.println(r1.toString());
        r1.tick();
        System.out.println(r1.toString());
        r1.tick();
        System.out.println(r1.toString());
        r1.tick();
        System.out.println(r1.toString());
        r1.tick();
        System.out.println(r1.toString());
        r1.tick();
        System.out.println(r1.toString());
        r1.tick();
        System.out.println(r1.toString());
        r1.tick();
        System.out.println(r1.toString());
        r1.tick();
        System.out.println(r1.toString());
        
        Reloj r2 = new Reloj (h,m,s);       
        
        System.out.println( r2.restaReloj(r1));
    }
}
