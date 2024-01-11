package candidate;

import java.util.ArrayList;

public class Election {
    private ArrayList<Candidate> candidates = new ArrayList<>();


    public void addCandidate(Candidate candidate){
        candidates.add(candidate);
    }
    public int getTotalVotes(){
        int totalNumberOfVotes =0;
        for(Candidate candidate: candidates){
            totalNumberOfVotes+= candidate.getNumberOfVotes();
        }
        return totalNumberOfVotes;
    }

    public ArrayList<Candidate> getCandidatesFromParty(String party){
        ArrayList<Candidate> candidatesFromParty = new ArrayList<>();
        for (Candidate candidate: candidates){
            if( candidate.getParty().equals(party)){
                candidatesFromParty.add(candidate);
            }
        }
        return candidatesFromParty;
    }

}
