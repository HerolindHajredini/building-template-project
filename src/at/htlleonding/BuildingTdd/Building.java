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
    public String _nameOfResident;
    private Integer _id;
    public int _numOfResidents = 0;


    public int getNumOfResidents() {
        return _numOfResidents;
    }

    public Building(Integer id, String nameOfResident){
        _id = id;

        _nameOfResident = nameOfResident;
    }





    public void addResident(){
        _numOfResidents++;
    }

    public void removeResident(){
        _numOfResidents--;
    }
}
