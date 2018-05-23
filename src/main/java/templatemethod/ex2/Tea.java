package templatemethod.ex2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Tea extends CoffeBevaregeInterceptor {
    @Override
    void brew() {
        System.out.println("Tea");
    }

    @Override
    void addCondiments() {
        System.out.println("Adding milk adn sugar.");
    }

    @Override
    boolean customerWantCondiments() {
        String answer = getUserInput();
        if (answer.startsWith("y")) {
            return true;
        }

        return false;
    }

    private String getUserInput() {
        String answer = null;

        System.out.println("Milk and sugar (y/n)?");

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        try {
            answer = bufferedReader.readLine();
        } catch (IOException e) {
            System.err.println("Error read answer.");
        }

        if (answer == null) {
            return "no";
        }

        return answer;
    }
}
