package com.threads;

public class DeadlockRiskFix {

	private static class Resource {
		public int value;
	}

	private Resource resourceA = new Resource();
	private Resource resourceB = new Resource();

	public int read() {
		synchronized (resourceA) { 
			synchronized (resourceB) {
				return resourceB.value + resourceA.value;
			}
		}
	}

	public void write(int a, int b) {
		synchronized (resourceA) { 
			synchronized (resourceB) {
				resourceA.value = a;
				resourceB.value = b;
			}
		}
	}

}
