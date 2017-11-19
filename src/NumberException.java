/**

*@author LM

*@file:PrintDate.java

*@package: PrintDate

*@project: PrintDate

*@date time:2017年11月14日下午10:27:36

*@location: https://github.com/ThegreatMZ/PrintDate.git

 */
public class NumberException extends Exception{  
  
    String msg;  
    public NumberException(String m){  
        msg="您输入的字符串"+m+"年、月、日位置处有非数字字符";  
    }  
    public String toString(){  
        return msg;  
    }  
}  

