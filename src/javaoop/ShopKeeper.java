package javaoop;

public class ShopKeeper {
	String name_;

	//価格をチェックする
	public void checkPrice(CarToy kuruma1, CarToy kuruma2, TrainToy densya1) {
		System.out.println("商品コード:" + name_ + "です。");

		System.out.println("商品コード:" + kuruma1.code_ + kuruma1.price_ + "です。");

		System.out.println(kuruma2.code_ + kuruma2.price_);

		System.out.println(densya1.code_ + densya1.price_);
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
