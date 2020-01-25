/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Factories;

/**
 *
 * @author Fettoukh Amine
 */
public class FactoryProducer {
     public static UnitAbstractFactory getFactory(boolean Allied){   
      if(Allied){
         return new AlliedUnitFactory();         
      }else{
         return new EnemyUnitFactory();
      }
   }
}
