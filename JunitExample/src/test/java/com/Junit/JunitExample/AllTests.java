package com.Junit.JunitExample;

import org.junit.platform.suite.api.SelectClasses;
import org.junit.platform.suite.api.Suite;

@Suite
@SelectClasses({ AppTest.class, CalcTest.class })
public class AllTests {

}
