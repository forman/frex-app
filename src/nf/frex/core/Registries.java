/*
 * Frex - a fractal image generator for Android mobile devices
 *
 * Copyright (C) 2013 by Norman Fomferra
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */

package nf.frex.core;

/**
 * @author Norman Fomferra
 */
public class Registries {
    public final static Registry<Fractal> fractals = Registry.create(Fractal.class);
    public final static Registry<ColorScheme> colorSchemes = Registry.create(ColorScheme.class);
    public final static Registry<DistanceFunction> distanceFunctions = Registry.create(DistanceFunction.class);
    public final static Registry<OrbitFunction> orbitFunctions = Registry.create(OrbitFunction.class);
}
