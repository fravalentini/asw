# Asw primo progetto 

## Dominio applicativo

Il servizio S fornisce due operazioni:
 1. `/S/<attore>/<anno>` restituisce informazioni (casuali) sull'`<attore>` (la nazionalità) e sul numero (casuale) di premi vinti in        quell'anno.
 2. `/S/<attore>` restituisce invece informazioni (casuali) sull'`<attore>` (nazionalità) e sul numero (casuale) dei premi vinti nella  sua carriera.

Ad esempio, la richiesta /S/Benigni/1997, sulla porta 8080, potrebbe restituire "Benigni è un attore italiano ed ha vinto 5 premi nel 1997".    
La richiesta /S/Benigni, sulla medesima porta, potrebbe restituire "Benigni è un attore italiano ed ha vinto 50 premi nella sua carriera".    
Il servizio S viene implementato con due servizi secondari S1 e S2 nel seguente modo: la richiesta `S1/<attore>`, sulla porta 8081, restituisce la nazionalità (casuale) dell'attore. (ad esempio la richiesta /S1/Benigni potrebbe restituire "italiano").    
La richiesta `S2/<attore>/<anno>`, sulla porta 8082, restituisce il numero (casuale) dei premi vinti dall'attore nell'anno specificato (ad esempio /S2/Benigni/1997 potrebbe restituire 5).    
La richiesta `S2/<attore>` restituisce il numero (casuale) dei premi vinti dall'attore nella sua carriera (ad esempio /S2/Benigni potrebbe restituire 50).    
Il servizio S risponde al suo client usufruendo dei servizi S1 e S2 e integrando le loro risposte.

### Build

Per compilare e assemblare ciascuna applicazione, bisogna 
  1. posizionarsi nella cartella principale dell'applicazione di interesse - ad esempio `~/asw/asw_primo_progetto/actor-service`
  2. per compilare e assemblare l'applicazione, usare il comando `gradle build` 

### Esecuzione

Per eseguire ciascuna applicazione: 
  1. posizionarsi nella cartella principale dell'applicazione di interesse - ad esempio `~/asw/asw_primo_progetto/actor-service`
  2. eseguire il comando `sh run-actor-service.sh` 
  
#### Esecuzione dell'applicazione per la generazione di frasi casuali 

In terminali diversi, fare quanto segue: 
* nella cartella principale del servizio **actor-service** eseguire lo script `../run-actor-service.sh` 
* nella cartella principale del servizio **nationality-service** eseguire lo script `../run-nationality-service.sh` 
* nella cartella principale del servizio **award-service** eseguire lo script `../run-award-service.sh` 

Attenzione: il corretto funzionamento del servizio **actor-service** dipende dall'esecuzione degli altri due.

