/*
 * JScience - Java(TM) Tools and Libraries for the Advancement of Sciences.
 * Copyright (C) 2006 - JScience (http://jscience.org/)
 * All rights reserved.
 * 
 * Permission to use, copy, modify, and distribute this software is
 * freely granted, provided that this notice is preserved.
 */
package javax.measure.quantities;
import javax.measure.units.ProductUnit;
import javax.measure.units.SI;
import javax.measure.units.Unit;

/**
 * This interface represents the diffusion of momentum. 
 * The system unit for this quantity is "m²/s".
 * 
 * @author  <a href="mailto:jean-marie@dautelle.com">Jean-Marie Dautelle</a>
 * @version 3.0, March 2, 2006
 * @see <a href="http://en.wikipedia.org/wiki/Viscosity">
 *      Wikipedia: Viscosity</a>
 */
public interface KinematicViscosity extends Quantity<KinematicViscosity> {

    /**
     * Holds the SI unit (Système International d'Unités) for this quantity.
     */
    public final static Unit<KinematicViscosity> UNIT 
         = new ProductUnit<KinematicViscosity>(SI.METER.pow(2).divide(SI.SECOND));

}