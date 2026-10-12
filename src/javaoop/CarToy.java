package javaoop;

public class CarToy {
	private String code_; //商品コード
	private int price_; //価格

	//public CarToy(){}
	//コンストラクタ
	public CarToy(String code, int price) {
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
		System.out.println("ブロローッ");
	}

	//ライトを点ける
	public void light() {
		System.out.println("ピカーッ");
	}
}
