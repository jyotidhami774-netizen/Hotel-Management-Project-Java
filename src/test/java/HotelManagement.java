import io.cucumber.java.en.*;
import static org.junit.Assert.*;

public class HotelManagementSteps {

    @Given("the hotel management system is running")
    public void the_hotel_management_system_is_running() {
        // Initialize or mock the Hotel system
    }

    @When("the user requests room features for {string}")
    public void the_user_requests_room_features_for(String roomType) {
        // Call Hotel.features() with correct type
    }

    @Then("the system should display details for {string}")
    public void the_system_should_display_details_for(String roomType) {
        // Validate the output
    }

    @When("the user requests room availability for {string}")
    public void the_user_requests_room_availability_for(String roomType) {
        // Call Hotel.availability() with correct type
    }

    @Then("the system should display number of available {string}")
    public void the_system_should_display_number_of_available(String roomType) {
        // Validate the output or system state
    }

    @When("the user books a {string} with name {string}, contact {string}, gender {string}")
    public void the_user_books_a_with_details(String roomType, String name, String contact, String gender) {
        // Book the room in the Hotel system
    }

    @Then("the booking should be successful")
    public void the_booking_should_be_successful() {
        // Assert the room is booked
    }

    @Given("a {string} is booked with room number {int}")
    public void a_room_is_booked_with_room_number(String roomType, int roomNumber) {
        // Ensure the room is booked in test context
    }

    @When("the user orders {string} quantity {string} for room number {int}")
    public void the_user_orders_food(String foodItem, String quantity, int roomNo) {
        // Add food order to the room
    }

    @Then("the food order should be added to the room bill")
    public void the_food_order_should_be_added_to_the_room_bill() {
        // Check that food order is in bill
    }

    @Given("a {string} is booked and food has been ordered")
    public void a_room_is_booked_and_food_has_been_ordered(String roomType) {
        // Setup room with booking and food
    }

    @When("the user checks out from room number {int}")
    public void the_user_checks_out_from_room_number(Integer roomNumber) {
        // Call Hotel.deallocate()
    }

    @Then("the system should deallocate the room and display the total bill")
    public void the_system_should_deallocate_the_room_and_display_the_total_bill() {
        // Assert deallocation and check bill
    }
}
