package javaoop;

public class TrainToy {
	private String code_; //商品コード
	private int price_; //価格

	//コンストラクタ
	public TrainToy(String code, int price) {
		code_ = code;
		price_ = price;
	}

	public String getCode() {
		return code_;
	}

	public int getPrice() {
		return price_;
	}

	public void setPrice(int newPrice) {
		if (newPrice > 0) {
			price_ = newPrice;
		} else {
			//エラー時の処理
		}
	}

	//走る
	public void go() {
		System.out.println("ガタンゴトン");
	}

	//警笛を鳴らす
	public void horn() {
		System.out.println("プォー！");
	}
}
