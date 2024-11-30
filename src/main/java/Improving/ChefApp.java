package Improving;

public class ChefApp {
    public static void main(String[] args) {
        ItalianChef icehf=new ItalianChef();
        icehf.SpecialDish();
        NormalChef nchef=new NormalChef();
        nchef.SpecialDish();
        nchef.MakeCake();
        nchef.MakePasta();
        nchef.MakeSalad();
    }
}
