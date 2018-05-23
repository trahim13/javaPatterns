package templatemethod;

public class Start {
    public static void main(String[] args) {
        Tea tea = new Tea();
        Coffe coffe = new Coffe();

        tea.prepareRecipe();
        System.out.println();
        coffe.prepareRecipe();
    }
}
