import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        String[] names = new String[10];
        System.out.println("نام کاربر را وارد کنید");
        for(int i=0;i<10;i++)
        {
            System.out.println("اسم"+(i+1)+":");
            names[i]=scanner.nextLine();
            if (!names[i].trim().isEmpty()) {
                break; }
            else {
                System.out.println("خطا: نام نمی‌تواند خالی باشد. لطفاً دوباره وارد کنید.");
            }
        }
        System.out.println("تعداد کاراکتر های هر اسم:");
        for (String name:names){
            System.out.println(name.length()+":"+name+","+"کاراکتر");
    }
    }
}