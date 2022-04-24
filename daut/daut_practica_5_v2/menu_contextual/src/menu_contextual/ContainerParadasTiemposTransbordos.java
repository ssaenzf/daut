package menu_contextual;

import java.util.List;


import red.Parada;

public class ContainerParadasTiemposTransbordos {
	List<Parada> paradas1; // Lista paradas con menores tiempos
	List<Parada> paradas2; // Lista paradas con menos transbordos
    double tiempos;
    int transbordos;
    
    public ContainerParadasTiemposTransbordos(List<Parada> paradas1, List<Parada> paradas2, double tiempos, int transbordos) {
    	super();
    	this.paradas1 = paradas1;
    	this.paradas2 = paradas2;
    	this.tiempos = tiempos;
    	this.transbordos = transbordos;
    }
    
    public List<Parada> getParadas1() {
    	return this.paradas1;
    }
    
    public void setParadas1(List<Parada> paradas1) {
    	this.paradas1 = paradas1;
    }
    
    public List<Parada> getParadas2() {
    	return this.paradas2;
    }
    
    public void setParadas2(List<Parada> paradas2) {
    	this.paradas2 = paradas2;
    }
    
    public double getTiempos() {
    	return this.tiempos;
    }
    
    public void setTiempos(double tiempos) {
    	this.tiempos = tiempos;
    }
    
    public int getTransbordos() {
    	return this.transbordos;
    }
    
    public void setTransbordos(int transbordos) {
    	this.transbordos = transbordos;
    }
    
    
}