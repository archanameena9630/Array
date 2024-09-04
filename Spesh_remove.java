package Arry;

public class Spesh_remove {
    public static void main(String[] args) {
    
    String str="my name is string";
    String newstr=" ";
    for(int i=0;i<str.length();i++){
        char ch=str.charAt(i);
        if(ch!=' '){
            newstr=newstr+ch;
        }
    }
    str=newstr;
    System.out.print(str);
    }
}
