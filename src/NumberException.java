/**

*@author LM

*@file:PrintDate.java

*@package: PrintDate

*@project: PrintDate

*@date time:2017��11��14������10:27:36

*@location: https://github.com/ThegreatMZ/PrintDate.git

 */
public class NumberException extends Exception{  
  
    String msg;  
    public NumberException(String m){  
        msg="��������ַ���"+m+"�ꡢ�¡���λ�ô��з������ַ�";  
    }  
    public String toString(){  
        return msg;  
    }  
}  

