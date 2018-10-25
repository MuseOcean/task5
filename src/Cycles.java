
public class Cycles {

    public void task1() {
        int sum = 0;
        int col = 0;

        for (int i = 1; i <= 99; i++) {
            if (i % 2 == 0)
            col++;

            sum += i;


        }
        System.out.println("Количество четных чисел " + col);
        System.out.println("Сумма:" + sum);

    }


    public void task2(int n) {
        int var = 2;
        if (n > 1) {
            if (n % var != 0) {
                var++;
                System.out.println("число  простое ");

            } else if (n % var == 0){
                System.out.println("число составное ");
            }
        }

    }

    public void task3() {


    }

    public void task4(int n) {
        int result = 1;
        for (int i = 1; i <= n; i++) {
            result = result * i;

        }
        System.out.println(result);
    }

    public void task5(int n){
        int sum = 0;
        while(n != 0){

            sum += (n % 10);
            n/=10;
        }
        System.out.println(sum);

    }

    public void task6(int n){
        int n1 = 0;
        while(n != 0){
            n1 = n1*10 + n%10;
            n /= 10;
        }
        System.out.println(n1);

    }
}

