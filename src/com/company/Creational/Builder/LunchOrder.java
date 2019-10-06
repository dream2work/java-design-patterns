package com.company.Creational.Builder;

public class LunchOrder {

    @Override
    public String toString() {
        return "LunchOrder{" +
                "salad='" + salad + '\'' +
                ", meat='" + meat + '\'' +
                '}';
    }

    public static class Builder {
        private String salad;
        private String meat;

        public Builder(){

        }

        public Builder salad(String salad){
            this.salad = salad;
            return this;
        }

        public Builder meat(String meat){
            this.meat = meat;
            return this;
        }

        public LunchOrder build(){
            return new LunchOrder(this);
        }

    }

    private LunchOrder(Builder buider){
        this.salad = buider.salad;
        this.meat = buider.meat;
    }

    private final String salad;
    private final String meat;


    public String getSalad() {
        return salad;
    }

    public String getMeat() {
        return meat;
    }

}
