/**

*@author LM

*@file:PrintDate.java

*@package: PrintDate

*@project: PrintDate

*@date time:2017年11月14日下午10:27:36

*@location: https://github.com/ThegreatMZ/PrintDate.git

 */
import java.util.Scanner;  
import java.util.Date;  
import java.text.ParseException;  
import java.text.SimpleDateFormat;  
public class StrToDate {  
    //存放字符串的数组  
    private char []arrays;  
    String str;  
    public void Convert(){  
        Scanner input=new Scanner(System.in);  
        System.out.println("--------------------------------------------------------");  
        System.out.println("-若您输入的字符串不是十位，则不能加载类                 ");  
        System.out.println("-若非xxxx/xx/xx格式，则抛出格式异常                     ");  
        System.out.println("-若您输入的‘x’非数字字符，则抛出数字异常              ");  
  
        System.out.println("请选择您需要的日期  1 输出系统时间  2 从键盘输入时间（格式必须为xxxx/xx/xx格式）:");  
        int xuanze=input.nextInt();  
        if(xuanze==1){  
            printSystemTime();  
        }else if(xuanze==2){  
  
            System.out.println("-请输入日期字符串(格式为xxxx/xx/xx):                    ");  
            str=input.next();  
            arrays=str.toCharArray();  
            try{  
                //检查数组中第4和第7个字符为‘/’  
                setForm(str);  
                //检查数组中第0、1、2、3、5、6、8、9个字符为数字字符  
                setNumber(str);  
                System.out.println("-请选择输出格式 1 为xxxx/xx/xx格式  2 为xxxx-xx-xx格式: ");  
                int geshi=input.nextInt();  
                switch(geshi){  
                case 1:form1();break;  
                case 2:form2();break;  
                default:  
                    System.out.println("格式标志输入错误");  
                }  
            }  
            //抛出异常  
            catch(NumberException e){  
                System.out.println(e.toString());  
            }  
            //抛出异常  
            catch(MyException e){  
                System.out.println(e.toString());  
            }  
       }else{  
            System.out.println("输入错误，请看以上提示");  
        }  
  
  
    }  
    public void setForm(String str) throws MyException{  
        //对格式进行检测  
        if(arrays[4]!='/'||arrays[7]!='/'){  
            throw new MyException(str);  
        }  
    }  
    public void setNumber(String str) throws NumberException{  
        //对数字进行检测  
        if((arrays[0]&arrays[1]&arrays[2]&arrays[3]&arrays[5]&arrays[6]&arrays[8]&arrays[9])<48||(arrays[0]&arrays[1]&arrays[2]&arrays[3]&arrays[5]&arrays[6]&arrays[8]&arrays[9])>57){  
            throw new NumberException(str);  
        }  
    }  
    private void form1(){  
        Date date=new Date();  
        //实现日期的格式化  
        SimpleDateFormat form=new SimpleDateFormat("日期为:"+str);  
        String timePattern=form.format(date);  
        System.out.println(timePattern);  
    }  
    private void form2(){  
        Date date=new Date();  
        //将输入字符串里的‘/’全部转化成‘-’  
        String str1=str.replaceAll("/", "-");   
        //实现日期的格式化  
        SimpleDateFormat form=new SimpleDateFormat("日期为:"+str1);  
        String timePattern=form.format(date);  
        System.out.println(timePattern);  
    }  
    private void printSystemTime(){  
        Date date=new Date();  
        //实现日期的格式化  
        SimpleDateFormat form=new SimpleDateFormat("'日期为:'y年M月d日");  
        String timePattern=form.format(date);  
        System.out.println(timePattern);  
    }  
    private void form3(){  
        Date date=new Date();  
        //实现日期的格式化  
        SimpleDateFormat form=new SimpleDateFormat("'日期为:'yyyy年MMMd日E");  
        try{  
            date=form.parse(str);  
        }catch(ParseException e){  
            e.printStackTrace();  
        }  
        System.out.println(date);  
    }  
}  
