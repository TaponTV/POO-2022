package mx.uv.fiee.iinf.poo.demos.genericstack;

public class Main {
    
    public static void main (String [] args) {
        Stack<Student> students = new Stack<> (3);
        students.push (new Student ("Leia", "Organa"));
        students.push (new Student ("Han", "Solo"));
        students.push (new Student ("Ben", "Solo"));
        
        System.out.println (students.pop ());
        System.out.println (students.pop ());
        
        Stack<Integer> enteros = new Stack<> (3);
        enteros.push (7);
        enteros.push (10);
        enteros.push (24);
        
        System.out.println (enteros.pop ());
        System.out.println (enteros.pop ());
    }
    
}
