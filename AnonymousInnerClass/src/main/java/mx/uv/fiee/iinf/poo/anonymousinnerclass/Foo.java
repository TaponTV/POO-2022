package mx.uv.fiee.iinf.poo.anonymousinnerclass;

abstract class AnonymousClass {

    public abstract void myMethod ();
    public abstract void add ();
    
}

class Bar extends AnonymousClass {

    @Override
    public void myMethod() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void add() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}

public class Foo {

    public static void main (String [] args) {
        
        Bar b = new Bar ();
        
//        AnonymousClass inner = new AnonymousClass () {
//            
//            public void myMethod () {
//                System.out.println("I’m anonymous inner class");
//            }
//
//            @Override
//            public void add() {
//                throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
//            }
//            
//        };
        
        
        //inner.myMethod();
    }
}
