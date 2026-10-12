package javaoop;

public class ShopKeeper {
	private String name_; //名前w

	//コンストラクタ
	public ShopKeeper(String name) {
		name_ = name;
	}

	//価格をチェック
	public void checkPrice(CarToy kuruma, CarToy patoka, TrainToy densya) {
		/*System.out.println("私が店長の" + name_ + "です。これから価格をチェックします。");
		System.out.println("商品コード：" + kuruma.getCode()
				+ "の価格は" + kuruma.getPrice() + "円です。");
		System.out.println("商品コード：" + patoka.getCode()
				+ "の価格は" + patoka.getPrice() + "円です。");
		System.out.println("商品コード：" + densya.getCode()
				+ "の価格は" + densya.getPrice() + "円です。");
		System.out.println("\n");
		*/
	}

	//デモする
	public void doDemo(CarToy kuruma, CarToy patoka, TrainToy densya) {
		System.out.println("私が店長の" + name_ + "です。これからデモします。");
		System.out.println("クルマを走らせます。");
		kuruma.go();
		System.out.println("パトカーを走らせます。");
		patoka.go();
		System.out.println("電車を走らせます。");
		densya.go();
		System.out.println("\n");
	}
}
