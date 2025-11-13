public class Main {
    public static void main(String[] args) {

        int i = 10;
        int n = i++%5;

        System.out.println(i);
        System.out.println(n);
        
    }


    
}

class Student {
    String name;
    int id;
    int age;

    void setStudent(String name, int id, int age){
        this.name = name;
        this.id = id;
        this.age = age;
        System.out.println("Your name is: " + this.name + '\n' + "Your age is: " + this.age );
    }

}
