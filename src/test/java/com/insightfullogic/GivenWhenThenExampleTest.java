package com.insightfullogic;


import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertFalse;

public class GivenWhenThenExampleTest {

    Cafe cafe;

    @Before
    public void setup() {
        cafe = new Cafe();
    }

    @Test
    public void cafeShouldNeverServeCoffeeItDoesntHave() {
        Given:
        cafe.setCoffeesRemaining(1);

        When:
        cafe.serveCoffee();

        Then:
        assertFalse(cafe.canServeCoffee());
    }

}
