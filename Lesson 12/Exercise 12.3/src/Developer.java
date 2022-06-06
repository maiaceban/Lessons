import java.util.Arrays;

public class Developer extends Employee {
    private String mainLanguage;
    private String[] skills;

    public Developer(String name, String email, int experience, String mainLanguage, String[] skills) {
        super(name,email,experience);
        this.mainLanguage = mainLanguage;
        this.skills = skills;
    }

    public String getMainLanguage() {
        return mainLanguage;
    }

    public String[] getSkills() {
        return skills;
    }

    public String toString() {
        return "Name: " + getName()+"Language:" + mainLanguage + ", skills: "+ Arrays.toString(skills);
    }
}
