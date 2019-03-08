package com.freedompop.login.commons;

public interface Mapper <I,O>{

	public I mapToInner(O outter);
	public O mapToOutter(I inner);
}
