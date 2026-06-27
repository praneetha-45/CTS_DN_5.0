public class ForecastTest {

    public static void main(String[] args) {

        double currentValue = 10000;
        double growthRate = 0.10;   // 10%
        int years = 5;

        double futureValue = FinancialForecast.predictFutureValue(currentValue, growthRate, years);

        System.out.println("Financial Forecast");
        System.out.println("----------------------------");
        System.out.println("Current Value : ₹" + currentValue);
        System.out.println("Growth Rate   : " + (growthRate * 100) + "%");
        System.out.println("Years         : " + years);
        System.out.printf("Future Value  : ₹%.2f%n", futureValue);

        System.out.println();
        System.out.println("Analysis");
        System.out.println("----------------------------");
        System.out.println("Time Complexity : O(n)");
        System.out.println("Space Complexity: O(n)");
        System.out.println();
        System.out.println("Optimization:");
        System.out.println("1. Use iteration to remove recursion stack.");
        System.out.println("2. Use memoization if recursive calculations repeat.");
    }
}