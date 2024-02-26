/*
 * Open Hospital (www.open-hospital.org)
 * Copyright © 2006-2023 Informatici Senza Frontiere (info@informaticisenzafrontiere.org)
 *
 * Open Hospital is a free and open source software for healthcare data management.
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * https://www.gnu.org/licenses/gpl-3.0-standalone.html
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program. If not, see <https://www.gnu.org/licenses/>.
 */
package org.isf.admission.gui.ward;

import java.util.ArrayList;
import java.util.List;

import org.isf.ward.manager.WardBrowserManager;
import org.isf.ward.model.Ward;

public class WardBrowserManagerStub extends WardBrowserManager {

	private final List<Ward> wards = new ArrayList<>();

	@Override
	public List<Ward> getWards() {
		return new ArrayList<>(wards);
	}

	@Override
	public Ward newWard(Ward ward) {
		wards.add(ward);
		return ward;
	}

	public void clear() {
		wards.clear();
	}

}
