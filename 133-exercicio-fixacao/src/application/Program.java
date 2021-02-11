package application;

import entities.ImportedProduct;
import entities.Product;
import entities.UsedProduct;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) throws ParseException {

        Scanner sc = new Scanner(System.in);
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        List<Product> list = new ArrayList<>();

        System.out.println("Enter the number of products:");
        Integer n = sc.nextInt();
        for (int i=0; i < n; i++){
            System.out.print("Common, used or imported (c/u/i)? ");
            char selectType = sc.next().charAt(0);
            System.out.print("Name: ");
            String name = sc.next();
            System.out.print("Price: ");
            Double price = sc.nextDouble();
            if(selectType == 'i'){
                System.out.print("Customs fee: ");
                Double customsFee = sc.nextDouble();
                list.add(new ImportedProduct(name,price,customsFee));
            }else if(selectType == 'u'){
                System.out.println("Manufacture date (DD/MM/YYYY): ");
                Date manufactureDate = sdf.parse(sc.next());
                list.add(new UsedProduct(name, price,manufactureDate));
            }else {
                list.add(new Product(name, price));
            }
        }
        System.out.println("PRICE TAGS:");
        for(Product obj : list){
            System.out.println(obj.priceTag());
        }





        sc.close();
    }
}
