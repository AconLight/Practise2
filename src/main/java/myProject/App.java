package myProject;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        int[] myArray = doSth();
        System.out.println(myArray[0]);
        System.out.println(myArray[1]);
        System.out.println(myArray[2]);
        System.out.println(myArray[3]);
        System.out.println(myArray[4]);
        System.out.println(myArray[5]);
        System.out.println(myArray[6]);
        System.out.println(myArray[7]);
        System.out.println(myArray[8]);
        System.out.println(myArray[9]);
    }

    public static int[] doSth() {
        int[] myArray = new int[10];
        for (int i = 0; i < 10; i++) {
            myArray[i] = i*2;
        }
        return myArray;
    }

    public static Boolean isUnderAge(int age, Boolean isFromWisconsin) {
        if (isFromWisconsin) {
            if (age < 18) {
                return true;
            }
            else {
                return false;
            }
        }
        if (age < 21) {
            return true;
        } else {
            return false;
        }
    }

    public static int function (int x) {
        return x * 2;
    }
    public static int sum (int x, int y) {
        return x + y;
    }
    public static int div (int x, int y) {
        return x/y;
    }

}
