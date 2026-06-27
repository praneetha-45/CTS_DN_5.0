public class SearchTest {

    public static void main(String[] args) {

        Product[] products = {

                new Product(105, "Laptop", "Electronics"),
                new Product(101, "Phone", "Electronics"),
                new Product(109, "Shoes", "Fashion"),
                new Product(103, "Watch", "Accessories"),
                new Product(107, "Tablet", "Electronics")

        };

        System.out.println("LINEAR SEARCH");

        Product p1 = SearchAlgorithms.linearSearch(products, 103);

        if (p1 != null)
            p1.display();
        else
            System.out.println("Product not found");

        SearchAlgorithms.sortProducts(products);

        System.out.println();

        System.out.println("BINARY SEARCH");

        Product p2 = SearchAlgorithms.binarySearch(products, 103);

        if (p2 != null)
            p2.display();
        else
            System.out.println("Product not found");

        System.out.println();

        System.out.println("Analysis");
        System.out.println("--------------------------------");
        System.out.println("Linear Search Time Complexity");
        System.out.println("Best Case    : O(1)");
        System.out.println("Average Case : O(n)");
        System.out.println("Worst Case   : O(n)");

        System.out.println();

        System.out.println("Binary Search Time Complexity");
        System.out.println("Best Case    : O(1)");
        System.out.println("Average Case : O(log n)");
        System.out.println("Worst Case   : O(log n)");

        System.out.println();

        System.out.println("Binary Search is more suitable");
        System.out.println("because it performs much faster");
        System.out.println("for large sorted datasets.");
    }
}