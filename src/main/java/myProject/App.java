package myProject;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        Boolean isUnder18Var;
        isUnder18Var = isUnderAge(19, true);
        System.out.println(isUnder18Var);
        isUnder18Var = isUnderAge(17, true);
        System.out.println(isUnder18Var);
        isUnder18Var = isUnderAge(30, false);
        System.out.println(isUnder18Var);
        isUnder18Var = isUnderAge(19, false);
        System.out.println(isUnder18Var);

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
