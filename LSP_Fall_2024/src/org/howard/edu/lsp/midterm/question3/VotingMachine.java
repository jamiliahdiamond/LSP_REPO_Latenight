package org.howard.edu.lsp.midterm.question3;

import java.util.HashMap;
import java.util.Map;

public class VotingMachine {
    private Map<String, Integer> candidates;

    //initializes voting machine
    public VotingMachine() {
        candidates = new HashMap<>();
    }

    //adds new candidate to the voting machine
    public void addCandidate(String name) {
    	//adds candidate with zero votes
        candidates.putIfAbsent(name, 0);
    }

    //cast a vote towards the candidate
    public void castVote(String name) {
    	
    	//making sure the candidate exists
        if (candidates.containsKey(name)) {
        	//adds the vote count up by 1
            candidates.put(name, candidates.get(name) + 1);
        }
    }

    //Displays voting results
    @Override
    public String toString() {
        StringBuilder result = new StringBuilder();
        for (Map.Entry<String, Integer> entry : candidates.entrySet()) {
            result.append(entry.getKey()).append(": ").append(entry.getValue()).append(" votes\n");
        }
        return result.toString();
    }

    //Create a new voting machine instance
    public static void main(String[] args) {
        VotingMachine vm = new VotingMachine();
        vm.addCandidate("Alsobrooks");
        vm.castVote("Alsobrooks");
        vm.addCandidate("Hogan");
        System.out.println(vm.toString());
    }
}