package jp.rutla;

import java.io.Serializable;

import javax.validation.constraints.DecimalMax;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

// 一覧画面のバリデーション
public class MainValidation implements Serializable {

	private static final long serialVersionUID = 1L;
	
	@Pattern(regexp = "^[0-9]{4}/(0[1-9]|1[0-2])/(0[1-9]|[12][0-9]|3[01])$") // 日付にマッチする正規表現
	@Size(max = 10)
	@NotEmpty
	private String sApplicationDate; // 申請日
	
	@NotEmpty
	private String sReason; // 処理内容
	
	@DecimalMax(value = "100000", message = "残高オーバーです")
	private int iMoney; // 使用金額

	// 申請日のゲッター・セッター
	public String getsApplicationDate() {
		return sApplicationDate;
	}
	public void setsApplicationDate(String sApplicationDate) {
		this.sApplicationDate = sApplicationDate;
	}
	
	// 処理理由のゲッター・セッター
	public String getsReason() {
		return sReason;
	}
	public void setsReason(String sReason) {
		this.sReason = sReason;
	}

	// 使用金額のゲッター・セッター
	public int getiMoney() {
		return iMoney;
	}
	public void setiMoney(int iMoney) {
		this.iMoney = iMoney;
	}

}
