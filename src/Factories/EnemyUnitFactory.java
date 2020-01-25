/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Factories;

import Units.EnemyHuman;
import Units.EnemyRobot;
import Units.EnemyTank;
import Units.Units;

/**
 *
 * @author Fettoukh Amine
 */
public class EnemyUnitFactory extends UnitAbstractFactory {

    @Override
    public Units getUnits(String UnitType) 
    {
        if(UnitType.equalsIgnoreCase("ROBOT"))
        {
            return new EnemyRobot();
        }else if(UnitType.equalsIgnoreCase("HUMAN"))
        {
            return new EnemyHuman();
        }else if(UnitType.equalsIgnoreCase("TANK"))
        {
            return new EnemyTank();
        }
        return null ;
    }
    
}
