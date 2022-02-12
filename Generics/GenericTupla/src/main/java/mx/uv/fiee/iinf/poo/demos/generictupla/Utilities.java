package mx.uv.fiee.iinf.poo.demos.generictupla;

public class Utilities {
    
    public static <T extends GenericTupla> boolean compare (T one, T two) {
            return one.getKey ().equals (two.getKey ()) && one.getValue ().equals (two.getValue ());
    }
}