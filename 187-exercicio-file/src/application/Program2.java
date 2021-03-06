package application;

import entities.Product;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Program2 {

    public static void main(String[] args) {
        List<Product> list = new ArrayList<>();

        String sourceFileStr = "c:\\temp\\source.csv";
        File sourceFile = new File(sourceFileStr);

        String sourceFolderStr = sourceFile.getParent();
        boolean sucsess = new File(sourceFolderStr + "\\out").mkdir();

        String targetFileStr = sourceFolderStr + "\\out\\summary.csv";

        try(BufferedReader br = new BufferedReader(new FileReader(sourceFile))){
            String itemCsv = br.readLine();
            while(itemCsv != null){
                String[] fields = itemCsv.split(",");
                String name = fields[0];
                Double price = Double.parseDouble(fields[1]);
                Integer quantity = Integer.parseInt(fields[2]);
                list.add(new Product(name,price,quantity));
                itemCsv = br.readLine();
            }
            try(BufferedWriter bw = new BufferedWriter(new FileWriter(targetFileStr))){
                for(Product item : list){
                    bw.write(item.getName() + ", " + String.format("%.2f", item.total()));
                    bw.newLine();
                }
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }


    }



}
