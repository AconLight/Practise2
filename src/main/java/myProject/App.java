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
        isUnder18Var = isUnderAge(7, true);
        System.out.println(isUnder18Var);
    }

    public static Boolean isUnderAge(int age, Boolean isFromWisconsin) {
        if (isFromWisconsin) {
            // sth here
        }
        if (age < 21) {
            return true;
        } else {
            return false;
        }
    }
}
