package Arithmetic;

public class Arithmetic <T extends Number> {
    private Number num1;
    private Number num2;

    public Arithmetic(Number num1, Number num2){
        this.num1 = num1;
        this.num2 = num2;
    }

    public Number add(){
        return num1.doubleValue() + num2.doubleValue();
    }

    public Number subtract(){
        return num1.doubleValue() - num2.doubleValue();
    }

    public Number divide(){
        double ans = 0;

        try{
            ans = num1.doubleValue() / num2.doubleValue();
        } catch (ArithmeticException e){
            System.out.println("Can't divide by zero");
        }

        return ans;
    }

    public Number getMin(){
        return Math.min(num1.doubleValue(), num2.doubleValue());
    }

    public Number getMax(){
        return Math.max(num1.doubleValue(), num2.doubleValue());
    }

}
