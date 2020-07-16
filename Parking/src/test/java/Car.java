
import java.util.Date;
public class Car {

        private String Model;
        private String Firm;
        private String Year;
        private String Color;
        private int Number;
        private long  Date;

    public void setModel(String model) {
        Model = model;
    }

    public String getModel() {
        return Model;
    }
        public void setFirm(String firm) {
            Firm = firm;
        }
    public String getFirm() {
        return Firm;
    }

        public void setYear(String year) {
            Year = year;
        }

         public String getYear() {
            return Year;
         }

        public void setColor(String color) {
            Color = color;
        }
        public String getColor() {
            return Color;
        }

        public void setNumber(int number) {
            Number = number;
        }

         public int getNumber() {
             return Number;
         }

        public void setDate(long date) {
            this.Date = date;
        }

        public long getDate() {
            return Date;
        }
    public Car(String firm, String model, String year, String color, int number, long date) {
        Firm = firm;
        Year = year;
        Color = color;
        Number = number;
        Model=model;
        this.Date = date;
    }
    public void ShowInfo()
    {
        System.out.println("Фірма: "+Firm+ "\nМодель: "+Model+"\nРік: "
                +Year+"\nКолір: "+Color+"\nНомер: "+Number+"\nДата: "+Date);
    }
}
