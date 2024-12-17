package JAVA101;
import java.util.Scanner;
public class onucuncu_ornek {
    public static void main(String[] args) {
        int ay , gun ;
        Scanner input = new Scanner(System.in);

        System.out.println("doğum ayınızı giriniz: ");
        ay = input.nextInt();

        System.out.println("doğum gününüzü giriniz: ");
        gun = input.nextInt();

        if ( ay == 1 ){
            if (gun>1 && gun<31){
                if (gun<22){
                    System.out.println("oğlak burcu");
                }else{
                    System.out.println("kova burcu");
                }
            }else {
                System.out.println("hatalı bir gün girdiniz");
            }
        }
        if ( ay == 2 ){
            if (gun>1 && gun<31){
                if (gun<19){
                    System.out.println("kova burcu");
                }else{
                    System.out.println("balık burcu");
                }
            }else {
                System.out.println("hatalı bir gün girdiniz");
            }
        }
        if ( ay == 3 ){
            if (gun>1 && gun<31){
                if (gun<20){
                    System.out.println("balık burcu");
                }else{
                    System.out.println("koç burcu");
                }
            }else {
                System.out.println("hatalı bir gün girdiniz");
            }
        }
        if ( ay == 4 ){
            if (gun>1 && gun<31){
                if (gun<20){
                    System.out.println("koç burcu");
                }else{
                    System.out.println("boğa burcu");
                }
            }else {
                System.out.println("hatalı bir gün girdiniz");
            }
        }
        if ( ay == 5 ){
            if (gun>1 && gun<31){
                if (gun<22){
                    System.out.println("boğa burcu");
                }else{
                    System.out.println("ikizler burcu");
                }
            }else {
                System.out.println("hatalı bir gün girdiniz");
            }
        }
        if ( ay == 6 ){
            if (gun>1 && gun<31){
                if (gun<23){
                    System.out.println("ikizler burcu");
                }else{
                    System.out.println("yengeç burcu");
                }
            }else {
                System.out.println("hatalı bir gün girdiniz");
            }
        }
        if ( ay == 7 ){
            if (gun>1 && gun<31){
                if (gun<23){
                    System.out.println("yengeç burcu");
                }else{
                    System.out.println("aslan burcu");
                }
            }else {
                System.out.println("hatalı bir gün girdiniz");
            }
        }
        if ( ay == 8 ){
            if (gun>1 && gun<31){
                if (gun<23){
                    System.out.println("aslan burcu");
                }else{
                    System.out.println("başak burcu");
                }
            }else {
                System.out.println("hatalı bir gün girdiniz");
            }
        }
        if ( ay == 9 ){
            if (gun>1 && gun<31){
                if (gun<23){
                    System.out.println("başak burcu");
                }else{
                    System.out.println("terazi burcu");
                }
            }else {
                System.out.println("hatalı bir gün girdiniz");
            }
        }
        if ( ay == 10 ){
            if (gun>1 && gun<31){
                if (gun<23){
                    System.out.println("terazi burcu");
                }else{
                    System.out.println("akrep burcu");
                }
            }else {
                System.out.println("hatalı bir gün girdiniz");
            }
        }
        if ( ay == 11 ){
            if (gun>1 && gun<31){
                if (gun<22){
                    System.out.println("akrep burcu");
                }else{
                    System.out.println("yay burcu");
                }
            }else {
                System.out.println("hatalı bir gün girdiniz");
            }
        }
        if ( ay == 12 ){
            if (gun>1 && gun<31){
                if (gun<23){
                    System.out.println("yay burcu");
                }else{
                    System.out.println("oğlak burcu");
                }
            }else {
                System.out.println("hatalı bir gün girdiniz");
            }
        }

    }
}
