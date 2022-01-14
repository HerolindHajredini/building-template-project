package at.htlleonding.BuildingTdd;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BuildingTest {

    @Test
    void getNumOfResidentsShouldReturn2_Given2() {
        Building building = new Building(16, 2);

        assertEquals(2, building.getNumOfResidents());
    }
    
}