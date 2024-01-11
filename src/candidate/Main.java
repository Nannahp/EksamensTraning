package candidate;

public class Main {
    public static void main(String[] args) {
        new Main().run();
    }

    private void run() {
        Candidate candidate1= new Candidate("Me","Myparty", 100);
        Candidate candidate2 = new Candidate("You","Yourparty",10);
        Election election1 = new Election();
        election1.addCandidate(candidate1);
        election1.addCandidate(candidate2);

        System.out.println(election1.getTotalVotes());
        System.out.println(election1.getCandidatesFromParty("Myparty"));
        System.out.println(election1.getCandidatesFromParty("myparty"));
    }
}
