package sec06.exam02.mycompany;



//ctrl + shift + o >> 단축키로 호출하는 방법

import sec06.exam02.hankook.SnowTire;
import sec06.exam02.hyundai.Engine;
//import sec06.exam02.kumho.BigWidthTire;

//import sec06.exam02.hankook.*;
//import sec06.exam02.kumho.*;
//import sec06.exam02.hyundai.Engine;


public class Car {
	//필드
	Engine engine =new Engine();
	SnowTire tire1 = new SnowTire();
	//BigWidthTire tire2 = new BigWidthTire();
	
	sec06.exam02.hankook.Tire tire3 = new sec06.exam02.hankook.Tire();
	sec06.exam02.kumho.Tire tire4 = new sec06.exam02.kumho.Tire();

}
