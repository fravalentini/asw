# Project
## Build

Per la costruzione di ciascuna applicazione, vedere le istruzioni descritte nella sezione projects/.

In pratica, per compilare e assemblare ciascuna applicazione, bisogna

posizionarsi nella cartella principale dell'applicazione di interesse - ad esempio ~/projects/asw-882-spring-boot/a-hello

per compilare e assemblare l'applicazione, usare il comando gradle build

Ambiente di esecuzione

Ciascuna di queste applicazioni può essere eseguita direttamente nell'ambiente developer, sul nodo dev. In questo modo, le applicazioni web che espongono servizi alla porta 8080 del nodo dev vengono anche pubblicate sulla porta 8088 dell'host.

Esecuzione

Per eseguire un'applicazione (ad eccezione delle applicazioni j-lucky-word-properties, k-lucky-word-profiles, l1-word-service e l2-sentence-service, descritte più avanti):

posizionarsi nella cartella principale dell'applicazione di interesse - ad esempio ~/projects/asw-882-spring-boot/a-hello

eseguire il comando gradle bootRun - attenzione, bisogna usare il task bootRun di Gradle, e non il task run

Esecuzione dell'applicazione j-lucky-word-properties

Posizionarsi nella cartella principale dell'applicazione, ~/projects/asw-882-spring-boot/j-lucky-word-properties e poi:

eseguire lo script ../run-with-default-property.sh per avviare il servizio usando la parola fortunata di default (la parola fortunata è Default)

eseguire lo script ../run-with-argument.sh per avviare il servizio passando la parola fortunata come un argomento (la parola fortunata è Argument)

eseguire lo script ../run-with-env-variable.sh per avviare il servizio passando la parola fortunata mediante una variabile d'ambiente (la parola fortunata è Environment variable)

Esecuzione dell'applicazione k-lucky-word-profiles

Posizionarsi nella cartella principale dell'applicazione, ~/projects/asw-882-spring-boot/j-lucky-word-properties e poi:

eseguire lo script ../run-as-default.sh per avviare il servizio usando il profilo di default (la parola fortunata è Default)

eseguire lo script ../run-as-english.sh per avviare il servizio usando il profilo english (la parola fortunata è Happy)

eseguire lo script ../run-as-italian.sh per avviare il servizio usando il profilo italian (la parola fortunata è Evviva)

Esecuzione dell'applicazione per la generazione di frasi casuali

In terminali diversi, fare quanto segue:

nella cartella principale del servizio l1-word-service eseguire lo script ../run-word-service-as-subject.sh

nella cartella principale del servizio l1-word-service eseguire lo script ../run-word-service-as-verb.sh

nella cartella principale del servizio l1-word-service eseguire lo script ../run-word-service-as-object.sh

nella cartella principale del servizio l2-sentence-service eseguire lo script ../run-sentence-service.sh

