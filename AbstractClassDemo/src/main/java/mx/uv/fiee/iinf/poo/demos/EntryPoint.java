package mx.uv.fiee.iinf.poo.demos;


public class EntryPoint {

    public static void main (String [] args) {
        Persona p = new ProfesorTitular ("Diana", "Montejo", 30);
        String s = p.toString ();
        
        System.out.println (s);
    }
    
}
