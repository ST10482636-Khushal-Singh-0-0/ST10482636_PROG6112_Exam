/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Question_2;

/**
 * ST10482636
 * @author lab_services_student
 */

// Q2.4 Added all nessasary things to the interface
public interface IProductSales 
{
    int[][] GetProductSales();
    int GetTotalSales();
    int GetSalesOverLimit();
    int GetSalesUnderLimit();
    int GetProductProcessed();
    double GetAverageSales();
}
