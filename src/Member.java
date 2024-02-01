public class Member implements java.lang.reflect.Member {
    private String memberID;
    private String firstName;
    private String lastName;

    public Member(String memberID, String firstName, String lastName) {
        this.memberID = memberID;
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public String getMemberID() {
        return memberID;
    }

    public void setMemberID(String memberID) {
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
        return null;
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
