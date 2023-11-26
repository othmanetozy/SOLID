package single_responsability;

public class TextManipulation {
    private String Text;
    public TextManipulation(String text)
    {
        this.Text=text;
    }
    public String getText()
    {
        return Text;
    }
    public void appendText(String NewText)
    {
        Text = Text.concat(NewText);
    }

}

