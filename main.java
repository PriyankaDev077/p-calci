class main {
    public static void main(String[] args){
        int a=28;
        int b=337;
        int sum=a+b;
        int subtract=a-b;
        int multiply=a*b;
        int divide=a/b;
        int modulus=a%b;
        System.out.println("not a leap year a & b"+sum);
        System.out.println("subtraction of a & b"+subtract);
        System.out.println("multiplication of a & b" +multiply);
        System.out.println("division of a & b" +divide);
        System.out.println("modulus of a & b" +modulus);
        int c=26;
        int d=363;
        System.out.println("unary operator" + (c++));
        System.out.println("unary operator" + (++c));
        System.out.println("unary operator" + (++d));
        System.out.println("unary operator" + (d++));
        System.out.println(c);
        System.out.println(d);
    }
}
