package candidate;

public class Candidate {
    private String name;
    private String party;
    private int numberOfVotes;

    public Candidate(String name, String party, int numberOfVotes){
        this.name = name;
        this.party = party;
        this.numberOfVotes = numberOfVotes;
    }

    public int getNumberOfVotes(){
        return numberOfVotes;
    }
    public String getParty(){
        return party;
    }

    @Override
    public String toString() {
        return "Candidate{" +
                "name='" + name + '\'' +
                ", party='" + party + '\'' +
                ", numberOfVotes=" + numberOfVotes +
                '}';
    }
}
