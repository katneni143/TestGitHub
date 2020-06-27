package zreoBankPages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage {
	
	@FindBy(id = "account_summary_tab") WebElement TabAccountSummary;
	@FindBy(id = "account_activity_tab") WebElement TabAccountActivity;
	@FindBy(id = "transfer_funds_tab") WebElement TabTransferFunds;
	@FindBy(id = "pay_bills_tab") WebElement TabPayBills;
	@FindBy(id = "money_map_tab") WebElement TabMyMoneyMap;
	@FindBy(id = "online_statements_tab") WebElement TabOnlineStatement;
	@FindBy(className = "icon-user") WebElement UserIcon;
	@FindBy(id = "logout_link") WebElement LogOutLink;
	
/////// Accounts Page
	public void goToAccountsPage() {
		TabAccountActivity.click();
	}
/////// Transfer Funds Page
	public void goToTransferFundsPage() {
		TabTransferFunds.click();
	}
/////// Pay Bills Tab
	public void goToPayBillsPage() {
		TabPayBills.click();
	}
	
}
