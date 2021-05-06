package edu.wctc;


    public class PrintQueueTester extends PrintQueue {
        public static void main(String[] args) {
            new TesterA().doStuff();
            new TesterB().doOtherStuff();

            // Replace XXX below with your flush method

            System.out.println(flush());

        }
    }

