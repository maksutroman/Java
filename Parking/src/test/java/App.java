import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class App {

    public static void main(String[] args) throws IOException {
        BufferedReader buffered = new BufferedReader(new InputStreamReader(System.in));
        int chose = 0;
        ArrayList<Car> cars = new ArrayList<Car>();
        //    String make, String model, String year, String color, int number, long date
        cars.add( new Car("Ferari" ,"Testarossa","2018", "gray",21443,System.currentTimeMillis()));
        cars.add( new Car("Mersedes" ,"Benz","2015", "black",12234,System.currentTimeMillis()));
        cars.add( new Car("Pedgeot" ,"Partner","2005", "white",96564,System.currentTimeMillis()));
        cars.add( new Car("Skoda" ,"Octavia","2010", "green",34521,System.currentTimeMillis()));
        Parking parking = new Parking(cars);

        do {
            System.out.println("1)Показати всі машини. \n2)Додати новий автомобіль. \n3)Видалити машину. " +
                    "\n4)Знайти авто за роком випуску. \n5)Знайти авто за фірмою виробникомю. \n6)Вихід.");
            System.out.print("Ваш вибір: ");
            chose = Integer.parseInt(buffered.readLine());
            switch(chose){
                case 1:{
                    parking.PrintInfo();
                    break;
                }
                case 2:{
                    parking.AddNewCar();
                    break;
                }
                case 3:{
                    System.out.print("Введіть індекс авто: ");
                    int index = Integer.parseInt(buffered.readLine());

                    parking.RemoveCar(index-1);
                    break;
                }
                case 4:{
                    System.out.print("Введіть рік: ");
                    String year = buffered.readLine();

                    parking.FindCarByYear(year);
                    break;
                }
                case 5:{
                    System.out.print("Введіть фірму: ");
                    String firm = buffered.readLine();

                    parking.FindCarByFirm(firm);
                    break;
                }
            }

        }while(chose != 6);
    }
}
