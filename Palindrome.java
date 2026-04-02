class Palindrome{
    public static void main(String[] args){
        String str="mam";
        String result="";
        for(int i=str.length()-1;i>=0;i--){
            char c=str.charAt(i);
            result += c;
        }
        if(str.equals(result)){
            System.out.println("palindrome");
        }else{
            System.out.println("not palindrome");
        }
    }
}