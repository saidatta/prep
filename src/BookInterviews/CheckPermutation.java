package BookInterviews;

/**
 * Created by venkatamunnangi on 8/23/16.
 */
public class CheckPermutation {

    boolean checkPermutation(String a, String b) {

        if(a.length() ==0||b.length() ==0)
            return false;

        int[] x = new int[128];

        for(int i =0;i<a.length();i++) {
            x[a.charAt(i)]++;
        }

        for(int i =0;i<b.length();i++) {
            x[b.charAt(i)]++;
        }

        for(int i:x) {
            if(i == 1)
                return false;
        }
        return true;
    }

}
