/**

*@author LM

*@file:PrintDate.java

*@package: PrintDate

*@project: PrintDate

*@date time:2017年11月14日下午10:27:36

*@location: https://github.com/ThegreatMZ/PrintDate.git

 */ 
public class PrintDate {  
  
    /** 
     * @param args 
     */  
    public static void main(String[] args) {  
        // TODO Auto-generated method stub  
  
       try{  
            //得到StrToDate类对象  
            Class cs=Class.forName("PrintDate.StrToDate");  
            //得到实例，开辟开辟空间  
           StrToDate strtodate=(StrToDate)cs.newInstance();  
           strtodate.Convert();  
        }  
        catch(Exception e){  
            System.out.println("输入字符串长度不对，不能加载StrToDate类"+e.getMessage());  
        }  
    }  
 
}  
