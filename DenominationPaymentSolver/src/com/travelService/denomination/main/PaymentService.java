package com.travelService.denomination.main;
import java.util.InputMismatchException;
import java.util.Scanner;

import com.travelService.denomination.exception.*;
import com.travelService.denomination.service.*;


public class PaymentService {
	 public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        Payment payment = new Payment();
	        try {
	            try {
	                System.out.println("Enter the number of currency denominations:");
	                int numDenominations = scanner.nextInt();
	                if (numDenominations <= 0) {
	                    throw new InvalidInputException(CustomExceptions.INVALID_INPUT);
	                }

	                int[] denominations = new int[numDenominations];
	                System.out.println("Enter the values of currency denominations:");
	                for (int i = 0; i < numDenominations; i++) {
	                    int denominationValue = scanner.nextInt();
	                    if (denominationValue <= 0) {
	                        throw new InvalidInputException(CustomExceptions.INVALID_INPUT);
	                    }
	                    denominations[i] = denominationValue;
	                }


	                System.out.println("Enter the amount you want to pay:");
	                int amount = scanner.nextInt();
	                if (amount <= 0) {
	                    throw new InvalidInputException(CustomExceptions.INVALID_INPUT);
	                }

	                payment.payWithDenomination(denominations, amount);
	            } catch (InputMismatchException e) {
	                throw new CustomInputMismatchException(CustomExceptions.CUSTOM_INPUT_MISMATCH, e);
	            }
	        } catch (CustomIndexOutOfBondException e) {
	            System.out.println(e);
	        } catch (CustomDividedByZeroException e) {
	            System.out.println(e);
	        } catch (CustomInputMismatchException e) {
	            System.out.println(e);
	            System.out.println("-----------------------------------\n \n");
	            System.out.println("           running again...\n \n");
	            System.out.println("----------------------------------- \n \n");
	            main(args);
	        } catch (PaymentNotPossibleException e) {
	            System.out.println(e);
	        } catch (InvalidInputException e) {
	            System.out.println(e);
	        } finally {
	            if (scanner != null)
	                scanner.close();
	        }
	    }
}
