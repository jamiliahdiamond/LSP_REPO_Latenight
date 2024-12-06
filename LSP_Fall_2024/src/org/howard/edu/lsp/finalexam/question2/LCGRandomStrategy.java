package org.howard.edu.lsp.finalexam.question2;

//Custom random number generator using Linear Con Generator (LCG)
public class LCGRandomStrategy implements RandomNumberStrategy {
 private long seed;
 private static final long A = 1664525;
 private static final long C = 1013904223;
 private static final long M = (long) Math.pow(2, 32);

 // Initialize seed with current time
 public LCGRandomStrategy() {
     this.seed = System.currentTimeMillis();
 }

 // Generate random number using LCG algorithm
 @Override
 public int generateRandomNumber() {
     seed = (A * seed + C) % M;
     return Math.abs((int) seed);
 }
}