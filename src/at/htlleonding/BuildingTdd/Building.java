/*----------------------------------------------------------
 *				HTBLA-Leonding / Class: < 3CHIF >
 * ---------------------------------------------------------
 * Exercise Number: 0
 * Title:
 * Author:			Herolind Hajredini
 * ----------------------------------------------------------
 * Description:
 * ----------------------------------------------------------
 */
package at.htlleonding.BuildingTdd;

public class Building {
    private Integer id;
    public int numOfResidents = 0;


    public int getNumOfResidents() {
        return numOfResidents;
    }

    public Building(Integer id, int numOfResidents){
        this.id = id;

        this.numOfResidents= numOfResidents;
    }

    public void addResident(){
        numOfResidents++;
    }

    public void removeResident(){
        numOfResidents--;
    }
}
