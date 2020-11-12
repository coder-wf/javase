package com.wyt.fix;
public class Millionaire {
    public static void main(String[] args) {
    	int fundPerMonth = 1000;
    	int fundPerYear = fundPerMonth *12;
    	float rate = 0.20f;
    	//F = p* ( (1+r)^n );
    	int sum = 0;
    	int target = 1000*1000; 
    	for (int j = 1; j < 100; j++) {
        	int year = j;
        	float compoundInterestRate = 1;
        	for (int i = 0; i < year; i++) {
        		compoundInterestRate = compoundInterestRate * (1+rate);
    		}
        	int compoundInterest = (int) (fundPerYear * compoundInterestRate);			

        	sum +=compoundInterest;
        	System.out.println("经过" + year + " 年， 总收入 " + sum);
        	if(sum>=target){
        		System.out.println("一共需要" + year + "年，累计收入超过" + target );
        		break;
        	}
		}

    }
}
