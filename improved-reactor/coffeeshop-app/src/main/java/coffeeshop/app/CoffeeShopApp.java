package coffeeshop.app;

import java.util.ServiceLoader;

import coffeeshop.api.BeanGrinder;

public class CoffeeShopApp {
    public static void main(final String... args) {
        System.out.println("Hello, I'm your coffee shop app!");
        
        final String modulePath = System.getProperty("jdk.module.path", "");
        System.out.printf("Java Module Path:%n%s%n%n", modulePath.replace(":", System.lineSeparator()));
        
        final BeanGrinder grinder = ServiceLoader.load(BeanGrinder.class)
            .findFirst()
            .orElseThrow(() -> new RuntimeException("Could not find BeanGrinder implementation"));
    }
}