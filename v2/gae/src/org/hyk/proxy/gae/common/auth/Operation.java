/**
 * This file is part of the hyk-proxy project.
 * Copyright (c) 2010 Yin QiWen <yinqiwen@gmail.com>
 *
 * Description: Operation.java 
 *
 * @author yinqiwen [ 2010-4-10 | 08:17:03 am ]
 *
 */
package org.hyk.proxy.gae.common.auth;

import org.hyk.proxy.gae.common.CompressorType;

/**
 *
 */
public enum Operation
{
	ADD(0), DELETE(1), MODIFY(2);
	int value;

	Operation(int v)
	{
		this.value = v;
	}

	public int getValue()
	{
		return value;
	}

	public static Operation fromInt(int v)
	{
		if (v > MODIFY.value)
			return null;
		return values()[v - 1];
	}
}
