package org.errorzhu;

public class FizzBuzz {
    private int value;

    public FizzBuzz(int value) {
        this.value = value;
    }

    public String say() {

        if(this.value %3 ==0 && this.value %5 ==0){
            return "fizzbuzz";
        }


        if(this.value % 3 ==0){
            return "fizz";
        }

        if(this.value % 5==0){
            return "buzz";
        }
        return String.valueOf(this.value);
    }
}
