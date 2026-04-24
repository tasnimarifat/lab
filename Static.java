
public class Static {
    static int staticValue;
    int instanceValue;
    static void setStaticValue(int value) {
        staticValue = value; 
    }
void setInstanceValue(int value) {
        instanceValue = value;  }
    public static void main(String[] args) {
        Static.setStaticValue(100);
        Static staticExample = new Static();
        staticExample.setInstanceValue(200);
        System.out.println("Static Value: " + Static.staticValue);
        System.out.println("Instance Value: " + staticExample.instanceValue);    }   }
