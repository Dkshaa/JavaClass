package Day8;

public class Calculate {
    public static void main(String []args){
        Addition ad =()->
                {
                   int num1=10;
                   int num2=9;
                   int res= num1+num2;
                    System.out.println("Addition:"+res);
                };
        ad.add();

        Subtraction s =(a,b)->
        {
            int res=a-b;
            System.out.println("Subtraction of two nums"+" "+res);


        };
        s.sub(20,5);

        Multiplication m =(c,d)->
        {
            int res=c*d;
            return res;
        };
            System.out.println("Multiplication of two numbers"+m.mul(5,3));

    }
}
