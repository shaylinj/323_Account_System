package za.ac.nwu.web.domain.dto;

import com.fasterxml.jackson.annotation.JsonIgnore;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import za.ac.nwu.web.domain.persistence.AccountType;
import java.io.Serializable;
import java.util.Objects;

@ApiModel( value = "AccountType", description = "A DTO that represents the AccountType"
)
public class AccountTypeDto implements Serializable {

    private static final long serialVersionUID = 952717754384938262L;
    private String membersID;
    private String milesID;
    private String rewardsID;

    public AccountTypeDto(String membersID, String milesID, String rewardsID){
        this.membersID = membersID;
        this.milesID = milesID;
        this.rewardsID = rewardsID;
    }

    public AccountTypeDto(AccountType accountType) {
        this.setMilesID(accountType.getMilesID());
        this.setRewardsID(accountType.getRewardsID());
        this.setMembersID(accountType.getMembersID());
    }

    @ApiModelProperty(position = 1,
            value = "AccountType Members",
            name = "Members",
            dataType = "java.lang.String",
            required = true
    )
    public String getMembersID() {
        return membersID;
    }

    public void setMembersID(String membersID) {
        this.membersID = membersID;
    }

    @ApiModelProperty(position = 2,
            value = "AccountType Miles",
            name = "Miles",
            dataType = "java.lang.String",
            required = true
    )
    public String getMilesID() {
        return milesID;
    }

    public void setMilesID(String milesID) {
        this.milesID = milesID;
    }

    @ApiModelProperty(position = 3,
            value = "AccountType Rewards",
            name = "Rewards",
            dataType = "java.lang.String",
            required = false
    )
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
        AccountTypeDto that = (AccountTypeDto) o;
        return Objects.equals(membersID, that.membersID) && Objects.equals(milesID, that.milesID) &&
                Objects.equals(rewardsID, that.rewardsID);
    }

    @JsonIgnore
    public AccountType getAccountType(){
        return new AccountType(getMembersID(), getMilesID(), getRewardsID());
    }

    @Override
    public int hashCode() {
        return Objects.hash(membersID, milesID, rewardsID);
    }

    @Override
    public String toString() {
        return "AccountTypeDto{" +
                "members='" + membersID + '\'' +
                ", miles='" + milesID + '\'' +
                ", rewards=" + rewardsID +
                '}';
    }
}
