package com.company;

public class Main
{
    static void  produceNullPointer()
    {
        String str = null;
        int[] num = new int[1];
        try
        {
            if (str.equals("test"))
            {
                System.out.println("无异常");
            }
        }
        catch (NullPointerException  e)
        {
            // print str
            System.out.println("捕获空指针异常："+ e);
        }
        finally
        {
            System.out.println("程序结束");
        }
    }

    static void  produceIndexOutOfBound()
    {
        int[] num = new int[1];
        try
        {
            System.out.println(num[1]);
        }
        catch (NullPointerException  e)
        {
            // print str
            System.out.println("捕获空指针异常："+ e);
        }
        catch (IndexOutOfBoundsException e)
        {
            // print str
            System.out.println("捕获索引越界异常："+ e);
        }
        finally
        {
            System.out.println("程序结束");
        }
    }

    public static void main(String[] args)
    {
//        String str = null;
//        int[] num = new int[1];
//        try
//        {
//            System.out.println(num[1]);
//            if (str.equals("test"))
//            {
//                System.out.println("无异常");
//            }
//        }
//        catch (NullPointerException  e)
//        {
//            // print str
//            System.out.println("捕获空指针异常："+ e);
//        }
//        catch (IndexOutOfBoundsException e)
//        {
//            // print str
//            System.out.println("捕获索引越界异常："+ e);
//        }
//        finally
//        {
//            System.out.println("程序结束");
//        }
        produceNullPointer();
        produceIndexOutOfBound();
    }
}
