class DataTypes {
    byte byteValue = 10;
    short shortValue = 1000;
    int intValue = 100;
    long longValue = 100000;
    float floatValue = 25.5f;
    double doubleValue = 123.456;
    char charValue = 'A';
    boolean boolValue = true;

    void display() {
        System.out.println("Byte value      : " + byteValue);
        System.out.println("Short value     : " + shortValue);
        System.out.println("Integer value   : " + intValue);
        System.out.println("Long value      : " + longValue);
        System.out.println("Float value     : " + floatValue);
        System.out.println("Double value    : " + doubleValue);
        System.out.println("Character       : " + charValue);
        System.out.println("Boolean         : " + boolValue);

        System.out.println("\nMemory Ranges:");
        System.out.println("byte   : " + Byte.MIN_VALUE + " to " + Byte.MAX_VALUE);
        System.out.println("short  : " + Short.MIN_VALUE + " to " + Short.MAX_VALUE);
        System.out.println("int    : " + Integer.MIN_VALUE + " to " + Integer.MAX_VALUE);
        System.out.println("long   : " + Long.MIN_VALUE + " to " + Long.MAX_VALUE);
        System.out.println("float  : " + Float.MIN_VALUE + " to " + Float.MAX_VALUE);
        System.out.println("double : " + Double.MIN_VALUE + " to " + Double.MAX_VALUE);
        System.out.println("char   : " + (int) Character.MIN_VALUE + " to " + (int) Character.MAX_VALUE);
        System.out.println("boolean: true or false");
    }
}

public class DataTypeDemo {
    public static void main(String[] args) {
        DataTypes obj = new DataTypes();
        obj.display();
    }
}