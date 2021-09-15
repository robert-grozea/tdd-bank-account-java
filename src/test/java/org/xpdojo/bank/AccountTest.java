package org.xpdojo.bank;

import org.hamcrest.Matchers;
import org.junit.jupiter.api.Test;
import static org.hamcrest.MatcherAssert.assertThat;

public class AccountTest {

    @Test
    public void depositAmountsToIncreaseTheBalance()
    {
        Account account = new Account();
        account.deposit(10);
        account.deposit(10);
        account.deposit(10);
        assertThat(account.balance, Matchers.is(30));
    }
}
