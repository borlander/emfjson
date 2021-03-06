/*******************************************************************************
 * Copyright (c) 2011 Guillaume Hillairet.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *    Guillaume Hillairet - initial API and implementation
 *******************************************************************************/
package org.eclipselabs.emfjson.gwt.junit;

import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;

public class Activator implements BundleActivator {
	
	private static Activator instance;
	private BundleContext context;
	
	public static Activator getInstance() {
		return instance;
	}

	public BundleContext getContext() {
		return context;
	}
	
	@Override
	public void start(BundleContext context) throws Exception {
		this.context = context;
		instance = this;
	}

	@Override
	public void stop(BundleContext context) throws Exception {
		instance = null;
	}
	
}
