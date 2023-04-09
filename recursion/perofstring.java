package recursion;

public class perofstring {
            public static void printperm (String str, String permuation){
                if(str.length()==0){
                    System.out.println(permuation);
                    return;
                }
            for (int i = 0; i < str.length(); i++) {
                char currchar = str.charAt(i);
                String newstr =str.substring(0,i)+ str.substring(i+1);
                printperm(newstr,permuation+currchar);
            }
        }
    public static void main(String args[]) {
                String str= "abcd";
                printperm(str,"");
    }

}