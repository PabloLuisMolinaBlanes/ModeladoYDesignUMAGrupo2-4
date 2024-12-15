import java.util.ArrayList;
import java.util.Date;

public class Main {
    public static void main(String[] args) {
        Car car1 = new Car("t");
        Car car2 = new Car("u");
        Car car3 = new Car("v");
        Car car4 = new Car("w");
        Car car5 = new Car("x");
        Car car6 = new Car("y");
        Model model1 = new Model();
        model1.setName("a");
        model1.setPricePerDay(100);
        Model model2 = new Model();
        model2.setName("b");
        model2.setPricePerDay(70);
        car1.setModel(model1);
        car2.setModel(model1);
        car3.setModel(model2);
        car4.setModel(model2);
        car5.setModel(model2);
        car6.setModel(model1);
        Customer customer = new Customer("a","a");
        Customer customer2 = new Customer("b","b");
        Customer customer3 = new Customer("c","c");
        Customer customer4 = new Customer("d","d");
        RentalOffice rentalOffice = new RentalOffice("a", 10);
        RentalOffice rentalOffice2 = new RentalOffice("b", 15);
        RentalOffice rentalOffice3 = new RentalOffice("c", 20);
        ArrayList<Car> cars = new ArrayList<>();
        cars.add(car2);
        cars.add(car5);
        rentalOffice2.setCars(cars);
        car1.setRentalOffice(rentalOffice);
        car2.setRentalOffice(rentalOffice2);
        car3.setRentalOffice(rentalOffice3);
        car4.setRentalOffice(rentalOffice);
        car5.setRentalOffice(rentalOffice2);
        car6.setRentalOffice(rentalOffice3);
        Rental rental1 = new WebRental();
        rental1.setCar(car1);
        rental1.setStartDate(new Date());
        Date endTime = new Date();
        endTime.setTime(new Date().getTime()+3000);
        rental1.setEndDate(endTime);
        rental1.setPickupOffice(rentalOffice);
        Rental rental2 = new WebRental();
        rental2.setCar(car2);
        rental2.setStartDate(new Date());
        rental2.setPickupOffice(rentalOffice2);
        Rental rental3 = new RentalOnSite();
        rental3.setCar(car3);
        rental3.setStartDate(new Date());
        rental3.setPickupOffice(rentalOffice3);
        Discount discountAmount = new DiscountAmount(3);
        Discount discountPercent = new DiscountPercents(10);
        Discount noDiscount = new NoDiscount();
        rental1.setDiscount(discountAmount);
        rental2.setDiscount(discountPercent);
        rental3.setDiscount(noDiscount);
        RentalCollection rentalCollection = new RentalCollection();
        rentalCollection.add(rental1);
        rentalCollection.add(rental2);
        rentalCollection.add(rental3);
        customer.setRentals(rentalCollection);
        int number = customer.numberOfRentalsWithDifferentOffices();
        int price = rental1.getPrice();
        car2.takeOutOfService(new Date());
    }
}