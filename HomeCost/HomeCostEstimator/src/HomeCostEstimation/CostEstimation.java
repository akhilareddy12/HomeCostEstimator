package HomeCostEstimation;

public class CostEstimation {
	
	/*public int standardmaterialcost(int area) {
		return 1200 * area;
	}
	public int abovestandardcost(int area) {
		return 1500 * area;
	}
	public int highstandard(int area) {
		return 1800 * area;
	}
	public int highstandardandautomated(int area) {
		return 2500 * area;
	}*/
	public int estimate(int materialtype,int area,boolean isAutomated) {
		if (materialtype == 0) {
			return 1200 * area;
		}
		if(materialtype == 1) {
			return 1500 * area;
		}
		
		if(materialtype == 2 && isAutomated) {
			return 2500 * area;
		}
		return 1800  * area;
	}

}
