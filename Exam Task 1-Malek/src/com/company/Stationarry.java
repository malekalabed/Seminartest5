package com.company;


    public class Stationarry extends Computers {
        private String roomPlacedIn;

        public Stationarry(String storeBoughtIn, String roomPlacedIn) {
            super(storeBoughtIn);
            this.roomPlacedIn = roomPlacedIn;
        }

        public String getRoomPlacedIn() {
            return roomPlacedIn;
        }
    }



