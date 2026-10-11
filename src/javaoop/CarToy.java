package javaoop;

public class CarToy {
	String code_; //商品コード
	int price_; //価格

	public CarToy(String code, int price) {
		code_ = code;
		price_ = price;

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
