package com.pokutuna;

public class FizzBuzz {

    int count;

    public FizzBuzz() {
        this.count = 0;
    }

    public void output() {
        count++;
        if (this.count % 17 == 0){
            throw new RuntimeException();
        } else if(this.count % 15 == 0 ) {
            System.out.println("FizzBuzz");
        } else if(this.count % 5 == 0) {
            System.out.println("Buzz");
        }else if(this.count % 3 == 0) {
            System.out.println("Fizz");
        }else {
            System.out.println(this.count);
        }

    }

}
