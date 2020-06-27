package zreoBankPages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class TransferFunds {
	@FindBy(xpath = "//*[text() = 'Transfer Money & Make Payments']") WebElement TransferMoney;
	@FindBy(id = "tf_fromAccountId") WebElement FromAccount;
	@FindBy(id = "tf_toAccountId") WebElement ToAccount;
	@FindBy(id = "tf_amount") WebElement TransferAmount;
	@FindBy(id = "tf_description") WebElement TransferDescription;
	@FindBy(id = "btn_submit") WebElement SubmitButton;
	
/////// Transfer Funds Page Displayed
	public Boolean TransferFundsPageIsDisplayed() {
		Boolean pageDisplayed = false;
		try {
			Assert.assertTrue(TransferMoney.isDisplayed());
			pageDisplayed = true;
		}catch(Exception e) {
			pageDisplayed = false;
		}
		return pageDisplayed;
	}

/////// Select from Account
	public void SelectTransferFrom(int strAccountIndex) {
		Select accountFromList = new Select(FromAccount);
		accountFromList.selectByIndex(strAccountIndex);
	}
	public void SelectTransferFrom(String strAccountName) {
		Select accountFromList = new Select(FromAccount);
		accountFromList.selectByVisibleText(strAccountName);
	}
}
