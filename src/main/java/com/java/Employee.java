package com.java;

public class Employee {
		private int eId;
		private String eName;
		private Address addr;
		public int geteId() {
			return eId;
		}
		public void seteId(int eId) {
			this.eId = eId;
		}
		public String geteName() {
			return eName;
		}
		public void seteName(String eName) {
			this.eName = eName;
		}
		public Address getAddr() {
			return addr;
		}
		public void setAddr(Address addr) {
			this.addr = addr;
		}
		@Override
		public String toString() {
			return "Employee [eId=" + eId + ", eName=" + eName + ", addr=" + addr + "]";
		}
		
		
		
		
}
