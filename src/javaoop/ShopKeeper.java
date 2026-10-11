package javaoop;

public class ShopKeeper {
	private String name_;

	public ShopKeeper(String name) {
		name_ = name;
	}

	//価格をチェックする
	public void checkPrice(CarToy kuruma, PatrolCarToy potoka, TrainToy densya1) {
		System.out.println("商品コード:" + name_ + "です。");

		System.out.println("商品コード:" + kuruma.getcode() + kuruma.getprice() + "です。");

		System.out.println(potoka.getcode() + potoka.getprice());

		System.out.println(densya1.getcode() + densya1.getcode());
		System.out.println("￥");
	}

	//デモする
	public void doDemo(CarToy kuruma, PatrolCarToy patoka, TrainToy densya) {
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
