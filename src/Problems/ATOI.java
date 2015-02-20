package Problems;

public class ATOI
{
        public static void main(String[] args){
                String s = "ABCD";
                char[] chars = s.toCharArray();
                for(int i=0; i<s.length();i++){
                        int j = (int)chars[i];
                        System.out.print(" " + j);
                        System.out.println();
                }
        }
}

