/* The read4 API is defined in the parent class Reader4.
      int read4(char[] buf); */

public class Solution extends Reader4 {
    /**
     * @param buf Destination buffer
     * @param n   Maximum number of characters to read
     * @return    The number of characters read
     */
    public int read(char[] buf, int n) {
        /*if(buf==null||buf.length==0){
            return 0;
        }*/
        if(n<=4){
            return read4(buf);
        }
        int time = n/4;
        int remain = n%4;
        int count = 0;
        while(count<time){
            read4(buf);
            count++;
        }
    }
}