package org.howard.edu.lsp.finalexam.question2;

import java.util.Random;

//Uses Java's built-in Random class
public class JavaRandomStrategy 
implements RandomNumberStrategy {
 private Random random = new Random();

 // Generate random number using Java's Random
 @Override
 public int generateRandomNumber() {
     return Math.abs(random.nextInt());
 }
}