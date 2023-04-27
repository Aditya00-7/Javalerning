package opps;

public class firstprogram {
  /*  static class Pen {
        String color;
        String type;

        public void write() {
            System.out.println("Writing something");
        }

        public void printcolor() {
            System.out.println(this.color);
        }
    }*/

    static  class Student {
        String name;
        int age;


        public void printinfo() {
            System.out.println(this.name);
            System.out.println(this.age);
        }
        Student(String name,int age){
       // non parametrized constructor   // System.out.println("Constructor called");
            // parametrized constructor
            this.age=age;
            this.name=name;
        }
    }

    public static void main(String[] args) {
        /*   Pen pen1 = new Pen ();
           pen1.color="blue";
           pen1.type ="gel";
         //  pen1.write();
        Pen pen2 =new Pen();
        pen2.color= "red";
        pen2. type="ballpoint";
        pen1.printcolor();
        pen2.printcolor();
       }*/
       /* non parametrized constructor
       Student s1 = new Student();
        s1.name = "aman";
        s1.age = 24;
        s1.printinfo();*/
        //parametrized constructor
        Student s1 =new Student("Aman",24);
        s1.printinfo();
    }
}