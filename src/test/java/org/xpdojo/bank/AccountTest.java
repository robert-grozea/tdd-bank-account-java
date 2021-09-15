package org.xpdojo.bank;

import org.hamcrest.Matchers;
import org.junit.jupiter.api.Test;
import static org.hamcrest.MatcherAssert.assertThat;

public class AccountTest {

    @Test
    public void depositAmountsToIncreaseTheBalance() {
        Account account = new Account();
        account.deposit(10);
        account.deposit(10);
        account.deposit(10);
        assertThat(account.balance, Matchers.is(30));
    }

    @Test
    public void withdrawAmountsToDecreaseBalance() {
        Account account = new Account();
        account.withdraw(5);
        account.withdraw(5);
        assertThat(account.balance, Matchers.is(20));
    }
}
