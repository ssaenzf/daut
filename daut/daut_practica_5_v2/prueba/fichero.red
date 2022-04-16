<?xml version="1.0" encoding="UTF-8"?>
<red:RedTransporte xmi:version="2.0" xmlns:xmi="http://www.omg.org/XMI" xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance" xmlns:red="red">
  <lineas xsi:type="red:LineaMetro" codigo="LineaMetro1" horaApertura="6" horaCierre="24" paradas="//@paradas.1 //@paradas.4" paradaIni="//@paradas.1" paradaFin="//@paradas.4"/>
  <lineas xsi:type="red:LineaMetro" codigo="LineaMetro2" horaApertura="9" horaCierre="14" paradas="//@paradas.1 //@paradas.4" color="Verde" paradaIni="//@paradas.1" paradaFin="//@paradas.4"/>
  <lineas xsi:type="red:LineaTren" codigo="LineaTren1" horaApertura="9" horaCierre="21" paradas="//@paradas.2 //@paradas.5" paradaIni="//@paradas.2" paradaFin="//@paradas.5"/>
  <lineas xsi:type="red:LineaTren" codigo="LineaTren2" horaApertura="9" horaCierre="15" paradas="//@paradas.2 //@paradas.5" paradaIni="//@paradas.2" paradaFin="//@paradas.5"/>
  <lineas xsi:type="red:LineaBus" codigo="LineaBus1" horaApertura="7" horaCierre="24" paradas="//@paradas.0 //@paradas.3" paradaIni="//@paradas.0" paradaFin="//@paradas.3"/>
  <lineas xsi:type="red:LineaBus" codigo="LineaBus2" horaApertura="9" horaCierre="15" paradas="//@paradas.0 //@paradas.3" paradaIni="//@paradas.0" paradaFin="//@paradas.3"/>
  <paradas xsi:type="red:ParadaBus" nombre="Pueblo1" accesible="true" aparcamientoGrat="true" zonatarificacion="//@zonasTarifacion.0"/>
  <paradas xsi:type="red:ParadaMetro" nombre="Pueblo1" zonatarificacion="//@zonasTarifacion.0" aseos="true"/>
  <paradas xsi:type="red:ParadaTren" nombre="Pueblo1" zonatarificacion="//@zonasTarifacion.0" aseos="true"/>
  <paradas xsi:type="red:ParadaBus" nombre="Pueblo2" zonatarificacion="//@zonasTarifacion.1"/>
  <paradas xsi:type="red:ParadaMetro" nombre="Pueblo2" zonatarificacion="//@zonasTarifacion.1"/>
  <paradas xsi:type="red:ParadaTren" nombre="Pueblo2" zonatarificacion="//@zonasTarifacion.1"/>
  <zonasTarifacion tarifaBus="0.1" tarifaMetro="0.2" tarifaTren="0.3"/>
  <zonasTarifacion enumeracion="2" tarifaBus="0.2" tarifaMetro="0.3" tarifaTren="0.4"/>
</red:RedTransporte>
