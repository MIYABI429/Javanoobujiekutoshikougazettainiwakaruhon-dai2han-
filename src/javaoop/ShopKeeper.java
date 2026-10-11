package javaoop;

public class ShopKeeper {
	private String name_;

	public ShopKeeper(String name) {
		name_ = name;
	}

	//価格をチェックする
	public void checkPrice(CarToy kuruma1, CarToy kuruma2, TrainToy densya1) {
		System.out.println("商品コード:" + name_ + "です。");

		System.out.println("商品コード:" + kuruma1.getcode() + kuruma1.getprice() + "です。");

		System.out.println(kuruma2.getcode() + kuruma2.getprice());

		System.out.println(densya1.getcode() + densya1.getcode());
		System.out.println("￥");
	}

	//デモする
	public void doDemo(CarToy kuruma1, CarToy kuruma2, TrainToy densya1) {

		System.out.println(name_);
		System.out.println("クルマ１を走らせます");
		kuruma1.go();

		System.out.println("クルマ１を走らせます");
		kuruma2.go();

		System.out.println("電車を走らせます");
		densya1.go();
		System.out.println("￥");
	}
}
