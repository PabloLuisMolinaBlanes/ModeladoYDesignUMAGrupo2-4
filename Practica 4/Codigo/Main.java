import java.util.ArrayList;
import java.util.Date;

public class Main {
    private static final int THREE_DAYS_IN_MILLIS = 24 * 60 * 60 * 1000 * 3;
    public static void main(String[] args) {
        Car car1 = new Car("car_1");
        Car car2 = new Car("car_2");
        Car car3 = new Car("car_3");
        Car car4 = new Car("car_4");
        Car car5 = new Car("car_5");

        Model model1 = new Model();
        model1.setName("model_1");
        model1.setPricePerDay(100);

        Model model2 = new Model();
        model2.setName("model_2");
        model2.setPricePerDay(70);

        car1.setModel(model1);
        car2.setModel(model2);
        car3.setModel(model2);
        car4.setModel(model1);
        car5.setModel(model1);

        Customer customer = new Customer("a","a");

        RentalOffice rentalOffice1 = new RentalOffice("RentalOffice_1", 10);
        RentalOffice rentalOffice2 = new RentalOffice("RentalOffice_2", 15);
        RentalOffice rentalOffice3 = new RentalOffice("RentalOffice_3", 20);

        ArrayList<Car> cars = new ArrayList<>();
        cars.add(car2);
        cars.add(car5);

        rentalOffice2.setCars(cars);

        car1.setRentalOffice(rentalOffice1);
        car2.setRentalOffice(rentalOffice2);
        car3.setRentalOffice(rentalOffice3);
        car4.setRentalOffice(rentalOffice1);
        car5.setRentalOffice(rentalOffice2);

        Date startDate = new Date();
        Date endDate = new Date();
        endDate.setTime(startDate.getTime()+THREE_DAYS_IN_MILLIS);

        WebRental webRental1 = new WebRental(customer, rentalOffice1, startDate, car1, 12, rentalOffice2);
        webRental1.setEndDate(endDate);

        Date startDate2 = new Date();
        startDate2.setTime(startDate.getTime()+THREE_DAYS_IN_MILLIS);
        Date endDate2 = new Date();
        endDate2.setTime(endDate.getTime()+THREE_DAYS_IN_MILLIS);

        WebRental webRental2 = new WebRental(customer, rentalOffice2, startDate2, car2, 12, rentalOffice2);
        webRental2.setEndDate(endDate2);

        Date startDate3 = new Date();
        startDate3.setTime(startDate2.getTime()+THREE_DAYS_IN_MILLIS);
        Date endDate3 = new Date();
        endDate3.setTime(endDate2.getTime()+THREE_DAYS_IN_MILLIS);

        Rental rentalOnSite1 = new RentalOnSite(customer, rentalOffice3, startDate3, car3);
        rentalOnSite1.setEndDate(endDate3);

        Discount discountAmount = new DiscountAmount(3);
        Discount discountPercent = new DiscountPercents(10);
        Discount noDiscount = new NoDiscount();

        webRental1.setDiscount(discountAmount);
        webRental2.setDiscount(discountPercent);
        rentalOnSite1.setDiscount(noDiscount);

        RentalCollection rentalCollection = new RentalCollection();
        rentalCollection.add(webRental1);
        rentalCollection.add(webRental2);
        rentalCollection.add(rentalOnSite1);

        customer.setRentals(rentalCollection);

        int number = customer.numberOfRentalsWithDifferentOffices();
        System.out.println("Number of web rentals with different offices: " + number);
        int price = webRental1.getPrice();
        System.out.println("Price of web rental 1: " + price);
        price = webRental2.getPrice();
        System.out.println("Price of web rental 2: " + price);
        price = rentalOnSite1.getPrice();
        System.out.println("Price of rental on site 1: " + price);
        car2.takeOutOfService(new Date());
    }
}