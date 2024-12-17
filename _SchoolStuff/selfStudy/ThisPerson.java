package _SchoolStuff.selfStudy;

public class ThisPerson {
    private String name;
    private int age;
    
    public ThisPerson(String name, int age) {
        this.name = name;
        this.age = age;
    }
    
    public String getInfo() {
        return "Name: " + this.name + ", Age: " + this.age;
    }
    
    public static void main(String[] args) {
        ThisPerson person = new ThisPerson("John", 30);
        System.out.println(person.getInfo());
    }
}

