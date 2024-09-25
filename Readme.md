# primitiveutfchars

## exercicio 6
primitiveUTFChars

Neste exercicio seguiremos tratando os fluxos binarios de datos pero abora tratandoos como soporte de tipos de dato primitivos e valores String

DataInputStream dispon dunha serie de  métodos  para que partindo  de fluxos binaros de datos  podamos ler tipos primitivos de datos e valores String

DataOutputStream dispon dunha serie de  métodos  para que partindo  de fluxos binaros de datos  podamos escribir tipos primitivos de datos e valores String que previamente foron codificados nestes fluxos mediante DataInputStream

Dado que DatainputStream admite como parametro calquer clase herdada de InputStream , e BufferedInputStream cumpre este requisito,  o único que temos que facer para poder usar os metodos de DataInputStream e pasarlle como parmaetro un obxecto BufferedInputStream coma otraballado no exercicio anterior


Dado que DataOutputStream admite como parametro calquer clase herdada de OutputStream , e BufferedOutputStream cumpre este requisito o único que temos que facer para poder usar os metodos de DataOutputStream e pasarlle como parmaetro un obxecto BufferedOutputStream coma o traballado no exercicio anterior
APLICACION

Propoñovos un exercicio que consistirá grabar unha mesma cadea  de texto tres veces usando dous metodos distintos (writeUTF e writeChars) nun ficheiro denominado text6.dat para posteriormente recuperalos.
Lembrade que para recuperar unha cadea de gravada con witeUTF debedes usar readUTF
Pero para recuperar unha cadea escrita con writeChars debedes usar readChar() que so lé un caracter de cada vez , isto implca que debedes usar un bucle que faga tantas lecturas como caracteres ten a cadea orixinal.


cadea a grabar : “Está en casa”

a primeira vez debe grabase usando writeUTF(String)
a segunda usando writeChars(String)
a terceira usando de novo writeUTF(String)


o resultado da execucion debería ser o seguinte:

writeUTF escribindo: Está en casawriteUTF escribindo: Está en casa
bytes totais escritos: 15 bytes
writeChars escribindo: Está en casa
bytes totais escritos :  39bytes
writeUTF escribindo: Está en casa
bytes totais escritos  54 bytes
bytes totais por ler = 54 bytes
lemos a primeira cadea en UTF: Está en casa
numero de bytes por ler: 39 bytes.
lemos a segunda cadea  con readChar() en bucle:  Está en casa
numero de bytes por ler : 15
lemos a terceira cadea  mediante readUTF:  Está en casa
numero de bytes por ler : 0

Podemos comprobar que se intentamos abrir a o ficheiro de texto   co editor gedit non o permite.
debemos usar nano , vi , emacs ou outro editor non grafico  e comprobaremos a forma en que
foron grabadas as  cadeas.

