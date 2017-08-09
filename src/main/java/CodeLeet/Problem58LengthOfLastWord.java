package CodeLeet;

/**
 * Created by Jhalak on 8/9/2017.
 */
public class Problem58LengthOfLastWord {
    public int lengthOfLastWord(String s) {
        // return s.trim().length()-s.trim().lastIndexOf(" ")-1;
        if(s.length() == 0){
            return 0;
        }
        String[] strArr = s.split(" ");
        if(strArr.length > 0)
        {
            return strArr[strArr.length - 1].length();
        }

        return 0;
    }
}
