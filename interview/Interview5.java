package interview;
/**
 * Interview5 请实现一个函数，将一个字符串中的每个空格替换成“%20”。 例如，当字符串为We Are
 * Happy.则经过替换之后的字符串为We%20Are%20Happy。
 */
public class Interview5 {
    public static void main(String[] args) {
        StringBuffer buffer =new StringBuffer("we are happy");
        System.out.println(replaceSpace(buffer));
    }
    
    public static String replaceSpace(StringBuffer str){
        for (int i = 0; i < str.length(); i++) {
            if (' '==(str.charAt(i))) {
                str.replace(i, i+1, "%20");
            }
        }
        return str.toString();
    }

    // public String replaceSpace(StringBuffer str) {
    //     int s= 0;
    //     for (int i = 0; i < str.length(); i++) {
    //         if (" ".equals(str.charAt(i))) {
    //             s++;
    //         }
    //     }
    //     int l= str.length()+2*s;
    //     int p=l;
    //     for (int i = 0; i < 2*s; i++) {
    //         str.append("");
    //     }
        
    //     for (int i = str.length()-1; i >=0; i--) {
    //         if (" ".equals(str.charAt(i))) {
    //             p-=3;
    //             str.insert(p, "%20");
    //         }
    //     }
    //     return "";
    // }

}