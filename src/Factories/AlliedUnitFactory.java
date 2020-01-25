/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Factories;

import Units.AlliedHuman;
import Units.AlliedRobot;
import Units.AlliedTank;
import Units.Units;

/**
 *
 * @author Fettoukh Amine
 */
public class AlliedUnitFactory extends UnitAbstractFactory {

    @Override
    public Units getUnits(String UnitType) 
    {
        if(UnitType.equalsIgnoreCase("ROBOT"))
        {
            return new AlliedRobot();
        }
        else if(UnitType.equalsIgnoreCase("HUMAN"))
        {
            return new AlliedHuman();
        }
        else if(UnitType.equalsIgnoreCase("TANK"))
        {
            return new AlliedTank();
        }
        return null ;
    }
    
}
