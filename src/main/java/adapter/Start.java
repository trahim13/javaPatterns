package adapter;

public class Start {
    public static void main(String[] args) {
        Duck duck = new SameDuck();
        Turkey turkey = new SameTurkey();

        duck.fly();
        duck.quack();

        System.out.println();

        turkey.gobble();
        turkey.go();

        System.out.println();

        AdapterTurkeyToDuck adapter = new AdapterTurkeyToDuck(turkey);


        testDuck(adapter);
    }

    static void testDuck(Duck duck) {
        duck.quack();
        duck.fly();

    }
}
