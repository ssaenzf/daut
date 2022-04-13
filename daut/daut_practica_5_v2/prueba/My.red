<?xml version="1.0" encoding="UTF-8"?>
<red:RedTransporte xmi:version="2.0" xmlns:xmi="http://www.omg.org/XMI" xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance" xmlns:red="red">
  <lineas xsi:type="red:LineaMetro" codigo="123" horaApertura="6" horaCierre="22" paradaIni="//@paradas.1" paradaFin="//@paradas.0" paradas="//@paradas.0 //@paradas.1">
    <descuentos horaIni="16" horaFin="18" descuento="3"/>
    <descuentos horaIni="6" horaFin="16" descuento="2"/>
  </lineas>
  <paradas xsi:type="red:ParadaMetro" nombre="1"/>
  <paradas xsi:type="red:ParadaMetro" nombre="2"/>
  <zonasTarifacion tarifaBus="12.0" tarifaMetro="2.0" tarifaTren="4.0"/>
</red:RedTransporte>
