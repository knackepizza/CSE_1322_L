// Name: Nick Nettleton
// Class: 1322L
// Professor Adeojo

package Lab05;

public class Periodical extends Item {
    private int issueNum;

    public Periodical() {
        super();
        issueNum = 0;
    }
    public Periodical(String t, int i) {
        super(t);
        issueNum = i;
    }


    String getListing() {
        return super.getTitle() + ", " + issueNum;
    }

    int getIssueNum() { return issueNum; }
    
}
