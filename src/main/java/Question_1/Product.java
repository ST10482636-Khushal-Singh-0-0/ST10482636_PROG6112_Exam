/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Question_1;

/**
 * ST10482636
 * 2025_Exam
 * @author lab_services_student
 */
public class Product implements IProduct
{
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        // Data for the Array
        String[] quaters = {"QUATER 1", "QUATER 2", "QUATER 3"};
        String[] years = {"YEAR 1", "YEAR 2"};
        
        // Fill this into the array for the 2 years
        int[][] quaterSales = 
        {
            {300, 150, 700},
            {250, 200, 600}
        };
        
        // Setting up the new Product for the report
        Product product = new Product();
        
        // Total Sales
        int total = product.TotalSales(quaterSales);
        // Average Sales
        double average = product.AverageSales(quaterSales);
        // Maximum Sales
        int max = product.MaxSale(quaterSales);
        // Minimum Sales
        int min = product.MinSale(quaterSales);
        
        // Print the report
        System.out.println("PRODUCT SALES REPORT - 2025");
        System.out.println("----------------------------");
        System.out.println("Total sales: \t" + total);
        System.out.println("Average sales: \t" + Math.round(average)); 
        System.out.println("Maximum sales:\t" + max);
        System.out.println("Minimum sales:\t" + min);
        System.out.println("----------------------------");
    }

    // All the Override Methods were created from the IProduct.java file
    // Calculating the Total Sales
    @Override
    public int TotalSales(int[][] productSales) 
    {
        int total = 0;
        for (int[] yearSales : productSales) 
        {
            for (int sale : yearSales) 
            {
                total += sale;
            }
        }
        return total;
    }

    // Calculating the Average Sales
    @Override
    public double AverageSales(int[][] productSales) 
    {
        int total = TotalSales(productSales);
        int years = productSales.length;
        int quarters = productSales[0].length;
        int count = years * quarters;
        
        return (double) total / count;
    }

    // Calculating the Maximum Sales
    @Override
    public int MaxSale(int[][] productSales) 
    {
        int maxSale = productSales[0][0];
        
        for (int[] yearSales : productSales) 
        {
            for (int sale : yearSales) 
            {
                if (sale > maxSale) 
                {
                    maxSale = sale;
                }
            }
        }
        return maxSale;
    }

    // Calculating the Minimum Sales
    @Override
    public int MinSale(int[][] productSales) 
    {
        int minSale = productSales[0][0];
        
        for (int[] yearSales : productSales) 
        {
            for (int sale : yearSales) 
            {
                if (sale < minSale) 
                {
                    minSale = sale;
                }
            }
        }
        return minSale;
    }
    
}

