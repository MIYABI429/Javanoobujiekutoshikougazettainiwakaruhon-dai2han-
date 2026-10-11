package javaoop;

public class ToyShop {
	public static void main(String[] args) {

		ShopKeeper suzuki = new ShopKeeper("鈴木");
		CarToy car1 = new CarToy("c001", 500);
		CarToy car2 = new CarToy("c001", 500);
		TrainToy train1 = new TrainToy("c001", 700);

		//価格チェックの実行
		suzuki.checkPrice(car1, car2, train1);

		//デモの実行
		suzuki.doDemo(car1, car2, train1);

	}
}
