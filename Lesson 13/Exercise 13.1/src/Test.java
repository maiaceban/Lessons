public class Test {
    public static void main(String[] args) {
        new Programmer(1);
    }
}

public class TeamLead {
    private int numTeamLead;

    public TeamLead(int numTeamLead) {
        this.numTeamLead = numTeamLead;
        employ();
    }

    protected void employ() {
        System.out.println(numTeamLead + " teamlead");
    }

    @Override
    public String toString() {
        return "TeamLead: numTeamLead =" + numTeamLead + ".";
    }
}

public class Programmer extends TeamLead {
    private int numProgrammer;

    public Programmer(int numProgrammer) {
        super(numProgrammer);
        this.numProgrammer = numProgrammer;
        employ();
    }

    @Override
    public String toString() {
        return "TeamLead: numProgrammer =" + numProgrammer + ".";
    }

    protected void employ() {
        System.out.println(numProgrammer + " programmer");
    }

}
