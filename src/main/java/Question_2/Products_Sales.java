/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Question_2;

/**
 * ST10482636
 * @author lab_services_student
 */
public class Products_Sales implements IProductSales 
{
    private final int[][] salesData;
    private final int salesLimit;
    
    // For Total,ProductCount,Sales over, and Sales Under
    private int totalSales;
    private int productCount;
    private int salesOver;
    private int salesUnder;

    // Use this for the product sales
    public Products_Sales(int[][] salesData, int salesLimit) 
    {
        this.salesData = salesData;
        this.salesLimit = salesLimit;
        
        processSalesData();
    }
    
    private void processSalesData()
    {
        // Setting all our variables to 0
        totalSales = 0;
        productCount = 0;
        salesOver = 0;
        salesUnder = 0;

        if (salesData == null) return;

        for (int[] yearSales : salesData) 
        {
            for (int sale : yearSales) 
            {
                totalSales += sale;
                productCount++;
                
                if (sale > salesLimit) 
                {
                    salesOver++;
                } 
                
                else 
                {
                    salesUnder++;
                }
            }
        }
    }

    @Override
    public int[][] GetProductSales() 
    {
        return salesData;
    }

    @Override
    public int GetTotalSales() 
    {
        return totalSales;
    }

    @Override
    public int GetSalesOverLimit() 
    {
        return salesOver;
    }

    @Override
    public int GetSalesUnderLimit() 
    {
        return salesUnder;
    }
    
    @Override
    public int GetProductProcessed() 
    {
        return productCount;
    }

    @Override
    public double GetAverageSales() 
    {
        if (productCount == 0) 
        {
            return 0.0;
        }

        return (double) totalSales / productCount;
    }
}


