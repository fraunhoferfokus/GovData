/**
 * Copyright (c) 2012, 2013 Fraunhofer Institute FOKUS
 *
 * This file is part of Open Data Platform.
 *
 * Open Data Platform is free software: you can redistribute it and/or modify
 * it under the terms of the GNU Affero General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.

 * Open Data Plaform is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU Affero General Public License for more details.

 * You should have received a copy of the GNU Affero General Public License
 * along with Open Data Platform.  If not, see <http://www.gnu.org/licenses/agpl-3.0>.
 */

package de.fhg.fokus.odp.portal.datasets;

import java.io.Serializable;
import java.util.Comparator;

import de.fhg.fokus.odp.registry.queries.QueryFacetItem;

/**
 * The Class CategoriesTitleComparator.
 */
public class FilterCountComparator implements Comparator<QueryFacetItem>,
		Serializable {

	/** The Constant serialVersionUID. */
	private static final long serialVersionUID = 1L;

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.util.Comparator#compare(java.lang.Object, java.lang.Object)
	 */
	@Override
	public int compare(QueryFacetItem c1, QueryFacetItem c2) {
		int result = 0;

		if (c1.getCount() < c2.getCount()) {
			result = 1;
		} else if (c1.getCount() > c2.getCount()) {
			result = -1;
		}

		return result;
	}

}
