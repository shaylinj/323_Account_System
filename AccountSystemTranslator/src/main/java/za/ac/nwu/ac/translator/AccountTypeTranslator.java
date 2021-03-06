package za.ac.nwu.ac.translator;

import za.ac.nwu.web.domain.dto.AccountTypeDto;
import za.ac.nwu.web.domain.dto.AccountTypeDto;
import java.util.List;

public interface AccountTypeTranslator {
    List<AccountTypeDto> getAllAccountTypes();
    AccountTypeDto create(AccountTypeDto accountType);
    AccountTypeDto getAccountTypeByMnemonic(String mnemonic);
}
