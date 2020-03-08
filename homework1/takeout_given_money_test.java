package cn.h1;

import static org.junit.Assert.*;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

import org.junit.AfterClass;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized.Parameters;

@RunWith(Parameterized.class)
public class takeout_given_money_test {


        private int input;
        private boolean result;
        private takeout_given_money money = null;

        public takeout_given_money_test(int input, boolean result){
            this.input = input;
            this.result = result;

        }

        @Parameters
        public static Collection getData(){
            return Arrays.asList(new Object[][]{
                    {0,true},
                    {1,true},
                    {2,true},
                    {3,true},
                    {4,false},
                    {5,true},
                    {6,true},
                    {7,true},
                    {8,true},
                    {9,false},
                    {10,true},
                    {11,true},
                    {12,true},
                    {13,true},
                    {14,false},
                    {15,true},
                    {16,true},
                    {17,true},
                    {18,true},
                    {19,false},
                    {20,true},
                    {21,true},
                    {22,true},
                    {23,true},
                    {24,false},
                    {25,true},
                    {26,true},
                    {27,true},
                    {28,true},
                    {29,false},
                    {30,true},
                    {31,true},
                    {32,true},
                    {33,true},
                    {34,false},
                    {35,true},
                    {36,true},
                    {37,true},
                    {38,true},
                    {39,false},
                    {40,true},
                    {41,true},
                    {42,true},
                    {43,true},
                    {44,false},
                    {45,false},
                    {46,false},
                    {47,false},
                    {48,false},
                    {49,false},
                    {50,true},
                    {51,true},
                    {52,true},
                    {53,true},
                    {54,false},
                    {55,true},
                    {56,true},
                    {57,true},
                    {58,true},
                    {59,false},
                    {60,true},
                    {61,true},
                    {62,true},
                    {63,true},
                    {64,false},
                    {65,true},
                    {66,true},
                    {67,true},
                    {68,true},
                    {69,false},
                    {70,true},
                    {71,true},
                    {72,true},
                    {73,true},
                    {74,false},
                    {75,true},
                    {76,true},
                    {77,true},
                    {78,true},
                    {79,false},
                    {80,true},
                    {81,true},
                    {82,true},
                    {83,true},
                    {84,false},
                    {85,true},
                    {86,true},
                    {87,true},
                    {88,true},
                    {89,false},
                    {90,true},
                    {91,true},
                    {92,true},
                    {93,true},
                    {94,false}
            });

        }

        @Before
        public void setUp(){
            money = new takeout_given_money();
        }

        @Test
        public void testMoney() {
            assertEquals(this.result,money.is_equal(input));
        }

        @AfterClass
        public static void testResult(){
            System.out.println();
        }
    }


