package com.example.karlicos.robolectricpowermock;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.robolectric.RobolectricGradleTestRunner;
import org.robolectric.RuntimeEnvironment;
import org.robolectric.annotation.Config;

import static org.junit.Assert.*;

@RunWith(RobolectricGradleTestRunner.class)
@Config(constants = BuildConfig.class, sdk = 19)
public class MyApplicationTest {
    @Test
    public void test() {
        assertNotNull(RuntimeEnvironment.application);
    }
}