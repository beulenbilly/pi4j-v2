package com.pi4j.plugin.linuxfs.provider.gpio.digital;

/*
 * #%L
 * **********************************************************************
 * ORGANIZATION  :  Pi4J
 * PROJECT       :  Pi4J :: PLUGIN   :: LinuxFS I/O Providers
 * FILENAME      :  LinuxFsDigitalOutputProviderImpl.java
 *
 * This file is part of the Pi4J project. More information about
 * this project can be found here:  https://pi4j.com/
 * **********************************************************************
 * %%
 * Copyright (C) 2012 - 2020 Pi4J
 * %%
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU Lesser General Public License as
 * published by the Free Software Foundation, either version 3 of the
 * License, or (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Lesser Public License for more details.
 *
 * You should have received a copy of the GNU General Lesser Public
 * License along with this program.  If not, see
 * <http://www.gnu.org/licenses/lgpl-3.0.html>.
 * #L%
 */

import com.pi4j.io.gpio.digital.DigitalOutput;
import com.pi4j.io.gpio.digital.DigitalOutputConfig;
import com.pi4j.io.gpio.digital.DigitalOutputProviderBase;

/**
 * <p>LinuxFsDigitalOutputProviderImpl class.</p>
 *
 * @author Robert Savage (<a href="http://www.savagehomeautomation.com">http://www.savagehomeautomation.com</a>)
 * @version $Id: $Id
 */
public class LinuxFsDigitalOutputProviderImpl extends DigitalOutputProviderBase implements LinuxFsDigitalOutputProvider {

    /**
     * <p>Constructor for LinuxFsDigitalOutputProviderImpl.</p>
     */
    public LinuxFsDigitalOutputProviderImpl(){
        this.id = ID;
        this.name = NAME;
    }

    /** {@inheritDoc} */
    @Override
    public DigitalOutput create(DigitalOutputConfig config) throws Exception {

        // export GPIO pin
        // /sys/class/gpio

        // set GPIO pin direction
        // /sys/class/gpio/gpio{0}

        return new LinuxFsDigitalOutput(this, config);
    }
}
