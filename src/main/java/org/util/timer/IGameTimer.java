/*
 * Copyright (C) 2015 David Pérez Cabrera <dperezcabrera@gmail.com>
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
package org.util.timer;

import org.poker.dispatcher.IGameEventDispatcher;

/**
 *
 * @author David Pérez Cabrera <dperezcabrera@gmail.com>
 */
public interface IGameTimer extends Runnable {

    public void exit();

    public long getTime();

    public void resetTimer(Long timeoutId);

    public void setTime(long time);

    public IGameEventDispatcher getDispatcher();

    public void setDispatcher(IGameEventDispatcher dispatcher);
}