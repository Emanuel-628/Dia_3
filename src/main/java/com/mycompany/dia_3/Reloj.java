
package com.mycompany.dia_3;
public class Reloj {
    String hora, minutos, segundos;
    
    public Reloj () {
        this.hora = "12";
        this.minutos = "00";
        this.segundos = "00";
    }
    
    public Reloj (String hora,String minutos,String segundos) {
         this.hora = hora;
         this.minutos = minutos;
         this.segundos = segundos;
    }
    public Reloj (int seg) {
        int h=0,m,s;
        m = seg/60;
        s = seg%60;
        
        if (m>=60) {
            h = m/60;
            m = m%60;
        }
        hora = h + "";
        minutos = m + "";
        segundos = s + "";
    }

    public void setReloj (int seg) {
        int h=0,m,s;
        m = seg/60;
        s = seg%60;
        
        if (m>=60) {
            h = m/60;
            m = m%60;
        }
        hora = h + "";
        minutos = m + "";
        segundos = s + "";
    
    }
    public String getHoras (String h) {
        return h;
    }
    public String getMinutos (String m) {
        return m;
    }
    public String getSegundos (String s) {
        return s;
    }
    public void setHoras (String h) {
        this.hora = h;
    }
    public void setMinutos (String m) {
        this.minutos = m;
    }
    public void setSegundos (String s) {
        this.segundos = s;
    }
    public void tick () {
        int seg;
        seg = Integer.valueOf(segundos);
        seg++;
        if ( seg == 60) {
            seg =0;
        }
        segundos = seg + "";
    }
    public void addReloj (Reloj x) {
        hora = x.hora;
        minutos = x.minutos;
        segundos = x.segundos;
    }
    public String toString () {
        //System.out.println ("La hora es: " + hora + " : " + minutos + " : " + segundos);
        String Hreloj = hora + ":" + minutos + ":" + segundos;
        return Hreloj;
    }
    public void tickDecrement () {
        int seg = Integer.valueOf(segundos);
        if (seg == 0) {
            seg = 1;
        }
        seg--;
        segundos = seg + "";
    }
    public Reloj restaReloj (Reloj x) {
        int h1,m1,s1;
        int h2,m2,s2;
        int difh,difm,difs;
        String haux,maux,saux;
        
        h1 = Integer.parseInt(x.hora);
        h2 = Integer.parseInt(hora);
        m1 = Integer.parseInt(x.minutos);
        m2 = Integer.parseInt(minutos);
        s1 = Integer.parseInt(x.segundos);
        s2 = Integer.parseInt(segundos);
        difh = Math.abs(h2-h1);
        difm = Math.abs(m2-m1);
        difs = Math.abs(s2-s1);
        haux = difh + "";
        maux = difm + "";
        saux = difs + "";
        
        Reloj dif = new Reloj (haux,maux,saux);
        return dif;
    }
    public void Pruebafork(){
        System.out.println("Esto es una prueba de si anda el fork en git");
    }
}
