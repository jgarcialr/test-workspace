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

package com.liferay.mod.service;

import org.osgi.framework.Bundle;
import org.osgi.framework.FrameworkUtil;
import org.osgi.util.tracker.ServiceTracker;

/**
 * Provides the local service utility for Bar. This utility wraps
 * <code>com.liferay.mod.service.impl.BarLocalServiceImpl</code> and
 * is an access point for service operations in application layer code running
 * on the local server. Methods of this service will not have security checks
 * based on the propagated JAAS credentials because this service can only be
 * accessed from within the same VM.
 *
 * @author Brian Wing Shun Chan
 * @see BarLocalService
 * @generated
 */
public class BarLocalServiceUtil {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Add custom service methods to <code>com.liferay.mod.service.impl.BarLocalServiceImpl</code> and rerun ServiceBuilder to regenerate this class.
	 */

	/**
	 * Adds the bar to the database. Also notifies the appropriate model listeners.
	 *
	 * @param bar the bar
	 * @return the bar that was added
	 */
	public static com.liferay.mod.model.Bar addBar(
		com.liferay.mod.model.Bar bar) {

		return getService().addBar(bar);
	}

	/**
	 * Creates a new bar with the primary key. Does not add the bar to the database.
	 *
	 * @param barId the primary key for the new bar
	 * @return the new bar
	 */
	public static com.liferay.mod.model.Bar createBar(long barId) {
		return getService().createBar(barId);
	}

	/**
	 * Deletes the bar from the database. Also notifies the appropriate model listeners.
	 *
	 * @param bar the bar
	 * @return the bar that was removed
	 */
	public static com.liferay.mod.model.Bar deleteBar(
		com.liferay.mod.model.Bar bar) {

		return getService().deleteBar(bar);
	}

	/**
	 * Deletes the bar with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param barId the primary key of the bar
	 * @return the bar that was removed
	 * @throws PortalException if a bar with the primary key could not be found
	 */
	public static com.liferay.mod.model.Bar deleteBar(long barId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return getService().deleteBar(barId);
	}

	/**
	 * @throws PortalException
	 */
	public static com.liferay.portal.kernel.model.PersistedModel
			deletePersistedModel(
				com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {

		return getService().deletePersistedModel(persistedModel);
	}

	public static com.liferay.portal.kernel.dao.orm.DynamicQuery
		dynamicQuery() {

		return getService().dynamicQuery();
	}

	/**
	 * Performs a dynamic query on the database and returns the matching rows.
	 *
	 * @param dynamicQuery the dynamic query
	 * @return the matching rows
	 */
	public static <T> java.util.List<T> dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery) {

		return getService().dynamicQuery(dynamicQuery);
	}

	/**
	 * Performs a dynamic query on the database and returns a range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.liferay.mod.model.impl.BarModelImpl</code>.
	 * </p>
	 *
	 * @param dynamicQuery the dynamic query
	 * @param start the lower bound of the range of model instances
	 * @param end the upper bound of the range of model instances (not inclusive)
	 * @return the range of matching rows
	 */
	public static <T> java.util.List<T> dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end) {

		return getService().dynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * Performs a dynamic query on the database and returns an ordered range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.liferay.mod.model.impl.BarModelImpl</code>.
	 * </p>
	 *
	 * @param dynamicQuery the dynamic query
	 * @param start the lower bound of the range of model instances
	 * @param end the upper bound of the range of model instances (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching rows
	 */
	public static <T> java.util.List<T> dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator<T> orderByComparator) {

		return getService().dynamicQuery(
			dynamicQuery, start, end, orderByComparator);
	}

	/**
	 * Returns the number of rows matching the dynamic query.
	 *
	 * @param dynamicQuery the dynamic query
	 * @return the number of rows matching the dynamic query
	 */
	public static long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery) {

		return getService().dynamicQueryCount(dynamicQuery);
	}

	/**
	 * Returns the number of rows matching the dynamic query.
	 *
	 * @param dynamicQuery the dynamic query
	 * @param projection the projection to apply to the query
	 * @return the number of rows matching the dynamic query
	 */
	public static long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery,
		com.liferay.portal.kernel.dao.orm.Projection projection) {

		return getService().dynamicQueryCount(dynamicQuery, projection);
	}

	public static com.liferay.mod.model.Bar fetchBar(long barId) {
		return getService().fetchBar(barId);
	}

	/**
	 * Returns the bar matching the UUID and group.
	 *
	 * @param uuid the bar's UUID
	 * @param groupId the primary key of the group
	 * @return the matching bar, or <code>null</code> if a matching bar could not be found
	 */
	public static com.liferay.mod.model.Bar fetchBarByUuidAndGroupId(
		String uuid, long groupId) {

		return getService().fetchBarByUuidAndGroupId(uuid, groupId);
	}

	public static com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery
		getActionableDynamicQuery() {

		return getService().getActionableDynamicQuery();
	}

	/**
	 * Returns the bar with the primary key.
	 *
	 * @param barId the primary key of the bar
	 * @return the bar
	 * @throws PortalException if a bar with the primary key could not be found
	 */
	public static com.liferay.mod.model.Bar getBar(long barId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return getService().getBar(barId);
	}

	/**
	 * Returns the bar matching the UUID and group.
	 *
	 * @param uuid the bar's UUID
	 * @param groupId the primary key of the group
	 * @return the matching bar
	 * @throws PortalException if a matching bar could not be found
	 */
	public static com.liferay.mod.model.Bar getBarByUuidAndGroupId(
			String uuid, long groupId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return getService().getBarByUuidAndGroupId(uuid, groupId);
	}

	/**
	 * Returns a range of all the bars.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.liferay.mod.model.impl.BarModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of bars
	 * @param end the upper bound of the range of bars (not inclusive)
	 * @return the range of bars
	 */
	public static java.util.List<com.liferay.mod.model.Bar> getBars(
		int start, int end) {

		return getService().getBars(start, end);
	}

	/**
	 * Returns all the bars matching the UUID and company.
	 *
	 * @param uuid the UUID of the bars
	 * @param companyId the primary key of the company
	 * @return the matching bars, or an empty list if no matches were found
	 */
	public static java.util.List<com.liferay.mod.model.Bar>
		getBarsByUuidAndCompanyId(String uuid, long companyId) {

		return getService().getBarsByUuidAndCompanyId(uuid, companyId);
	}

	/**
	 * Returns a range of bars matching the UUID and company.
	 *
	 * @param uuid the UUID of the bars
	 * @param companyId the primary key of the company
	 * @param start the lower bound of the range of bars
	 * @param end the upper bound of the range of bars (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the range of matching bars, or an empty list if no matches were found
	 */
	public static java.util.List<com.liferay.mod.model.Bar>
		getBarsByUuidAndCompanyId(
			String uuid, long companyId, int start, int end,
			com.liferay.portal.kernel.util.OrderByComparator
				<com.liferay.mod.model.Bar> orderByComparator) {

		return getService().getBarsByUuidAndCompanyId(
			uuid, companyId, start, end, orderByComparator);
	}

	/**
	 * Returns the number of bars.
	 *
	 * @return the number of bars
	 */
	public static int getBarsCount() {
		return getService().getBarsCount();
	}

	public static com.liferay.portal.kernel.dao.orm.ExportActionableDynamicQuery
		getExportActionableDynamicQuery(
			com.liferay.exportimport.kernel.lar.PortletDataContext
				portletDataContext) {

		return getService().getExportActionableDynamicQuery(portletDataContext);
	}

	public static
		com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery
			getIndexableActionableDynamicQuery() {

		return getService().getIndexableActionableDynamicQuery();
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	public static String getOSGiServiceIdentifier() {
		return getService().getOSGiServiceIdentifier();
	}

	/**
	 * @throws PortalException
	 */
	public static com.liferay.portal.kernel.model.PersistedModel
			getPersistedModel(java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return getService().getPersistedModel(primaryKeyObj);
	}

	/**
	 * Updates the bar in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * @param bar the bar
	 * @return the bar that was updated
	 */
	public static com.liferay.mod.model.Bar updateBar(
		com.liferay.mod.model.Bar bar) {

		return getService().updateBar(bar);
	}

	public static BarLocalService getService() {
		return _serviceTracker.getService();
	}

	private static ServiceTracker<BarLocalService, BarLocalService>
		_serviceTracker;

	static {
		Bundle bundle = FrameworkUtil.getBundle(BarLocalService.class);

		ServiceTracker<BarLocalService, BarLocalService> serviceTracker =
			new ServiceTracker<BarLocalService, BarLocalService>(
				bundle.getBundleContext(), BarLocalService.class, null);

		serviceTracker.open();

		_serviceTracker = serviceTracker;
	}

}