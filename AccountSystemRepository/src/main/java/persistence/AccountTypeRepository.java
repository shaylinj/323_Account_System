package persistence;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import za.ac.nwu.web.domain.persistence.AccountType;

@Repository
public interface AccountTypeRepository extends JpaRepository <AccountType, Long>{
    @Query( value ="SELECT " +
            "at " +
            "FROM " +
            "AccountType at " +
            "WHERE at.memberID = :memberID"
    )
    AccountType getAccountTypeByMnemonic(String memberID);
}
