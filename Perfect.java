public class Perfect {
    public static void main(String[] args) {
        int i, num, sum;
        System.out.println("The perfect numbers between 1 and 1000 are ");
        num=1;
        while (num<=1000) {
            sum=0;
            for (i=1; i<num;i++)
                if(num% i == 0)
                sum+=i;
            if (sum==num)
                System.out.println(num + " ");
                num++;
}}}
