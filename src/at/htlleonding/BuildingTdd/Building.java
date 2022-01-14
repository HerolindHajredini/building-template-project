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
    public String[] _nameOfResidentArray;
    private Integer _id;
    public int _numOfResidents = 0;


    public int getNumOfResidents() {
        return _numOfResidents;
    }

    public Building(Integer id, String[] nameOfResident){
        _id = id;

        if(_numOfResidents == 1)
        {
            _nameOfResident = nameOfResident[0];
        }
        else if(_numOfResidents > 1)
        {
            for(int i = 0; i < _numOfResidents; i++)
            {
                this._nameOfResidentArray[0] = nameOfResident[0];
            }
        }
    }





    public void addResident(){
        _numOfResidents++;
    }

    public void removeResident(){
        _numOfResidents--;
    }
}
