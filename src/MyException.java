/**

*@author LM

*@file:PrintDate.java

*@package: PrintDate

*@project: PrintDate

*@date time:2017年11月14日下午10:27:36

*@location: https://github.com/ThegreatMZ/PrintDate.git

 */
public class MyException extends Exception{  
  
    String msg;  
    public MyException(String m){  
        msg="日期字符串"+m+"格式输入不正确";  
    }  
   public String toString(){  
        return msg;  
    }  
}  

