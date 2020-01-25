/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Factories;

import Units.Units;

/**
 *
 * @author Fettoukh Amine
 */
public abstract class UnitAbstractFactory {
    abstract public Units getUnits(String UnitType);
}
