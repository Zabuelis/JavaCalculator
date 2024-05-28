public class Calculator {

    private double num1 = 0, num2 = 0, res = 0;
    private char op;

    Calculator(){}

    public void calculation(){
        switch (op) {
            case '+':
                res = num1 + num2;
                break;
            case '-':
                res = num1 - num2;
                break;

            case '*':
                res = num1 * num2;
                break;

            case '/':
                res = num1 / num2;
                break;
            
            default:
                break;
        }
        num1=res;
    }





    public double getNum1() {
        return num1;
    }

    public void setNum1(double num1) {
        this.num1 = num1;
    }

    public double getNum2() {
        return num2;
    }

    public void setNum2(double num2) {
        this.num2 = num2;
    }

    public double getRes() {
        return res;
    }

    public void setRes(double res) {
        this.res = res;
    }

    public char getOp() {
        return op;
    }

    public void setOp(char op) {
        this.op = op;
    }


    
}
