/**

*@author LM

*@file:PrintDate.java

*@package: PrintDate

*@project: PrintDate

*@date time:2017��11��14������10:27:36

*@location: https://github.com/ThegreatMZ/PrintDate.git

 */
public class MyException extends Exception{  
  
    String msg;  
    public MyException(String m){  
        msg="�����ַ���"+m+"��ʽ���벻��ȷ";  
    }  
   public String toString(){  
        return msg;  
    }  
}  

