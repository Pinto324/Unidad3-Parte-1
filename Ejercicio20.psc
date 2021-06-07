Algoritmo Ejercicio20
		Escribir 'Inserta tu numero'
		Leer sub1
		long <- Longitud(sub1)
		n <- '0123456789'
		longn <- Longitud(n)
		Para i<-1 Hasta long Hacer
			cad <- Subcadena(sub1,i,i)
			Si cad=' ' Entonces
				p <- 0
			SiNo
				sub2 <- concatenar(sub2,cad)
			FinSi
		FinPara
		Para i<-long Hasta 1 Con Paso -1 Hacer
			cad <- Subcadena(sub1,i,i)
			Si cad=' ' Entonces
				p <- 0
			SiNo
				cad3 <- concatenar(cad3,cad)
			FinSi
		FinPara
		Si sub2=cad3 Entonces
			Escribir sub2
			Escribir cad3
			Escribir 'El numero si es Capicua'
		SiNo
			Escribir 'El numero no es Capicua'
			Escribir sub2
			Escribir cad3
		FinSi
FinAlgoritmo
