
public class Constructor {
    int value; 
 public Constructor(int initialValue) {
        this.value = initialValue;    }
int getValue() {
        return value; }
public static void main(String[] args) {
Constructor constructorExample = new Constructor(12);
 System.out.println("Value: " + constructorExample.getValue());    }    }
