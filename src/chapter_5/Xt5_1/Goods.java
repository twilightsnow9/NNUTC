package chapter_5.Xt5_1;

import java.util.Arrays;

public class Goods {
    private int weight;
    private String productName;
    private int price;
    private int number;
    private String[] vendorList;
    public Goods(int weight, String productName, int price, int number, String[] vendorList) {
        super();
        this.weight = weight;
        this.productName = productName;
        this.price = price;
        this.number = number;
        this.vendorList = vendorList;
    }
    @Override
    public String toString() {
        return "商品: [重量=" + weight + ", 商品名称=" + productName + ", 价格=" + price + ", 配件数量="
        + number + ", 配件制造厂商列表=" + Arrays.toString(vendorList) + "]";
    }
     
    public boolean equals(Object obj) {
	    if (this == obj) {
	            return true;
	    }
    
        if (obj instanceof Goods) {
                Goods goods = (Goods) obj;
 
                if (this.weight == goods.weight && this.price == goods.price && this.productName.equals(goods.productName) && this.number == goods.number) {
                        for (int i = 0; i < this.vendorList.length; i++) {
                            if (this.vendorList[i] != goods.vendorList[i]) {
                                    return false;
                            }
                        }
                        return true;
                } else {
                        return false;
                }
        } else {
          return false;
        }
    }
    
    public static void main(String[] args) {
    
            String[] 厂商列表1 = { "小米", "华为", "中兴" };
            String[] 厂商列表2 = { "小米", "华为", "中兴" };
            Goods g1 = new Goods(40, "手机", 3000, 30, 厂商列表1);
            Goods g2 = new Goods(40, "平板", 5000, 30, 厂商列表2);
            System.out.println(g1);
            System.out.println(g2);
            System.out.println(g1.equals(g2));
    }
}