/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 2.0.11
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package com.bubblebot.jni;

public class bubblebotJNI {

	static {
		try {

			System.loadLibrary("bubblebot");
		} catch (UnsatisfiedLinkError e) {
			//badness
			throw e;
		}
	}


  public final static native long new_Processor__SWIG_0();
  public final static native long new_Processor__SWIG_1(String jarg1);
  public final static native boolean Processor_loadFormImage__SWIG_0(long jarg1, Processor jarg1_, String jarg2, String jarg3);
  public final static native boolean Processor_loadFormImage__SWIG_1(long jarg1, Processor jarg1_, String jarg2);
  public final static native boolean Processor_loadFeatureData(long jarg1, Processor jarg1_, String jarg2);
  public final static native int Processor_detectForm(long jarg1, Processor jarg1_);
  public final static native boolean Processor_setTemplate(long jarg1, Processor jarg1_, String jarg2);
  public final static native boolean Processor_alignForm__SWIG_0(long jarg1, Processor jarg1_, String jarg2, int jarg3);
  public final static native boolean Processor_alignForm__SWIG_1(long jarg1, Processor jarg1_, String jarg2);
  public final static native boolean Processor_processForm__SWIG_0(long jarg1, Processor jarg1_, String jarg2, boolean jarg3);
  public final static native boolean Processor_processForm__SWIG_1(long jarg1, Processor jarg1_, String jarg2);
  public final static native String Processor_scanAndMarkup(long jarg1, Processor jarg1_, String jarg2);
  public final static native String Processor_processViaJSON(long jarg1, Processor jarg1_, String jarg2);
  public final static native boolean Processor_writeFormImage(long jarg1, Processor jarg1_, String jarg2);
  public final static native String Processor_jniEchoTest(long jarg1, Processor jarg1_, String jarg2);
  public final static native void delete_Processor(long jarg1);
}
