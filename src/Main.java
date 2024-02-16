// Method overloading

//class Calc {
//    public  int add(int a, int b){
//        return a + b;
//    }// Method overloading

//class Calc {
//    public  int add(int a, int b){
//        return a + b;
//    }
//
//    public double add(float a,float b){
//        return a + b;
//    }
//}
//public class Main {
//    public static void main(String[] args) {
//        Calc obj = new Calc();
//        int res = obj.add(2,4);
//        System.out.println("res -> " + res);
//
//        double floatRes = obj.add((float) 1.2, (float)2.2);
//        System.out.println("floatRes -> " + floatRes);
//    }
//}

//String comparison

//public  class Main {
//    public static void main(String args[]){
//        String a = "Hello";
//        String b = "Hello";
//        String c = new String("Hello");
//
//        System.out.println("reference check a,b " + a==b);
//        System.out.println("reference check a,c " + a==c);
//        System.out.println("value check a,b " + a.equals(b));
//        System.out.println("value check a,c " + a.equals(c));
//    }
//}

// String concatenation

//public class Main {
//    public static  void main(String args[]){
//        String str = new String("Hello");
//        str = str.concat(" world");
//        System.out.println(str);
//
//        String str1 = "Hello";
//        str1 += "world";
//        System.out.println(str1);
//
//    }
//}

// Inbuilt string methods

//public class Main {
//    public static void main(String args[]) {
//        String str = "hello";
//        System.out.println(str.length());
//        System.out.println(str.charAt(2));
//        System.out.println(str.substring(1,3));
//        System.out.println(str.toUpperCase());
//        System.out.println(str.toLowerCase());
//        System.out.println(str.indexOf("l"));
//        System.out.println(str.lastIndexOf("l"));
//    }
//}

// Mutable string

//public class Main {
//    public static void main(String args[]) {
//        StringBuffer str = new StringBuffer("Hello");
//        StringBuilder str1 = new StringBuilder("Hello");
//        System.out.println(str +  " - "  + str1);
//        str.append("World");
//        str1.append("World");
//        System.out.println(str +  " - "  + str1);
//    }
//}

// Final keyword
//public class Main {
//    public static void main(String args[]) {
//        int a = 10;
//        System.out.println(a);
//        a = 20;
//        System.out.println(a);
//
//        final  int b = 10;
//        System.out.println(b);
////        b = 20; (Cannot change like this)
//        System.out.println(b);
//    }
//}

// Shadowing parameter / Encapsulation / Getter and setters

// class Student {
//    public int age;
//    public String name;
//    public void setAge(int age){
//        this.age = age;
//    }
//    public int getAge(){
//        return age;
//    }
//    public void setAge(String name){
//        this.name = name;
//    }
//    public String getName(){
//        return name;
//    }
//    public void show(){
//        System.out.println(name + " - " + age);
//    }
//}
//public class Main {
//    public static void main(String[] args) {
//        Student obj = new Student();
//        Student customObj = new Student();
//        obj.show();
//        customObj.setAge(2);
//        customObj.setAge("Sam");
//        customObj.show();
//        int samAge = customObj.getAge();
//        String samName = customObj.getName();
//        System.out.println(samAge + " - " +samName);
//
//    }
//}

// Constructors
//class  Student {
//    private int age;
//    public void display(){
//        System.out.println("display method " + age);
//    }
//
//    public Student(){
//        System.out.println("I am zero parameterized constructor by programmer");
//    }
//
//    public  Student(int age){
//        this();
//        this.age = age;
//        System.out.println("I am parameterized constructor");
//    }
//}
//public class Main {
//    public static void main(String args[]) {
//        Student st = new Student(23);
//        st.display();
//
//        Student st1 = new Student();
//        st1.display();
//    }
//}
//
//    public double add(float a,float b){
//        return a + b;
//    }
//}
//public class Main {
//    public static void main(String[] args) {
//        Calc obj = new Calc();
//        int res = obj.add(2,4);
//        System.out.println("res -> " + res);
//
//        double floatRes = obj.add((float) 1.2, (float)2.2);
//        System.out.println("floatRes -> " + floatRes);
//    }
//}

//String comparison

//public  class Main {
//    public static void main(String args[]){
//        String a = "Hello";
//        String b = "Hello";
//        String c = new String("Hello");
//
//        System.out.println("reference check a,b " + a==b);
//        System.out.println("reference check a,c " + a==c);
//        System.out.println("value check a,b " + a.equals(b));
//        System.out.println("value check a,c " + a.equals(c));
//    }
//}

// String concatenation

//public class Main {
//    public static  void main(String args[]){
//        String str = new String("Hello");
//        str = str.concat(" world");
//        System.out.println(str);
//
//        String str1 = "Hello";
//        str1 += "world";
//        System.out.println(str1);
//
//    }
//}

// Inbuilt string methods

//public class Main {
//    public static void main(String args[]) {
//        String str = "hello";
//        System.out.println(str.length());
//        System.out.println(str.charAt(2));
//        System.out.println(str.substring(1,3));
//        System.out.println(str.toUpperCase());
//        System.out.println(str.toLowerCase());
//        System.out.println(str.indexOf("l"));
//        System.out.println(str.lastIndexOf("l"));
//    }
//}

// Mutable string

//public class Main {
//    public static void main(String args[]) {
//        StringBuffer str = new StringBuffer("Hello");
//        StringBuilder str1 = new StringBuilder("Hello");
//        System.out.println(str +  " - "  + str1);
//        str.append("World");
//        str1.append("World");
//        System.out.println(str +  " - "  + str1);
//    }
//}

// Final keyword
//public class Main {
//    public static void main(String args[]) {
//        int a = 10;
//        System.out.println(a);
//        a = 20;
//        System.out.println(a);
//
//        final  int b = 10;
//        System.out.println(b);
////        b = 20; (Cannot change like this)
//        System.out.println(b);
//    }
//}

// Shadowing parameter / Encapsulation / Getter and setters

// class Student {
//    public int age;
//    public String name;
//    public void setAge(int age){
//        this.age = age;
//    }
//    public int getAge(){
//        return age;
//    }
//    public void setAge(String name){
//        this.name = name;
//    }
//    public String getName(){
//        return name;
//    }
//    public void show(){
//        System.out.println(name + " - " + age);
//    }
//}
//public class Main {
//    public static void main(String[] args) {
//        Student obj = new Student();
//        Student customObj = new Student();
//        obj.show();
//        customObj.setAge(2);
//        customObj.setAge("Sam");
//        customObj.show();
//        int samAge = customObj.getAge();
//        String samName = customObj.getName();
//        System.out.println(samAge + " - " +samName);
//
//    }
//}

// Constructors
// class  Student {
//    private int age;
//    public void display(){
//        System.out.println("display method " + age);
//    }
//
//    public Student(){
//        System.out.println("I am zero parameterized constructor by programmer");
//    }
//
//    public  Student(int age){
//        this();
//        this.age = age;
//        System.out.println("I am parameterized constructor");
//    }
//}
//public class Main {
//    public static void main(String args[]) {
//        Student st = new Student(23);
//        st.display();
//
//        Student st1 = new Student();
//        st1.display();
//    }
//}

/*   OOPs  */

// Inheritance

//class Human{  // Super class | base class | parent class
//    int age;
//    private String name; // will not participate in inheritance
//
//    Human(){
//        System.out.println("Human constructor");
//    }
//    void sleep(){
//        System.out.println("Human needs good sleep to function well" + " And Human's age is " + age);
//    }
//}
//class Student extends  Human{ // child class | derived class | sub class
//    void display(){
//        System.out.println("Age from child class: " + age);
////        System.out.println("Name from child class: " + name);  // Throws error as it is private variable
//    }
//}
//
//public class Main{
//    public static void main(String[] args) {
//        Student st = new Student();
////        st.sleep();
//    }
//}

// Single level inheritance

//class Class1{
//    void display(){
//        System.out.println("Class 1 ");
//    }
//}
//class Class2 extends Class1{
//
//}
//public class Main {
//    public static void main(String args[]){
//        Class2 c = new Class2();
//        c.display();
//    }
//}

// Multi-level inheritance

//class Class1{
//    void display(){
//        System.out.println("Class 1 ");
//    }
//}
//class Class2 extends Class1{
//
//}
//class Class3 extends Class2{
//
//}
//class Class4 extends Class3{
//
//}
//public class Main {
//    public static void main(String args[]){
//        Class4 c = new Class4();
//        c.display();
//    }
//}

// Hierarchical

//class Parent{
//    void display(){
//        System.out.println("Parent ");
//    }
//}
//class Child1 extends Parent{
//
//}
//class Child2 extends Parent{
//
//}
//public class Main {
//    public static void main(String args[]){
//        Child1 c = new Child1();
//        c.display();
//    }
//}

// Method overriding, Specialized, Inherited

//class Parent{
//    void display(){
//        System.out.println("Parent ");
//    }
//    void toBeInherited(){
//        System.out.println("Inherited class");
//    }
//}
//class Child extends Parent{
//    void display(){
//        System.out.println("I am modified Parent");
//    }
//
//    void specialized(){
//        System.out.println("Only present in child & called Specialized");
//    }
//}
//public class Main {
//    public static void main(String args[]){
//        Child c = new Child();
//        c.display();
//        c.toBeInherited();
//        c.specialized();
//    }
//}

// Constructor execution this and super;

//class Parent{
//    int age;
//    public Parent(){
//        System.out.println("Parent class constructor");
//    }
//    public Parent(int age){
//        this.age = age;
//        System.out.println("Age from parent class " + age);
//    }
//}
//class Children extends Parent {
//    public Children() {
////        super(); // Call to the no-argument constructor of the superclass
////        this(100); // Calls within the same class; any one among this and super can be used
//        System.out.println("Children constructor");
//    }
//
//    public Children(int age) {
////        super(age); // Call to the parameterized constructor of the superclass
//
//        System.out.println("Age from child class " + age);
//    }
//}
//
//public class Main {
//    public static void main(String[] args) {
//        Children ch = new Children();
//        Children ch1 = new Children(10);
//    }
//}

// Polymorphism

//class Parent{
//    public void display(){
//        System.out.println("Parent Class");
//    }
//}
//class Children extends Parent{
//    public void display(){
//        System.out.println("Children Class");
//    }
//}
//class SubChildren extends Parent{
//    public void display(){
//        System.out.println("Sub-Children Class");
//    }
//}
//class Polymorphic{
//    public void display(Parent ref){
//        ref.display();
//    }
//}
//class Main{
//    public static void main(String[] args) {
//        Parent pt = new Parent();
//        Children c = new Children();
//        SubChildren sc = new SubChildren();
//
////        pt.display();
////        c.display();
////        sc.display();
////            ||  (above code is equivalent code to below)
////        Polymorphic p = new Polymorphic();
////        p.display(pt);
////        p.display(c);
////        p.display(sc);
////    }
////}

// Abstraction

//abstract class Parent {
//    abstract void display();
//    void printing(){
//        System.out.println("Printing from parent");
//    }
//}
//class Child extends Parent{
//    void display(){
//        System.out.println("printing from child class");
//    }
//}
//class Main{
//    public static void main(String args[]){
//        Child c = new Child();
//        c.display();
//// ERROR:- throws error
////        Parent p = new Parent(); // can't access
////        p.display();
//
//        ((Child) c).printing(); // down casting to access non-abstract method
//    }
//}

// Interface

//interface  A{
//    void show();
//}
//interface C{
//    void cShow();
//}
//class B implements A,C{
//    public void show() {
//        System.out.println("SHOW METHOD");
//    }
//    public void cShow(){
//        System.out.println("cSHOW METHOD");
//    }
//}
//class Main{
//    public static void main(String[] args) {
//       C b = new B();
//        b.show();
//        b.cShow();
//    }
//}

// ---------------------------------------------------------------

//interface A{
//    void show();
//    default void interfaceMethod(){
//        System.out.println("Interface method");
//    }
//    static void staticMethod(){
//        System.out.println("Static method");
//    }
//}
//class B implements A{
//    public void show(){
//        System.out.println("Show method");
//    }
//}
//class Main{
//    public static void main(String[] args) {
//        A.staticMethod();
//        A obj = new B();
//        obj.show();
//        obj.interfaceMethod();
//    }
//}

// Inner class

//class A{
//    public void show(){
//        System.out.println("Show method");
//    }
//    class B{
//        public void innerShow(){
//            System.out.println("Inner show method");
//        }
//    }
//}
//class Main{
//    public static void main(String[] args) {
//        A aObj = new A();
//        aObj.show();
//
//        A.B bObj = aObj.new B();
//        bObj.innerShow();
//    }
//}

// Anonymous inner class

//interface Car{
//    public void driving();
//}
//class Main{
//    public static void main(String[] args) {
//        Car obj = new Car(){
//            public void driving(){
//                System.out.println("Driving............");
//            }
//        };
//
//        obj.driving();
//    }
//}

// Lambda express

//interface Car{
//    public void driving(int avg);
//}
//class Main{
//    public Main() {
//        super();
//    }
//
//    @Override
//    public int hashCode() {
//        return super.hashCode();
//    }
//
//    @Override
//    public boolean equals(Object obj) {
//        return super.equals(obj);
//    }
//
//    @Override
//    protected Object clone() throws CloneNotSupportedException {
//        return super.clone();
//    }
//
//    @Override
//    public String toString() {
//        return super.toString();
//    }
//
//    @Override
//    protected void finalize() throws Throwable {
//        super.finalize();
//    }
//
//    public static void main(String[] args) {
//        Car obj = (avg) -> System.out.println("Driving............" + avg);
//
//        obj.driving(18);
//    }
//}

// Exception handling

//class Main{
//    public static void main(String[] args) {
//        int num1 = 3;
//        int num2 = 2;
//        int res = 0;
//        int arr[] = {1,2,3};
//
//        try {
//            res = num1 / num2;
//            System.out.println(arr[6]);
//        }catch(ArithmeticException obj) {
//            System.out.println("Something went wrong!" + obj);
//        }catch (ArrayIndexOutOfBoundsException e){
//            System.out.println("Stay in your limit" + e);
//        }catch (Exception e){
//            System.out.println("Something went wrong");
//        }
//
//        System.out.println(res);
//        System.out.println("End of program");
//    }
//}

//import java.util.Scanner;
//
//class Main{
//    public static void main(String[] args) {
//        int num = 0;
//        Scanner sc = new Scanner(System.in);
//
//        try {
//            num = sc.nextInt();
//        }catch (Exception e){
//            System.out.println("Something went wrong " + e);
//        }finally {
//            sc.close();
//            System.out.println("End of program");
//        }
//
//        System.out.println(num);
//
//    }
//}

// Exception ducking

//class exceptionDucking{
//    public void a() throws Exception{
//        b();
//        System.out.println("a function call");
//    }
//    public void b() throws Exception{
//        int a = 2;
//        int b = 0;
//        int res = a/b;
//        System.out.println("b function call" + res);
//    }
//}
//class Main{
//    public static void main(String[] args) {
//        exceptionDucking obj = new exceptionDucking();
//        try{
//            obj.a();
//        }catch (Exception e){
//            System.out.println("Error" + e.getMessage());
//        }
//
//        System.out.println("end of program");
//    }
//}

// Custom exception and throw

//class Main{
//    public static void main(String[] args) {
//        int n1 = 6;
//        int n2 = -1;
//
//        try {
//            if(n2<0){
//                Exception e = new ArithmeticException("Negative number");
//                throw e;
//            }else {
//                int res = n1 / n2;
//                System.out.println("res " + res);
//            }
//        }catch (Exception e){
//            System.out.println("Exception " + e);
//        }
//
//    }
//}

// Multi threading

//----------------------------------X-----------------------------------------------------

//public class Main {
//public static void main(String[] args) {
//    System.out.println("HELLO");
//    String name = Thread.currentThread().getName();
//
//    System.out.println("Before");
//    System.out.println("Name " + name);
//    System.out.println("Priority " + Thread.currentThread().getPriority());
//
//    System.out.println("After");
//    Thread t = Thread.currentThread();
//    t.setName("NEW THREAD");
//    t.setPriority(1);
//
//    System.out.println("Name " + t.getName());
//    System.out.println("Priority " + Thread.currentThread().getPriority());
//}
//}

///----------------------------------X-----------------------------------------------------

//class MyThread extends  Thread{
//    public void run(){
//        System.out.println("Child Thread");
//    }
//}
//
//public class Main {
//    public static void main(String[] args) {
//        System.out.println("Main thread");
//        MyThread t = new MyThread();
//        t.start();
//    }
//}

//----------------------------------X-----------------------------------------------------

// Creating Thread by extending thread class

//import java.util.Scanner;
//
//class Calculate extends Thread{
//    public void run() {
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter 1st number");
//        int a = sc.nextInt();
//        System.out.println("Enter 2st number");
//        int b = sc.nextInt();
//        System.out.println("Sum = " + (a+b));
//    }
//}
//
//class Message extends Thread{
//    public void run() {
//        for(int i=0;i<4;i++){
//            System.out.println("Some messages");
//        }
//    }
//}
//
//class Message1 extends Thread{
//    public void run() {
//        try{
//            for(int i=0;i<4;i++) {
//                System.out.println("Some other messages");
//                Thread.sleep(2000);
//            }
//        }catch (Exception e){
//            System.out.println("Something went wrong" + e);
//        }
//    }
//}
//
//class LaunchMultiThread {
//    public static void main(String[] args) {
//        System.out.println("Program execution start");
//
//        Calculate t = new Calculate();
//        Message t1 = new Message();
//        Message1 t2 = new Message1();
//
//        t.start();
//        t1.start();
//        t2.start();
//    }
//}
//

//----------------------------------X-----------------------------------------------------

// Creating thread using runnable interface

// Creating Thread by extending thread class (Recommended)

//import java.util.Scanner;
//
//class Calculate implements Runnable{
//    public void run() {
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter 1st number");
//        int a = sc.nextInt();
//        System.out.println("Enter 2st number");
//        int b = sc.nextInt();
//        System.out.println("Sum = " + (a+b));
//    }
//}
//
//class Message implements Runnable{
//    public void run() {
//        for(int i=0;i<4;i++){
//            System.out.println("Some messages");
//        }
//    }
//}
//
//class Message1 implements Runnable{
//    public void run() {
//        try{
//            for(int i=0;i<4;i++) {
//                System.out.println("Some other messages");
//                Thread.sleep(2000);
//            }
//        }catch (Exception e){
//            System.out.println("Something went wrong" + e);
//        }
//    }
//}
//
//class LaunchMultiThread {
//    public static void main(String[] args) {
//        System.out.println("Program execution start");
//
//        Calculate c = new Calculate();
//        Message m1 = new Message();
//        Message1 m2 = new Message1();
//
//        Thread t = new Thread(c);
//        Thread t1 = new Thread(m1);
//        Thread t2 = new Thread(m2);
//
//        t.start();
//        t1.start();
//        t2.start();
//    }
//}

// Multitasking within single run

//class MyThread extends Thread{
//    public void run() {
//        String tName = Thread.currentThread().getName();
//        if(tName.equals("MSG1")){
//            msg1();
//        }else {
//            msg2();
//        }
//    }
//
//    public void msg1(){
//        System.out.println("Message 1");
//    }
//
//    public void msg2(){
//        System.out.println("Message 2");
//        try {
//            Thread.sleep(2000);
//        }catch (Exception e){
//            System.out.println("Something went wrong" + e);
//        }
//    }
//}
//
//class LaunchMultiThread {
//    public static void main(String[] args) {
//        System.out.println("Program execution start");
//
//        MyThread t = new MyThread();
//        MyThread t1 = new MyThread();
//
//        t.setName("MSG1");
//        t1.setName("MSG2");
//
//        t.start();
//        t1.start();
//    }
//}

// join()  and alive() method

//class Printing implements Runnable{
//    public void run() {
//        System.out.println("Running");
//        try {
//            Thread.sleep(3000);
//        } catch (InterruptedException e) {
//            System.out.println("Something went wrong" + e);
//
//        }
//    }
//
//}
//class Launch{
//    public static void main(String[] args) throws InterruptedException {
//        System.out.println("Started");
//        Printing print = new Printing();
//
//        Thread t = new Thread(print);
//        System.out.println("Is thread alive " + t.isAlive());
//        t.start();
//        System.out.println("Is thread alive " + t.isAlive());
//        t.join();  // End will only execute till t is not completed
//
//        System.out.println("End");
//    }
//}

// synchronized method()

//class Car implements Runnable{
////    synchronized public void run(){ // synchronized helps to execute resource in synchronized
//        public void run(){
//        try {
//            System.out.println(Thread.currentThread().getName() + " Running");
//            Thread.sleep(3000);
//            System.out.println(Thread.currentThread().getName() + " Running 1");
//            Thread.sleep(3000);
//            System.out.println(Thread.currentThread().getName() + " Running 2");
//            Thread.sleep(3000);
//            System.out.println(Thread.currentThread().getName() + " Running 3");
//            Thread.sleep(3000);
//
//            synchronized (this){
//                System.out.println(Thread.currentThread().getName() + " Running 4");
//                Thread.sleep(3000);
//            }
//        }catch (Exception e){
//            System.out.println("Something went wrong!");
//        }
//    }
//}
//
//class Launch{
//    public static void main(String[] args){
//        Car c = new Car();
//
//        Thread t = new Thread(c);
//        Thread t1 = new Thread(c);
//        Thread t2 = new Thread(c);
//
//        t.setName("T");
//        t1.setName("T1");
//        t2.setName("T2");
//
//        t.start();
//        t1.start();
//        t2.start();
//    }
//}

// Deadlock

//class Library implements Runnable{
//    String res = "Java";
//    String res1 = "Sql";
//    String res2 = "Dsa";
//
//    public void run(){
//        String name = Thread.currentThread().getName();
//        if(name.equals("Student")){
//            try{
//                Thread.sleep(3000);
//                synchronized (res){
//                    System.out.println("Student acquires the book");
//                    Thread.sleep(3000);
//                    synchronized (res1){
//                        System.out.println("Student 1 acquires the book");
//                        Thread.sleep(3000);
//                        synchronized (res2){
//                            System.out.println("Student 2 acquires the book");
//                            Thread.sleep(3000);
//                        };
//                    };
//
//                };
//            }catch (Exception e){
//                System.out.println("something went wrong! " + e);
//            }
//        }else{
//            try{
//                Thread.sleep(3000);
//                synchronized (res2){
//                    System.out.println("Student acquires the book");
//                    Thread.sleep(3000);
//                    synchronized (res2){
//                        System.out.println("Student 1 acquires the book");
//                        Thread.sleep(3000);
//                        synchronized (res){
//                            System.out.println("Student 2 acquires the book");
//                            Thread.sleep(3000);
//                        };
//                    };
//
//                };
//            }catch (Exception e){
//                System.out.println("something went wrong! " + e);
//            }
//        }
//
//    }
//}
//
//class Main{
//    public static void main(String[] args){
//        System.out.println("Start");
//        Library lib = new Library();
//
//        Thread t = new Thread(lib);
//        Thread t1 = new Thread(lib);
//        Thread t2 = new Thread(lib);
//
//        t.setName("Student");
//        t1.setName("Student1");
//        t2.setName("Student2");
//
//        t.start();
//        t1.start();
//        t2.start();
//
//
//    }
//}

// Collections

import com.sun.source.tree.Tree;

import java.util.*;
import java.util.ArrayList;

class Collection{
    public static void main(String[] args){
        ArrayList l = new ArrayList();
        ArrayList l1 = new ArrayList();
        l.add(100);
        l.add(200);
        l.add("String");

        l1.add("L1 DATA");
        l1.add(l);

        System.out.println("************** ARRAY LIST ********************");

        System.out.println("L " + l);
        System.out.println("L1 " + l1);

        l1.add(1,"NEW");
        System.out.println("L1 " + l1);

        ArrayList l3 = new ArrayList();
        l3.add("String");
        l3.add(1);
        l3.add(3);

        System.out.println("L3 " + l3);
        System.out.println("Contains " + l3.contains("String"));
        System.out.println("Index of " + l3.indexOf(3));
        System.out.println("Size of " + l3.size());

        l3.ensureCapacity(1);
        l3.trimToSize();
        l3.clear();

        System.out.println("l3 " + l3);

        System.out.println("************** LINKED LIST ********************");

        LinkedList ll = new LinkedList();
        ll.add(1);
        ll.add(2);
        ll.add(3);
        ll.add("String");
        System.out.println("Linked list " + ll);


        ll.addFirst(0);
        ll.addLast(1000);
        ll.add(2,100);
        System.out.println("Linked list " + ll);
        System.out.println("Peek " + ll.peek());
        System.out.println("Peek last " + ll.peekLast());
        System.out.println("Linked list " + ll);

        ll.poll();
        System.out.println("Linked list " + ll);

        LinkedList ll1 = new LinkedList();
        ll1.add(1);
        ll1.add(2);
        ll1.add(3);
        System.out.println("LL1 " + ll1);
        System.out.println("get " + ll1.get(1));
        System.out.println("getFirst " + ll1.getFirst());
        System.out.println("getLast " + ll1.getLast());
        ll1.push(4);
        System.out.println("LL1 " + ll1);
        ll1.pop();
        System.out.println("LL1 " + ll1);

        System.out.println("************** ARRAY  DEQUE ********************");

        ArrayDeque ad = new ArrayDeque();
        ad.add(1);
        ad.add(2);
        System.out.println("ad " + ad);
        ad.addFirst(0);
        ad.addLast(10);
        System.out.println("ad " + ad);
        ad.offer(12);
        ad.offerFirst(12);
        ad.offerLast(123);
        System.out.println("offer " + ad);

        System.out.println("************** PRIORITY QUEUE ********************");

        PriorityQueue pq = new PriorityQueue();
        pq.add(1);
        pq.add(2);
        pq.add(3);
        pq.add(4);
        pq.add(5);
        pq.add(6);
        System.out.println("PQ " + pq);

        System.out.println("************** TREE SET ********************");

        TreeSet ts = new TreeSet();
        ts.add(3);
        ts.add(24);
        ts.add(52);
        ts.add(35);
        System.out.println("ts " + ts);
        System.out.println("higher " + ts.higher(25));
        System.out.println("lower " + ts.lower(30));
        System.out.println("contains " + ts.contains(30));
        System.out.println("ceiling " + ts.ceiling(30));
        System.out.println("floor " + ts.floor(30));

    }
}
















