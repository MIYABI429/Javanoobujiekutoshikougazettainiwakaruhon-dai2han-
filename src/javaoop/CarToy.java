package javaoop;

public class CarToy {
	private String code_; //商品コード
	private int price_; //価格

	public CarToy(String code, int price) {
		code_ = code;
		price_ = price;

	}

	public String getcode() {
		return code_;

	}

	public int getprice() {
		return price_;
	}

	public void setPrice(int newprice) {
		if (newprice > 0) {
			price_ = newprice;
		} else {
			//エラー時の処理
		}
	}

	//走る
	public void go() {
		System.out.println("ガタンゴトン");

	}

	//ライトを付ける
	public void light() {
		System.out.println("ピカーッ");
	}
}
