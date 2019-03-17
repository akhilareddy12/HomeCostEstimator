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
	public int estimate(String materialtype,int area) {
		if (materialtype == "standard") {
			return 1200 * area;
		}
		if(materialtype == "above standard") {
			return 1500 * area;
		}
		if(materialtype == "high standard") {
			return 1800 * area;
		}
		if(materialtype == "high standard and fully automated") {
			return 2500 * area;
		}
		return 0;
	}

}
