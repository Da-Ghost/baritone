/*
 * This file is part of Baritone.
 *
 * Baritone is free software: you can redistribute it and/or modify
 * it under the terms of the GNU Lesser General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * Baritone is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU Lesser General Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public License
 * along with Baritone.  If not, see <https://www.gnu.org/licenses/>.
 */

package baritone.api.cache;

import java.util.Set;

/**
 * @author Brady
 * @since 9/24/2018
 */
public interface IWaypointCollection {

    void addWaypoint(IWaypoint waypoint);

    void removeWaypoint(IWaypoint waypoint);

    IWaypoint getMostRecentByTag(IWaypoint.Tag tag);

    Set<IWaypoint> getByTag(IWaypoint.Tag tag);

    Set<IWaypoint> getAllWaypoints();
}
