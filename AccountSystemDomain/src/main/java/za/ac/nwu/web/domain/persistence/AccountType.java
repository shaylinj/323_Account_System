package za.ac.nwu.web.domain.persistence;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Objects;
import java.util.Set;

@Entity
@Table(name = "ACCOUNTS" , schema = "HR")
public class AccountType implements Serializable{

    private static final long serialVersionUID = -5856907119259757293L;
    private long accountID;
    private String membersID;
    private String milesID;
    private String rewardsID;

    public AccountType(long accountID, String membersID, String milesID, String rewardsID) {
        this.accountID = accountID;
        this.membersID = membersID;
        this.milesID = milesID;
        this.rewardsID = rewardsID;
    }

    public AccountType(String membersID, String milesID, String rewardsID) {
//        this.membersID = membersID();
        this.milesID = milesID;
        this.rewardsID = rewardsID;
    }

    @Id
    @SequenceGenerator(name = "DEMO_GENERIC_SEQ", sequenceName = "HR.DEMO_GENERIC_SEQ", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "DEMO_GENERIC_SEQ")
    
    @Column(name = "ACCOUNT_ID") ///Primary Key
    public String getAccountID() {
        String accountID = "";
        return accountID;
    }
    public void setAccountID(long accountID) {
        this.accountID = accountID;
    }

    @Column(name = "MEMBERS_ID")
    public String getMembersID() {
        String membersID = "";
        return membersID;}
    public void setMemberID(String membersID) {
        this.membersID = membersID;
    }

    @Column(name = "MILES_ID")
    public String getMilesID() {
        return milesID;
    }
    public void setMilesID(String milesID) {
        this.milesID = milesID;
    }

    @Column(name = "REWARDS_ID")
    public String getRewardsID() {
        return String.valueOf(rewardsID);
    }
    public void setRewardsID(String rewardsID) {
        this.rewardsID = rewardsID;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        AccountType that = (AccountType) o;
        return Objects.equals(accountID,that.accountID) && Objects.equals(membersID, that.membersID) && 
                Objects.equals(milesID, that.milesID) && Objects.equals(rewardsID, that.rewardsID);
    }

    @Override
    public int hashCode() {
        return Objects.hash(accountID, membersID, milesID, rewardsID);
    }

    @Override
    public String toString() {
        return "AccountType{" + "accountID=" + accountID + ", membersID='" + membersID + '\'' +
                ", milesID='" + milesID + '\'' + ", rewardsID=" + rewardsID + '}';
    }
}
