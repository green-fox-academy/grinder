package sharpieSet;

public class Sharpie {
    String color;
    float width;
    float inkAmount = 100;

public Sharpie(String color, float width) {
    this.color = color;
    this.width = width;
}
public void use() {
    inkAmount -=1;
}

public String function(){
    String sentence = "number of " + inkAmount;
    return sentence;
}
}
