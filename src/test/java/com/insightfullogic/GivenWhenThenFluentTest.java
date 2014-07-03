package com.insightfullogic;


import com.insightfullogic.lambdabehave.JunitSuiteRunner;
import com.insightfullogic.lambdabehave.Suite;
import org.junit.Test;
import org.junit.runner.RunWith;

import static com.insightfullogic.lambdabehave.Suite.describe;
import static org.junit.Assert.assertFalse;

@RunWith(JunitSuiteRunner.class)
public class GivenWhenThenFluentTest {{

    describe("a cafe", it -> {

        Cafe cafe = new Cafe();

        it.should("never serve coffee it doesn't have", expect -> {
            Given:
            cafe.setCoffeesRemaining(1);

            When:
            cafe.serveCoffee();

            Then:
            expect.that(cafe.canServeCoffee()).is(false);
        });

    });

}}
