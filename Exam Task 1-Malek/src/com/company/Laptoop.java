package com.company;


    public class Laptoop extends Computers {
        private String userName;
        private int minutesLeft;

        public Laptoop(String storeBoughtIn, String userName, int minutesLeft) {
            super(storeBoughtIn);
            this.userName = userName;
            this.minutesLeft = minutesLeft;
        }

        public String getUserName() {
            return userName;
        }

        public int getMinutesLeft() {
            return minutesLeft;
        }
    }

