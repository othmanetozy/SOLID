package single_responsability;

public class Text_Printer {
    TextManipulation textManipulation;

    public Text_Printer(TextManipulation textManipulation)
    {
        this.textManipulation = textManipulation;
    }

    public void printText(){
        System.out.println(textManipulation.getText());
    }

}
