package eiu;

import java.util.Scanner;

public class EIUMARKUP {

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int products = scanner.nextInt();

        // find the number of products are discounted (max 2000 products)
        int discountedProducts = Math.min(products, 2000);

        // find the number of products are 180 vnd
        int remainedProducts = Math.max(0, products - 2000);

        // the number of blocks, with 100 products for each
        int blocks = discountedProducts / 100;

        int total = 100 * blocks * (200 + 200 - blocks + 1) / 2
                    + discountedProducts % 100 * (200 - blocks)
                    + remainedProducts * 180;

        System.out.println(total);
    }
}
// each block have 100 products, which have specific discount
// nth block is 100 * (200 - nth + 1); block 1 = 100 * (200 - 1 + 1)
// payment = part 1 + part 2 + part 3
// part 1: full block: 100 * (200 + 200 - blocks + 1) / 2
// part 2: remaining discounted products: disPro % 100 * (200 - blocks)
// part 3: no discount products with 180 vnd
