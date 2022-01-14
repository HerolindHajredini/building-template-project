package at.htlleonding.BuildingTdd;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BuildingTest {

    @Test
    void getNumOfResidentsShouldReturn2_Given2() {
        Building building = new Building(16, "Lindi");

        building._numOfResidents = 2;
        assertEquals(2, building.getNumOfResidents());
    }

    @Test
    void getNumOfResidentsShouldReturn1_afterAdding1Resident(){
        Building building = new Building(16, "Lindi");

        building._numOfResidents = 0;
        building.addResident();

        assertEquals(1, building.getNumOfResidents());
    }

    @Test
    void getNumOfResidentsShouldReturn1_afterRemoving1Resident(){
        Building building = new Building(16, "Lindi");

        building._numOfResidents = 2;
        building.removeResident();
        assertEquals(1, building.getNumOfResidents());
    }

    @Test
    void getNameOfResidentShouldReturnLindi_GivenLindi(){

        Building building = new Building(16, "Lindi");

        assertEquals("Lindi", building._nameOfResident);

    }
}