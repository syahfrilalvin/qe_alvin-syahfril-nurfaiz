package org.example.hooks;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import org.example.app.drivers.AndroidInitiation;

public class AndroidDriverHook {


    @Before
    public void before(){
        AndroidInitiation.initialize();
    }

    @After
    public void after(){
        AndroidInitiation.quit();
    }
}
