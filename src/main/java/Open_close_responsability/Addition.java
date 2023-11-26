package Open_close_responsability;

public class Addition implements CalculatorOperation{

    private double Left;
    private double Right;

    private double resulat;

    @Override
    public void Addition(double left, double right) {
        this.Left=left;
        this.Right=right;
    }

    @Override
    public void Subtraction(double left , double right) {
            this.Left=left;
            this.Right=right;
    }
    @Override
    public void perform(){
        resulat = Left + Right;
    }
}
