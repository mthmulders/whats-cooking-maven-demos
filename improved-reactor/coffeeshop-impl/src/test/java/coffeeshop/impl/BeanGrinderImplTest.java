package coffeeshop.impl;

import coffeeshop.api.BeanGrinder;
import coffeeshop.api.Beans;

import org.assertj.core.api.WithAssertions;
import org.junit.jupiter.api.Test;

class BeanGrinderImplTest implements WithAssertions {
    private final BeanGrinder grinder = new BeanGrinderImpl();

    @Test
    void grind_some_beans() {
        var result = grinder.grind(new Beans());
        assertThat(result).isNotNull();
    }
}
