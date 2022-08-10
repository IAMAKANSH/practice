package leetcode;

public class AddBinary {

    public static void main(String[] args) {
        String a="10";
        String b="1";
        String res=addBinary(a,b);
        System.out.println(res);
    }

    private static String addBinary(String a, String b) {
        StringBuilder output=new StringBuilder();
        int carry=0;
        int aLen=a.length()-1;
        int bLen=b.length()-1;
        while (aLen>=0 || bLen>=0 || carry==1)
        {
            if (aLen>=0){
                carry +=a.charAt(aLen)-'0';
                aLen--;
            }
            if (bLen>=0){
                carry +=b.charAt(aLen)-'0';
                bLen--;
            }
            output.insert(0,carry%2);
            carry /=2;
        }
        return output.toString();
    }
}
