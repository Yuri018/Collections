package homeWork59;

import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Product> products = List.of(
                new Product("Samsung a10", 2, 50, "Phones"),
                new Product("Nokia c5", 1, 20, "Phones"),
                new Product("Iphone 7", 9, 150, "Phones"),
                new Product("Iphone 11", 7, 680, "Phones"),
                new Product("Samsung s20", 6, 450, "Phones"),
                new Product("Huawei i10", 5, 320, "Phones"),
                new Product("Sony k55", 10, 1560, "TV"),
                new Product("Ipad 10", 9, 1100, "Tablet"),
                new Product("Nokia 20", 8, 130, "Tablet"),
                new Product("Samsung f-32", 4, 205, "TV")
        );

        //Получите лист товаров, которые стоят дороже 200 евро.
        List<Product> productsOver200 = products.stream()
                .filter(product -> product.getPrice() > 200)
                .toList();
        System.out.println(productsOver200);

        //Получите лист товаров, отсортированных по рейтингу
        List<Product> sortByRating = products.stream()
                .sorted((a, b) -> Integer.compare(b.getRating(), a.getRating()))
                .toList();
        System.out.println(sortByRating);

        //Проверьте есть ли в листе товаров, товар с названием: "Iphone XR"
        boolean iphoneXr = products.stream()
                .anyMatch(product -> product.getTitle().equals("Iphone XR"));
        System.out.println(iphoneXr);

        //Создайте новый лист товаров на основании старого, пусть в новом листе рейтинг будет увеличен на 1.
        //Товары в исходном листе не должны измениться.
        List<Product> newProductList = products.stream()
                .map(product -> new Product(product.getTitle()
                        , product.getRating() + 1
                        , product.getPrice()
                        , product.getCategory()))
                .toList();
        System.out.println(newProductList);

        //Измените цену товаров в исходном листе товаров: увеличьте ее на 20 евро. Товары в исходном листе должны измениться.
        products.forEach(product -> product.setPrice(product.getPrice() + 20));
        System.out.println(products);

        //Посчитайте общую стоимость всех товаров в листе.
        Double totalPrice = products.stream()
                .map(Product::getPrice)
                .reduce(0.0, Double::sum);
        System.out.println(totalPrice);
    }
}
