package com.mymicroservice;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class LimitServericeConfigurtaion {
	
		private int max;
		private int min;
		
		public LimitServericeConfigurtaion(int max, int min) {
			this.max = max;
			this.min = min;
			
		}

}
