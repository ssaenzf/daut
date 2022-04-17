<?xml version="1.0" encoding="UTF-8"?>
<red:RedTransporte xmi:version="2.0" xmlns:xmi="http://www.omg.org/XMI" xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance" xmlns:red="red">
  <lineas xsi:type="red:LineaMetro" codigo="123" horaApertura="6" horaCierre="23" paradaIni="//@paradas.0" paradaFin="//@paradas.2" paradas="//@paradas.0 //@paradas.1 //@paradas.2">
    <descuentos horaIni="6" horaFin="8"/>
    <descuentos horaIni="9" horaFin="11" descuento="40"/>
  </lineas>
  <lineas xsi:type="red:LineaMetro" codigo="456" horaApertura="6" horaCierre="20" paradaIni="//@paradas.0" paradaFin="//@paradas.2" paradas="//@paradas.0 //@paradas.1 //@paradas.2" color="Verde"/>
  <lineas xsi:type="red:LineaBus" codigo="123" horaApertura="6" horaCierre="14" paradaIni="//@paradas.3" paradaFin="//@paradas.4" paradas="//@paradas.3 //@paradas.4" isDiurna="true"/>
  <lineas xsi:type="red:LineaTren" codigo="5" horaApertura="7" horaCierre="18" paradaIni="//@paradas.5" paradaFin="//@paradas.6" paradas="//@paradas.5 //@paradas.6"/>
  <paradas xsi:type="red:ParadaMetro" nombre="1" zonatarificacion="//@zonasTarifacion.0"/>
  <paradas xsi:type="red:ParadaMetro" nombre="2" zonatarificacion="//@zonasTarifacion.0"/>
  <paradas xsi:type="red:ParadaMetro" nombre="3" zonatarificacion="//@zonasTarifacion.1"/>
  <paradas xsi:type="red:ParadaBus" nombre="123" zonatarificacion="//@zonasTarifacion.1"/>
  <paradas xsi:type="red:ParadaBus" nombre="589" zonatarificacion="//@zonasTarifacion.1"/>
  <paradas xsi:type="red:ParadaTren" nombre="8" zonatarificacion="//@zonasTarifacion.1"/>
  <paradas xsi:type="red:ParadaTren" nombre="9" zonatarificacion="//@zonasTarifacion.1"/>
  <zonasTarifacion tarifaBus="4.0" tarifaMetro="3.0" tarifaTren="2.0"/>
  <zonasTarifacion enumeracion="2" tarifaBus="5.0" tarifaMetro="4.0" tarifaTren="3.0"/>
</red:RedTransporte>
