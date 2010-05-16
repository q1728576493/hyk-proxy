/**
 * This file is part of the hyk-proxy project.
 * Copyright (c) 2010 Yin QiWen <yinqiwen@gmail.com>
 *
 * Description: SimpleSecurityService.java 
 *
 * @author yinqiwen [ 2010-5-15 | ����10:32:03 ]
 *
 */
package com.hyk.proxy.common.secure;

import java.nio.ByteBuffer;
import java.util.Arrays;

/**
 *
 */
public class SimpleSecurityService implements SecurityService
{
	private int	step;

	public SimpleSecurityService()
	{
		this(1);
	}

	public SimpleSecurityService(int step)
	{
		this.step = step;
	}

//	@Override
//	public InputStream getDecryptInputStream(final InputStream input)
//	{
//		// TODO Auto-generated method stub
//		return new InputStream()
//		{
//			@Override
//			public int read() throws IOException
//			{
//				int v = input.read();
//				if(v < 0)
//				{
//					return v;
//				}
//				return decrypt((byte)v);
//			}
//		};
//	}
//
//	@Override
//	public OutputStream getEncryptOutputStream(final OutputStream output)
//	{
//		return new OutputStream()
//		{
//
//			@Override
//			public void write(int b) throws IOException
//			{
//				output.write(encrypt((byte)b));
//			}
//		};
//	}

	@Override
	public String getName()
	{
		return "se" + step;
	}

	private byte decrypt(byte value)
	{
		int v = value & 0xff;
		v += step;
		if(v >= 256)
		{
			v -= 256;
		}
		return (byte)v;
	}

	@Override
	public byte[] decrypt(byte[] value)
	{
		for(int i = 0; i<value.length; i++)
		{
			value[i] = decrypt(value[i]);
		}
		return value;
	}

	private byte encrypt(byte value)
	{
		int k = value & 0xff;
		int v = k - step;
		if(v < 0)
		{
			v = 256 + v;
		}
		return (byte)v;
	}

	@Override
	public byte[] encrypt(byte[] value)
	{
		for(int i = 0; i<value.length; i++)
		{
			value[i] = encrypt(value[i]);
		}
		return value;
	}

	@Override
	public ByteBuffer decrypt(ByteBuffer value)
	{
		int pos = value.position();
		for(int i = 0; i<value.remaining(); i++)
		{
			value.put(pos + i, decrypt(value.get(pos + i)));
		}
		return value;
	}

	@Override
	public ByteBuffer encrypt(ByteBuffer value)
	{
		int pos = value.position();
		for(int i = 0; i<value.remaining(); i++)
		{
			value.put(pos + i, encrypt(value.get(pos + i)));
		}
		return value;
	}

	@Override
	public ByteBuffer[] decrypt(ByteBuffer[] value)
	{
		for(int i = 0; i<value.length; i++)
		{
			decrypt(value[i]);
		}
		return value;
	}

	@Override
	public ByteBuffer[] encrypt(ByteBuffer[] value)
	{
		for(int i = 0; i<value.length; i++)
		{
			encrypt(value[i]);
		}
		return value;
	}
	
	public static void main(String[] args)
	{
		SimpleSecurityService service = new SimpleSecurityService();
		
		byte[] test = "REMOTE_SERVICE_MANAGER".getBytes();
		System.out.println(Arrays.toString(test));
		ByteBuffer buf = ByteBuffer.allocate(4+test.length);
		buf.putInt(1);
		buf.put(service.encrypt(test));
		buf.flip();
		System.out.println(Arrays.toString(test));
		buf.getInt();
		service.decrypt(buf);
		System.arraycopy(buf.array(), 4, test, 0, test.length);
		System.out.println(Arrays.toString(test));
		//System.out.println(Arrays.toString(service.encrypt(test)));
		//System.out.println(Arrays.toString(service.decrypt(test)));
	}

}
