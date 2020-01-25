/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package abstractfactory_game_units;

import Factories.FactoryProducer;
import Factories.UnitAbstractFactory;
import Units.Units;

/**
 *
 * @author Fettoukh Amine
 */
public class AbstractFactory_Game_units {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

      UnitAbstractFactory EnemyUnitFactory = FactoryProducer.getFactory(false);

      Units unit1 = EnemyUnitFactory.getUnits("Robot");
      Units unit2 = EnemyUnitFactory.getUnits("Human");
      Units unit3 = EnemyUnitFactory.getUnits("Tank");
      
      System.out.println("Enemy Units  !!! \n");
      unit1.Shoot();
      unit2.Shoot();
      unit3.Shoot();
      
      
      UnitAbstractFactory AlliedUnitFactory = FactoryProducer.getFactory(true);

      Units unit4 = AlliedUnitFactory.getUnits("Robot");
      Units unit5 = AlliedUnitFactory.getUnits("Human");
      Units unit6 = AlliedUnitFactory.getUnits("Tank");
      
      System.out.println("\nAllied Units  !!! \n");
      unit4.Shoot();
      unit5.Shoot();
      unit6.Shoot();
    }
    
}
