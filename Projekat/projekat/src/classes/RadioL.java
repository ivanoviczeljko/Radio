package classes;

import enums.Enumerations;
import interfaces.InterfacesOp;

public class RadioL implements InterfacesOp{
	protected double jacinaFrekvencije;//frekvencija
	protected double jacinaZvuka;//zvuk
	Enumerations _state;//enumeracija
	
	/**
	 * @return the jacinaZvuka
	 */
	public double getJacinaZvuka() {
		return jacinaZvuka;
	}

	/**
	 * @param jacinaZvuka the jacinaZvuka to set
	 */
	public void setJacinaZvuka(double jacinaZvuka) {
		this.jacinaZvuka = jacinaZvuka;
	}

	/**
	 * @return the jacinaFrekvencije
	 */
	public double getJacinaFrekvencije() {
		return jacinaFrekvencije;
	}

	/**
	 * @param jacinaFrekvencije the jacinaFrekvencije to set
	 */
	public void setJacinaFrekvencije(double jacinaFrekvencije) {
		this.jacinaFrekvencije = jacinaFrekvencije;
	}

	/**
	 * @return the _state
	 */
	public Enumerations get_state() {
		return _state;
	}

	/**
	 * @param _state the _state to set
	 */
	public void set_state(Enumerations _state) {
		this._state = _state;
	}


	public RadioL() {
		// TODO Auto-generated constructor stub
	}

	public double frequnecy() {
		if(jacinaFrekvencije<=108)
			jacinaFrekvencije=jacinaFrekvencije+0.5;{
				if(jacinaFrekvencije<=108) return jacinaFrekvencije;
				else return jacinaFrekvencije-0.5;
			}
	}
	
	public double frequnecyminus() {
		if(jacinaFrekvencije>87.5)
			jacinaFrekvencije=jacinaFrekvencije-0.5;
		    {
				if(jacinaFrekvencije>87.5) return jacinaFrekvencije;
				else return jacinaFrekvencije+0.5;
			}
	}
	
	public double volumeminus() {
		if(jacinaZvuka>=0)
			jacinaZvuka=jacinaZvuka-1;
			{
			if(jacinaZvuka>0) return jacinaZvuka;
			else return jacinaZvuka+1;
			}
	}
	

	
	
	public double volume() {
		if(jacinaZvuka<=20)
			jacinaZvuka=jacinaZvuka+1;
			{
			if(jacinaZvuka<=20) return jacinaZvuka;
			else return jacinaZvuka-1;
			}
	}
	
	public void stateOn(){
		this.jacinaFrekvencije=87.5;
		this.jacinaZvuka=10;
	}
	public void stateOFF(){
		this.jacinaFrekvencije=0;
		this.jacinaZvuka=0;
	}
	public void stateOut(){
		this.jacinaFrekvencije=0;
		this.jacinaZvuka=0;
	}
	
}
