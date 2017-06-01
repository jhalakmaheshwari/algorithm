package CTCI;

/**
 * Created by mahes on 6/1/2017.
 */
public class inStringRotatedString {

//    I approach
    public static boolean inString(String origStr, String rotStr){
        if(origStr.length() != rotStr.length()){
            return false;
        }else {
            int i = rotStr.indexOf(origStr.charAt(0));
            String resultant = rotStr.substring(i).concat(rotStr.substring(0, i));
            if (resultant.equalsIgnoreCase(origStr)) {
                return true;
            } else {
                return false;
            }
        }
    }

//    BETTER SOLUTION: think s1 as first string, s2 as second string. s2 will always be a subset of s1s1;;
    public static boolean isRotation(String s1, String s2){
        int length = s1.length();
        if(length==s2.length() && length > 0){
            s1=s1+s1;
            return s1.contains(s2);
        }
        return false;
    }

    public static void main(String[] args) {
//        TEST CASES
        System.out.println(inString("waterbottle","erbottlewat"));
        System.out.println(inString("waterbottle","ebottlewat"));
        System.out.println(inString("waterbottle","erbottlewap"));
        System.out.println(inString("A","A"));
        System.out.println(inString("abcdefgh","hijklmna"));

//        FOR BETTER SOLN:
        System.out.println();
        System.out.println("///////// BETTER APPROACH//////////");

        System.out.println(isRotation("waterbottle","erbottlewat"));
        System.out.println(isRotation("waterbottle","ebottlewat"));
        System.out.println(isRotation("waterbottle","erbottlewap"));
        System.out.println(isRotation("A","A"));
        System.out.println(isRotation("abcdefgh","hijklmna"));
    }
}
