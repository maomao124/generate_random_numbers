import java.util.Random;

/**
 * Project name(项目名称)：生成随机数
 * Package(包名): PACKAGE_NAME
 * Class(类名): test
 * Author(作者）: mao
 * Author QQ：1296193245
 * Date(创建日期)： 2021/10/15
 * Time(创建时间)： 21:55
 * Version(版本): 1.0
 * Description(描述)： 在 Java 中要生成一个指定范围之内的随机数字有两种方法：一种是调用 Math 类的 random() 方法，一种是使用 Random 类。
 * Random 类提供了丰富的随机数生成方法，可以产生 boolean、int、long、float、byte 数组以及 double 类型的随机数，
 * 这是它与 random() 方法最大的不同之处。random() 方法只能产生 double 类型的 0~1 的随机数。
 * Random 类位于 java.util 包中，该类常用的有如下两个构造方法。
 * Random()：该构造方法使用一个和当前系统时间对应的数字作为种子数，然后使用这个种子数构造 Random 对象。
 * Random(long seed)：使用单个 long 类型的参数创建一个新的随机数生成器。
 * Random 类提供的所有方法生成的随机数字都是均匀分布的，也就是说区间内部的数字生成的概率是均等的，在表 1 中列出了 Random 类中常用的方法。
 * <p>
 * 表 1 Random 类的常用方法
 * 方法	说明
 * boolean nextBoolean()	生成一个随机的 boolean 值，生成 true 和 false 的值概率相等
 * double nextDouble()	生成一个随机的 double 值，数值介于 [0,1.0)，含 0 而不包含 1.0
 * int nextlnt()	生成一个随机的 int 值，该值介于 int 的区间，也就是 -231~231-1。如果
 * 需要生成指定区间的 int 值，则需要进行一定的数学变换
 * int nextlnt(int n)	生成一个随机的 int 值，该值介于 [0,n)，包含 0 而不包含 n。如果想生成
 * 指定区间的 int 值，也需要进行一定的数学变换
 * void setSeed(long seed)	重新设置 Random 对象中的种子数。设置完种子数以后的 Random 对象
 * 和相同种子数使用 new 关键字创建出的 Random 对象相同
 * long nextLong()	返回一个随机长整型数字
 * boolean nextBoolean()	返回一个随机布尔型值
 * float nextFloat()	返回一个随机浮点型数字
 * double nextDouble()	返回一个随机双精度值
 * <p>
 * <p>
 * Math 类的 random() 方法没有参数，它默认会返回大于等于 0.0、小于 1.0 的 double 类型随机数，
 * 即 0<=随机数<1.0。对 random() 方法返回的数字稍加处理，即可实现产生任意范围随机数的功能。
 */

public class test
{
    public static void randomtest()
    {
        Random r = new Random();
        double d1 = r.nextDouble(); // 生成[0,1.0]区间的小数
        double d2 = r.nextDouble() * 7; // 生成[0,7.0]区间的小数
        int i1 = r.nextInt(10); // 生成[0,10]区间的整数
        int i2 = r.nextInt(18) - 3; // 生成[-3,15)区间的整数
        long l1 = r.nextLong(); // 生成一个随机长整型值
        boolean b1 = r.nextBoolean(); // 生成一个随机布尔型值
        float f1 = r.nextFloat(); // 生成一个随机浮点型值
        System.out.println("生成的[0,1.0]区间的小数是：" + d1);
        System.out.println("生成的[0,7.0]区间的小数是：" + d2);
        System.out.println("生成的[0,10]区间的整数是：" + i1);
        System.out.println("生成的[-3,15]区间的整数是：" + i2);
        System.out.println("生成一个随机长整型值：" + l1);
        System.out.println("生成一个随机布尔型值：" + b1);
        System.out.println("生成一个随机浮点型值：" + f1);
        System.out.print("下期七星彩开奖号码预测：");
        for (int i = 1; i < 8; i++)
        {
            int num = r.nextInt(9); // 生成[0,9]区间的整数
            System.out.print(num);
        }
        int num_ture = 0;
        int num_false = 0;
        int sum = 200000000;
        boolean ture_or_false;
        for (int i = 0; i < sum; i++)
        {
            ture_or_false = r.nextBoolean();
            if (ture_or_false)
            {
                num_ture++;
            }
            else
            {
                num_false++;
            }
        }
        System.out.println();
        System.out.println("执行" + sum + "次nextBoolean方法的概率：");
        System.out.println("ture:" + num_ture);
        System.out.println("false:" + num_false);

        System.out.println("----------------------");
        System.out.println("Math类的random() 方法");
        int min = 2; // 定义随机数的最小值
        int max = 102; // 定义随机数的最大值
        // 产生一个2~100的数
        int s = (int) min + (int) (Math.random() * (max - min));
        if (s % 2 == 0)
        {
            // 如果是偶数就输出
            System.out.println("随机数是：" + s);
        }
        else
        {
            // 如果是奇数就加1后输出
            System.out.println("随机数是：" + (s + 1));
        }

    }

    public static void main(String[] args)
    {
        //------------------------------------------------------
        long startTime = System.nanoTime();   //获取开始时间
        //------------------------------------------------------

        randomtest();

        //------------------------------------------------------
        long endTime = System.nanoTime(); //获取结束时间
        if ((endTime - startTime) < 1000000)
        {
            double final_runtime;
            final_runtime = (endTime - startTime);
            final_runtime = final_runtime / 1000;
            System.out.println("算法运行时间： " + final_runtime + "微秒");
        }
        else if ((endTime - startTime) >= 1000000 && (endTime - startTime) < 10000000000L)
        {
            double final_runtime;
            final_runtime = (endTime - startTime) / 1000;
            final_runtime = final_runtime / 1000;
            System.out.println("算法运行时间： " + final_runtime + "毫秒");
        }
        else
        {
            double final_runtime;
            final_runtime = (endTime - startTime) / 10000;
            final_runtime = final_runtime / 100000;
            System.out.println("算法运行时间： " + final_runtime + "秒");
        }
        Runtime r = Runtime.getRuntime();
        float memory;
        memory = r.totalMemory();
        memory = memory / 1024 / 1024;
        System.out.printf("JVM总内存：%.3fMB\n", memory);
        memory = r.freeMemory();
        memory = memory / 1024 / 1024;
        System.out.printf(" 空闲内存：%.3fMB\n", memory);
        memory = r.totalMemory() - r.freeMemory();
        memory = memory / 1024 / 1024;
        System.out.printf("已使用的内存：%.4fMB\n", memory);
        //------------------------------------------------------
    }
}
