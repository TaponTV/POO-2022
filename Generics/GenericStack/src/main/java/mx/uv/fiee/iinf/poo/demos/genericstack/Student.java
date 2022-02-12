package mx.uv.fiee.iinf.poo.demos.genericstack;

class Student {
    private String name;
    private String lastName;    
    
    public Student () {}
    
    public Student (String n, String l) {
        name = n;
        lastName = l;
    }

    public String getName () {
        return name;
    }

    public void setName (String name) {
        this.name = name;
    }

    public String getLastName () {
        return lastName;
    }

    public void setLastName (String lastName) {
        this.lastName = lastName;
    }   
    
    public String toString () {
        return this.name;
    }
}