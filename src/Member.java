public class Member implements java.lang.reflect.Member {
    private int memberID = 0 ;
    private String firstName;
    private String lastName;

    public Member(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
        memberID++;
    }

    public int getMemberID() {
        return memberID;
    }

    public void setMemberID(int memberID) {
        this.memberID = memberID;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    @Override
    public Class<?> getDeclaringClass() {
        return null;
    }

    @Override
    public String getName() {
        return getFirstName() + " " + getLastName();
    }

    @Override
    public int getModifiers() {
        return 0;
    }

    @Override
    public boolean isSynthetic() {
        return false;
    }
}
