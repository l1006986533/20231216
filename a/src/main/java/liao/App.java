package liao;

import com.github.sitture.envconfig.*;

public class App {
    public static void main(String[] args) {
        System.out.println(EnvConfig.get("my.first.property"));
    }
}
