package javaoop;

public class TrainToy {
	private String code_; //商品コード
	private int price_; //価格

	public TrainToy(String code, int price) {
		code_ = code;
		price_ = price;

	}

	public String getcode() {
		return code_;
	}

	public int pricinte_() {
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
	public void horn() {
		System.out.println("ブォー!");
	}

}
