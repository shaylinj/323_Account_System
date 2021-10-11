package za.ac.nwu.ac.logic.flow;

import za.ac.nwu.web.domain.dto.AccountTypeDto;

public interface CreateAccountTypeFlow {
    AccountTypeDto create(AccountTypeDto accountType);
}
