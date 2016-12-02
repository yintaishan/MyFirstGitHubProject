package com.example.diudiu.myfirstgithubproject;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

/**
 * Created by yintaishan on 01/12/2016.
 */

public class JUnitLifeCycle {

    @Before
    public void init(){
        System.out.println("------ method @Before init called------");
    }

    @BeforeClass
    public static void prepareDataForTest(){
        System.out.println("------ method @BeforeClass prepareDataForTest called------");
    }

    @Test
    public void test1(){
        System.out.println("------ method @Test test1 called------");
    }

    @Test
    public void test2() {
        System.out.println("------ method @Test test2 called------");
    }

    @Test
    public void test3() {
        System.out.println("------ method @Test test3 called------");
    }

    @After
    public void clearDataForTest(){
        System.out.println("------ method @After clearDataForTest called------");
    }

    @AfterClass
    public static void finish(){
        System.out.println("------ method @AfterClass finish called------");
    }
}
