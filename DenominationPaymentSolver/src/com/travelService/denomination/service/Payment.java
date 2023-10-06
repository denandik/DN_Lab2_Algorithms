package com.travelService.denomination.service;

import java.util.Arrays;

import com.travelService.denomination.exception.CustomDividedByZeroException;
import com.travelService.denomination.exception.PaymentNotPossibleException;
import com.travelService.denomination.exception.*;

//

public class Payment {

    public void payWithDenomination(int[] arr, int amount) throws PaymentNotPossibleException {
        int[] count = new int[arr.length];
        Arrays.sort(arr);
        for (int i = arr.length-1; i >= 0; i--) {
            if (amount == 0) {
                break;
            }

            if (arr[i] <= amount) {
                try {

                    count[i] = amount / arr[i];
                    amount -= arr[i] * count[i];
                } catch (ArithmeticException err) {
                    throw new CustomDividedByZeroException(CustomExceptions.CUSTOM_DIVIDED_BY_ZERO, err);

                }
            } 
            else if(amount > 0)
            {
            	 count[i]=0;
            }
            else {
                throw new PaymentNotPossibleException(CustomExceptions.PAYMENT_NOT_POSSIBLE);
            }
        }

        printDenominationCount(arr, count);

    }

    private void printDenominationCount(int[] denominations, int[] count) {
        System.out.println("Your payment approach in order to give min no of notes will be: ");
        for (int i = count.length-1; i>=0; i--) {
        	if(count[i]!=0)
            System.out.println(String.format("%d: %d", denominations[i], count[i]));
        }
    }

}