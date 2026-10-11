package javaoop;

public class TrainToy {
	String code_; //商品コード
	int pricinte_; //価格

	public TrainToy(String code, int pricinte) {
		code_ = code;
		pricinte_ = pricinte;

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
