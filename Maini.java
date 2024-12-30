package Day16_HW;
class PrintNumber {
    void printnum() {
        System.out.println("Printing numbers...");
    }
}

class PrintInt extends PrintNumber {
    void printnum() {
        System.out.println("Printing integers...");
    }
}

class PrintFloat extends PrintNumber {
    void printnum() {
        System.out.println("Printing floats...");
    }
}

public class Maini {
    public static void main(String[] args) {
        PrintInt obj1 = new PrintInt();
        PrintFloat obj2 = new PrintFloat();

        obj1.printnum(); 
        obj2.printnum(); 
    }
}
