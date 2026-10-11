package javaoop;

public class ToyShop {
	public static void main(String[] args) {

		ShopKeeper suzuki = new ShopKeeper();
		CarToy car1 = new CarToy();
		CarToy car2 = new CarToy();
		TrainToy train1 = new TrainToy();

		suzuki.name_ = "鈴木";
		car1.code_ = "ｃ００１";
		car1.price_ = 500;
		car2.code_ = "c002";
		car2.price_ = 500;
		train1.code_ = "t001";
		train1.price_ = 700;

		//価格チェックの実行
		suzuki.checkPrice(car1, car2, train1);

		//デモの実行
		suzuki.doDemo(car1, car2, train1);

	}
}
