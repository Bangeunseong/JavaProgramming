package Class.ShopService;

public class ShopService {
    private static ShopService shopService;

    private ShopService(){}

    public static ShopService getInstance(){return shopService;}
}
