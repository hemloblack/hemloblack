import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

                Scanner scanner = new Scanner(System.in);
                double[] hoghogh = new double[10];

                //  حقوق ۱۰ کارمند
                for (int i = 0; i < 10; i++) {
                    System.out.print("لطفاً حقوق کارمند " + (i + 1) + " را وارد کنید: ");
                    hoghogh[i] = scanner.nextDouble();
                }

                System.out.println("\nحقوق کارمندانی که بالای 5700 هستند و محاسبات مالیات و اضافه حقوق:");

                for (int i = 0; i < 10; i++) {
                    if (hoghogh[i] > 5700) {
                        double maliyat = hoghogh[i] * 0.05; // درصد مالیات
                        double children = hoghogh[i] * 0.07; //  درصد برای فرزندان
                        double finalhoghogh = hoghogh[i] - maliyat + children; // محاسبه حقوق نهایی

                        System.out.printf("کارمند %d: حقوق اولیه = %.2f, مالیات = %.2f, اضافه حقوق = %.2f, حقوق نهایی = %.2f\n",
                                (i + 1), hoghogh[i], maliyat, children, finalhoghogh);
                    }
                }

                scanner.close();
            }
        }