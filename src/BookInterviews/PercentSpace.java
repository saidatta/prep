package BookInterviews;

/**
 * Created by venkatamunnangi on 8/23/16.
 */
public class PercentSpace {

    final String PERCENT_WORD = "%20";
    char[] URLify(char[] str, int len) {
        int c = 0;
        int yy = 0;
        for(int i = 0;i<str.length;i++) {
            if(str[i] == ' ') {
                c++;
                yy++;
            } else {
                yy=0;
            }
        }
        c = c-yy;
        len = len -yy;
        int newLength = len + 2*c;
        char[] ans = new char[newLength];
        newLength = newLength -1;
        for(int i = str.length - yy;i>=0;i--) {
            if(str[i] == ' ') {
                ans[newLength--] = '%';
                ans[newLength--] = '2';
                ans[newLength--] = '0';
            } else {
                ans[newLength--] = str[i];
            }
        }
        return ans;
    }

}
