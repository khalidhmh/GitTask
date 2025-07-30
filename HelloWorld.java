
class HelloJava {

    public static void main(String[] args) {
        printHelloWorld();
        Cpp c1 = new Cpp();
        c1.printHelloCpp();
    }

    public static void printHelloWorld() {
        System.out.println("Hello ,World");
    }
}

class Cpp {

    public static void printHelloCpp() {
        System.out.println("Hello Cpp!from ahmed");
        // testing conflict
    }


}
