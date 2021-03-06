/**
 * Copyright (c) 2000-present Liferay, Inc. All rights reserved.
 *
 * This library is free software; you can redistribute it and/or modify it under
 * the terms of the GNU Lesser General Public License as published by the Free
 * Software Foundation; either version 2.1 of the License, or (at your option)
 * any later version.
 *
 * This library is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS
 * FOR A PARTICULAR PURPOSE. See the GNU Lesser General Public License for more
 * details.
 */

package com.liferay.mod.service.persistence;

import com.liferay.mod.model.Bar;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.util.OrderByComparator;

import java.io.Serializable;

import java.util.List;
import java.util.Map;
import java.util.Set;

import org.osgi.framework.Bundle;
import org.osgi.framework.FrameworkUtil;
import org.osgi.util.tracker.ServiceTracker;

/**
 * The persistence utility for the bar service. This utility wraps <code>com.liferay.mod.service.persistence.impl.BarPersistenceImpl</code> and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see BarPersistence
 * @generated
 */
public class BarUtil {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#clearCache()
	 */
	public static void clearCache() {
		getPersistence().clearCache();
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#clearCache(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static void clearCache(Bar bar) {
		getPersistence().clearCache(bar);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#countWithDynamicQuery(DynamicQuery)
	 */
	public static long countWithDynamicQuery(DynamicQuery dynamicQuery) {
		return getPersistence().countWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#fetchByPrimaryKeys(Set)
	 */
	public static Map<Serializable, Bar> fetchByPrimaryKeys(
		Set<Serializable> primaryKeys) {

		return getPersistence().fetchByPrimaryKeys(primaryKeys);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery)
	 */
	public static List<Bar> findWithDynamicQuery(DynamicQuery dynamicQuery) {
		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<Bar> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end) {

		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<Bar> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator<Bar> orderByComparator) {

		return getPersistence().findWithDynamicQuery(
			dynamicQuery, start, end, orderByComparator);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static Bar update(Bar bar) {
		return getPersistence().update(bar);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel, ServiceContext)
	 */
	public static Bar update(Bar bar, ServiceContext serviceContext) {
		return getPersistence().update(bar, serviceContext);
	}

	/**
	 * Returns all the bars where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the matching bars
	 */
	public static List<Bar> findByUuid(String uuid) {
		return getPersistence().findByUuid(uuid);
	}

	/**
	 * Returns a range of all the bars where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>BarModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of bars
	 * @param end the upper bound of the range of bars (not inclusive)
	 * @return the range of matching bars
	 */
	public static List<Bar> findByUuid(String uuid, int start, int end) {
		return getPersistence().findByUuid(uuid, start, end);
	}

	/**
	 * Returns an ordered range of all the bars where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>BarModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of bars
	 * @param end the upper bound of the range of bars (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching bars
	 */
	public static List<Bar> findByUuid(
		String uuid, int start, int end,
		OrderByComparator<Bar> orderByComparator) {

		return getPersistence().findByUuid(uuid, start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the bars where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>BarModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of bars
	 * @param end the upper bound of the range of bars (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching bars
	 */
	public static List<Bar> findByUuid(
		String uuid, int start, int end,
		OrderByComparator<Bar> orderByComparator, boolean useFinderCache) {

		return getPersistence().findByUuid(
			uuid, start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Returns the first bar in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching bar
	 * @throws NoSuchBarException if a matching bar could not be found
	 */
	public static Bar findByUuid_First(
			String uuid, OrderByComparator<Bar> orderByComparator)
		throws com.liferay.mod.exception.NoSuchBarException {

		return getPersistence().findByUuid_First(uuid, orderByComparator);
	}

	/**
	 * Returns the first bar in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching bar, or <code>null</code> if a matching bar could not be found
	 */
	public static Bar fetchByUuid_First(
		String uuid, OrderByComparator<Bar> orderByComparator) {

		return getPersistence().fetchByUuid_First(uuid, orderByComparator);
	}

	/**
	 * Returns the last bar in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching bar
	 * @throws NoSuchBarException if a matching bar could not be found
	 */
	public static Bar findByUuid_Last(
			String uuid, OrderByComparator<Bar> orderByComparator)
		throws com.liferay.mod.exception.NoSuchBarException {

		return getPersistence().findByUuid_Last(uuid, orderByComparator);
	}

	/**
	 * Returns the last bar in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching bar, or <code>null</code> if a matching bar could not be found
	 */
	public static Bar fetchByUuid_Last(
		String uuid, OrderByComparator<Bar> orderByComparator) {

		return getPersistence().fetchByUuid_Last(uuid, orderByComparator);
	}

	/**
	 * Returns the bars before and after the current bar in the ordered set where uuid = &#63;.
	 *
	 * @param barId the primary key of the current bar
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next bar
	 * @throws NoSuchBarException if a bar with the primary key could not be found
	 */
	public static Bar[] findByUuid_PrevAndNext(
			long barId, String uuid, OrderByComparator<Bar> orderByComparator)
		throws com.liferay.mod.exception.NoSuchBarException {

		return getPersistence().findByUuid_PrevAndNext(
			barId, uuid, orderByComparator);
	}

	/**
	 * Removes all the bars where uuid = &#63; from the database.
	 *
	 * @param uuid the uuid
	 */
	public static void removeByUuid(String uuid) {
		getPersistence().removeByUuid(uuid);
	}

	/**
	 * Returns the number of bars where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the number of matching bars
	 */
	public static int countByUuid(String uuid) {
		return getPersistence().countByUuid(uuid);
	}

	/**
	 * Returns the bar where uuid = &#63; and groupId = &#63; or throws a <code>NoSuchBarException</code> if it could not be found.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the matching bar
	 * @throws NoSuchBarException if a matching bar could not be found
	 */
	public static Bar findByUUID_G(String uuid, long groupId)
		throws com.liferay.mod.exception.NoSuchBarException {

		return getPersistence().findByUUID_G(uuid, groupId);
	}

	/**
	 * Returns the bar where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the matching bar, or <code>null</code> if a matching bar could not be found
	 */
	public static Bar fetchByUUID_G(String uuid, long groupId) {
		return getPersistence().fetchByUUID_G(uuid, groupId);
	}

	/**
	 * Returns the bar where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching bar, or <code>null</code> if a matching bar could not be found
	 */
	public static Bar fetchByUUID_G(
		String uuid, long groupId, boolean useFinderCache) {

		return getPersistence().fetchByUUID_G(uuid, groupId, useFinderCache);
	}

	/**
	 * Removes the bar where uuid = &#63; and groupId = &#63; from the database.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the bar that was removed
	 */
	public static Bar removeByUUID_G(String uuid, long groupId)
		throws com.liferay.mod.exception.NoSuchBarException {

		return getPersistence().removeByUUID_G(uuid, groupId);
	}

	/**
	 * Returns the number of bars where uuid = &#63; and groupId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the number of matching bars
	 */
	public static int countByUUID_G(String uuid, long groupId) {
		return getPersistence().countByUUID_G(uuid, groupId);
	}

	/**
	 * Returns all the bars where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @return the matching bars
	 */
	public static List<Bar> findByUuid_C(String uuid, long companyId) {
		return getPersistence().findByUuid_C(uuid, companyId);
	}

	/**
	 * Returns a range of all the bars where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>BarModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of bars
	 * @param end the upper bound of the range of bars (not inclusive)
	 * @return the range of matching bars
	 */
	public static List<Bar> findByUuid_C(
		String uuid, long companyId, int start, int end) {

		return getPersistence().findByUuid_C(uuid, companyId, start, end);
	}

	/**
	 * Returns an ordered range of all the bars where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>BarModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of bars
	 * @param end the upper bound of the range of bars (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching bars
	 */
	public static List<Bar> findByUuid_C(
		String uuid, long companyId, int start, int end,
		OrderByComparator<Bar> orderByComparator) {

		return getPersistence().findByUuid_C(
			uuid, companyId, start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the bars where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>BarModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of bars
	 * @param end the upper bound of the range of bars (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching bars
	 */
	public static List<Bar> findByUuid_C(
		String uuid, long companyId, int start, int end,
		OrderByComparator<Bar> orderByComparator, boolean useFinderCache) {

		return getPersistence().findByUuid_C(
			uuid, companyId, start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Returns the first bar in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching bar
	 * @throws NoSuchBarException if a matching bar could not be found
	 */
	public static Bar findByUuid_C_First(
			String uuid, long companyId,
			OrderByComparator<Bar> orderByComparator)
		throws com.liferay.mod.exception.NoSuchBarException {

		return getPersistence().findByUuid_C_First(
			uuid, companyId, orderByComparator);
	}

	/**
	 * Returns the first bar in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching bar, or <code>null</code> if a matching bar could not be found
	 */
	public static Bar fetchByUuid_C_First(
		String uuid, long companyId, OrderByComparator<Bar> orderByComparator) {

		return getPersistence().fetchByUuid_C_First(
			uuid, companyId, orderByComparator);
	}

	/**
	 * Returns the last bar in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching bar
	 * @throws NoSuchBarException if a matching bar could not be found
	 */
	public static Bar findByUuid_C_Last(
			String uuid, long companyId,
			OrderByComparator<Bar> orderByComparator)
		throws com.liferay.mod.exception.NoSuchBarException {

		return getPersistence().findByUuid_C_Last(
			uuid, companyId, orderByComparator);
	}

	/**
	 * Returns the last bar in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching bar, or <code>null</code> if a matching bar could not be found
	 */
	public static Bar fetchByUuid_C_Last(
		String uuid, long companyId, OrderByComparator<Bar> orderByComparator) {

		return getPersistence().fetchByUuid_C_Last(
			uuid, companyId, orderByComparator);
	}

	/**
	 * Returns the bars before and after the current bar in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param barId the primary key of the current bar
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next bar
	 * @throws NoSuchBarException if a bar with the primary key could not be found
	 */
	public static Bar[] findByUuid_C_PrevAndNext(
			long barId, String uuid, long companyId,
			OrderByComparator<Bar> orderByComparator)
		throws com.liferay.mod.exception.NoSuchBarException {

		return getPersistence().findByUuid_C_PrevAndNext(
			barId, uuid, companyId, orderByComparator);
	}

	/**
	 * Removes all the bars where uuid = &#63; and companyId = &#63; from the database.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 */
	public static void removeByUuid_C(String uuid, long companyId) {
		getPersistence().removeByUuid_C(uuid, companyId);
	}

	/**
	 * Returns the number of bars where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @return the number of matching bars
	 */
	public static int countByUuid_C(String uuid, long companyId) {
		return getPersistence().countByUuid_C(uuid, companyId);
	}

	/**
	 * Returns all the bars where field2 = &#63;.
	 *
	 * @param field2 the field2
	 * @return the matching bars
	 */
	public static List<Bar> findByField2(boolean field2) {
		return getPersistence().findByField2(field2);
	}

	/**
	 * Returns a range of all the bars where field2 = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>BarModelImpl</code>.
	 * </p>
	 *
	 * @param field2 the field2
	 * @param start the lower bound of the range of bars
	 * @param end the upper bound of the range of bars (not inclusive)
	 * @return the range of matching bars
	 */
	public static List<Bar> findByField2(boolean field2, int start, int end) {
		return getPersistence().findByField2(field2, start, end);
	}

	/**
	 * Returns an ordered range of all the bars where field2 = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>BarModelImpl</code>.
	 * </p>
	 *
	 * @param field2 the field2
	 * @param start the lower bound of the range of bars
	 * @param end the upper bound of the range of bars (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching bars
	 */
	public static List<Bar> findByField2(
		boolean field2, int start, int end,
		OrderByComparator<Bar> orderByComparator) {

		return getPersistence().findByField2(
			field2, start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the bars where field2 = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>BarModelImpl</code>.
	 * </p>
	 *
	 * @param field2 the field2
	 * @param start the lower bound of the range of bars
	 * @param end the upper bound of the range of bars (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching bars
	 */
	public static List<Bar> findByField2(
		boolean field2, int start, int end,
		OrderByComparator<Bar> orderByComparator, boolean useFinderCache) {

		return getPersistence().findByField2(
			field2, start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Returns the first bar in the ordered set where field2 = &#63;.
	 *
	 * @param field2 the field2
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching bar
	 * @throws NoSuchBarException if a matching bar could not be found
	 */
	public static Bar findByField2_First(
			boolean field2, OrderByComparator<Bar> orderByComparator)
		throws com.liferay.mod.exception.NoSuchBarException {

		return getPersistence().findByField2_First(field2, orderByComparator);
	}

	/**
	 * Returns the first bar in the ordered set where field2 = &#63;.
	 *
	 * @param field2 the field2
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching bar, or <code>null</code> if a matching bar could not be found
	 */
	public static Bar fetchByField2_First(
		boolean field2, OrderByComparator<Bar> orderByComparator) {

		return getPersistence().fetchByField2_First(field2, orderByComparator);
	}

	/**
	 * Returns the last bar in the ordered set where field2 = &#63;.
	 *
	 * @param field2 the field2
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching bar
	 * @throws NoSuchBarException if a matching bar could not be found
	 */
	public static Bar findByField2_Last(
			boolean field2, OrderByComparator<Bar> orderByComparator)
		throws com.liferay.mod.exception.NoSuchBarException {

		return getPersistence().findByField2_Last(field2, orderByComparator);
	}

	/**
	 * Returns the last bar in the ordered set where field2 = &#63;.
	 *
	 * @param field2 the field2
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching bar, or <code>null</code> if a matching bar could not be found
	 */
	public static Bar fetchByField2_Last(
		boolean field2, OrderByComparator<Bar> orderByComparator) {

		return getPersistence().fetchByField2_Last(field2, orderByComparator);
	}

	/**
	 * Returns the bars before and after the current bar in the ordered set where field2 = &#63;.
	 *
	 * @param barId the primary key of the current bar
	 * @param field2 the field2
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next bar
	 * @throws NoSuchBarException if a bar with the primary key could not be found
	 */
	public static Bar[] findByField2_PrevAndNext(
			long barId, boolean field2,
			OrderByComparator<Bar> orderByComparator)
		throws com.liferay.mod.exception.NoSuchBarException {

		return getPersistence().findByField2_PrevAndNext(
			barId, field2, orderByComparator);
	}

	/**
	 * Removes all the bars where field2 = &#63; from the database.
	 *
	 * @param field2 the field2
	 */
	public static void removeByField2(boolean field2) {
		getPersistence().removeByField2(field2);
	}

	/**
	 * Returns the number of bars where field2 = &#63;.
	 *
	 * @param field2 the field2
	 * @return the number of matching bars
	 */
	public static int countByField2(boolean field2) {
		return getPersistence().countByField2(field2);
	}

	/**
	 * Caches the bar in the entity cache if it is enabled.
	 *
	 * @param bar the bar
	 */
	public static void cacheResult(Bar bar) {
		getPersistence().cacheResult(bar);
	}

	/**
	 * Caches the bars in the entity cache if it is enabled.
	 *
	 * @param bars the bars
	 */
	public static void cacheResult(List<Bar> bars) {
		getPersistence().cacheResult(bars);
	}

	/**
	 * Creates a new bar with the primary key. Does not add the bar to the database.
	 *
	 * @param barId the primary key for the new bar
	 * @return the new bar
	 */
	public static Bar create(long barId) {
		return getPersistence().create(barId);
	}

	/**
	 * Removes the bar with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param barId the primary key of the bar
	 * @return the bar that was removed
	 * @throws NoSuchBarException if a bar with the primary key could not be found
	 */
	public static Bar remove(long barId)
		throws com.liferay.mod.exception.NoSuchBarException {

		return getPersistence().remove(barId);
	}

	public static Bar updateImpl(Bar bar) {
		return getPersistence().updateImpl(bar);
	}

	/**
	 * Returns the bar with the primary key or throws a <code>NoSuchBarException</code> if it could not be found.
	 *
	 * @param barId the primary key of the bar
	 * @return the bar
	 * @throws NoSuchBarException if a bar with the primary key could not be found
	 */
	public static Bar findByPrimaryKey(long barId)
		throws com.liferay.mod.exception.NoSuchBarException {

		return getPersistence().findByPrimaryKey(barId);
	}

	/**
	 * Returns the bar with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param barId the primary key of the bar
	 * @return the bar, or <code>null</code> if a bar with the primary key could not be found
	 */
	public static Bar fetchByPrimaryKey(long barId) {
		return getPersistence().fetchByPrimaryKey(barId);
	}

	/**
	 * Returns all the bars.
	 *
	 * @return the bars
	 */
	public static List<Bar> findAll() {
		return getPersistence().findAll();
	}

	/**
	 * Returns a range of all the bars.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>BarModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of bars
	 * @param end the upper bound of the range of bars (not inclusive)
	 * @return the range of bars
	 */
	public static List<Bar> findAll(int start, int end) {
		return getPersistence().findAll(start, end);
	}

	/**
	 * Returns an ordered range of all the bars.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>BarModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of bars
	 * @param end the upper bound of the range of bars (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of bars
	 */
	public static List<Bar> findAll(
		int start, int end, OrderByComparator<Bar> orderByComparator) {

		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the bars.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>BarModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of bars
	 * @param end the upper bound of the range of bars (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of bars
	 */
	public static List<Bar> findAll(
		int start, int end, OrderByComparator<Bar> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findAll(
			start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Removes all the bars from the database.
	 */
	public static void removeAll() {
		getPersistence().removeAll();
	}

	/**
	 * Returns the number of bars.
	 *
	 * @return the number of bars
	 */
	public static int countAll() {
		return getPersistence().countAll();
	}

	public static BarPersistence getPersistence() {
		return _serviceTracker.getService();
	}

	private static ServiceTracker<BarPersistence, BarPersistence>
		_serviceTracker;

	static {
		Bundle bundle = FrameworkUtil.getBundle(BarPersistence.class);

		ServiceTracker<BarPersistence, BarPersistence> serviceTracker =
			new ServiceTracker<BarPersistence, BarPersistence>(
				bundle.getBundleContext(), BarPersistence.class, null);

		serviceTracker.open();

		_serviceTracker = serviceTracker;
	}

}