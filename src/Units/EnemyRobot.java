/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Units;

/**
 *
 * @author Fettoukh Amine
 */
public class EnemyRobot implements Units{

    @Override
    public void Shoot()
    {
        System.out.println("An Enemy Robot is Shooting");
    }

    @Override
    public void Die() 
    {
        System.out.println("An Enemy Robot has been slain");    
    }
    
}
