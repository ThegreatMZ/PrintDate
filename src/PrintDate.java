/**

*@author LM

*@file:PrintDate.java

*@package: PrintDate

*@project: PrintDate

*@date time:2017��11��14������10:27:36

*@location: https://github.com/ThegreatMZ/PrintDate.git

 */ 
public class PrintDate {  
  
    /** 
     * @param args 
     */  
    public static void main(String[] args) {  
        // TODO Auto-generated method stub  
  
       try{  
            //�õ�StrToDate�����  
            Class cs=Class.forName("PrintDate.StrToDate");  
            //�õ�ʵ�������ٿ��ٿռ�  
           StrToDate strtodate=(StrToDate)cs.newInstance();  
           strtodate.Convert();  
        }  
        catch(Exception e){  
            System.out.println("�����ַ������Ȳ��ԣ����ܼ���StrToDate��"+e.getMessage());  
        }  
    }  
 
}  
