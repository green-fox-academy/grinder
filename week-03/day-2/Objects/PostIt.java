package Objects;

import java.awt.*;
import java.awt.Color;
import java.awt.FlowLayout;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class PostIt {

    String backgroundColor;
    String text;
    String textColor;

    public PostIt(String backgroundColor, String text, String textColor) {
        this.backgroundColor = backgroundColor;
        this.text = text;
        this.textColor = textColor;

    }

    public String firstSentence() {

        String sentence = "Background color is: " + backgroundColor + " color is : " + text + ". and textcolor is : " + textColor;
        return sentence;
    }
}