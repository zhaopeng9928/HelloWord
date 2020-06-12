package com.zhaopeng.Printf;

/**
 * @Author zhaopeng
 * @Date 2020/5/14
 */
public class PrintfTest {
    public static void main(String[] args) {
        /**
         * "%"表示进行格式化输出，"%"之后的内容为格式的定义。
         * https://www.cnblogs.com/caiyishuai/p/9663706.html
         */
        double d = 345.678;
        String s = "你好！";
        int i = 1234;
        System.out.printf("%f", d);// "f"表示格式化输出浮点数。
        System.out.println();
        System.out.printf("%9.2f", d);// "9.2"中的9表示输出的长度，2表示小数点后的位数。
        System.out.println();
        System.out.printf("%+9.2f", d);// "+"表示输出的数带正负号。
        System.out.println();
        System.out.printf("%-9.4f", d);// "-"表示输出的数左对齐（默认为右对齐）。
        System.out.println();
        System.out.printf("%+-9.3f", d);// "+-"表示输出的数带正负号且左对齐。
        System.out.println();
        System.out.printf("%d", i);// "d"表示输出十进制整数。
        System.out.println();
        System.out.printf("%o", i);// "o"表示输出八进制整数。
        System.out.println();
        System.out.printf("%x", i);// "d"表示输出十六进制整数。
        System.out.println();
        System.out.printf("%#x", i);// "d"表示输出带有十六进制标志的整数。
        System.out.println();
        System.out.printf("%s", s);// "d"表示输出字符串。
        System.out.println();
        System.out.printf("输出一个浮点数：%f，一个整数：%d，一个字符串：%s", d, i, s);
        // 可以输出多个变量，注意顺序。
        System.out.println();
        System.out.printf("字符串：%2$s，%1$d的十六进制数：%1$#x", i, s);
        double x = 2.0 / 3;
        //保留两位小数,用printf与println的不同操作方法
        System.out.println("x is " + (int)(x * 100) / 100.0);
        System.out.printf("%.2f", x);



        String str=null;
        str=String.format("Hi,%s", "王力");
        System.out.println(str);
        str=String.format("Hi,%s:%s.%s", "王南","王力","王张");
        System.out.println(str);
        System.out.printf("字母a的大写是：%c %n", 'A');
        System.out.printf("3>7的结果是：%b %n", 3>7);
        System.out.printf("100的一半是：%d %n", 100/2);
        System.out.printf("100的16进制数是：%x %n", 100);
        System.out.printf("100的8进制数是：%o %n", 100);
        System.out.printf("50元的书打8.5折扣是：%f 元%n", 50*0.85);
        System.out.printf("上面价格的16进制数是：%a %n", 50*0.85);
        System.out.printf("上面价格的指数表示：%e %n", 50*0.85);
        System.out.printf("上面价格的指数和浮点数结果的长度较短的是：%g %n", 50*0.85);
        System.out.printf("上面的折扣是%d%% %n", 85);
        System.out.printf("字母A的散列码是：%h %n", 'A');
    }
}
