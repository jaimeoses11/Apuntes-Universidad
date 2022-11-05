Simulacion de una partida de dardos entre dos jugadores. Las modalidades de juego admitidas
son el 301 o el 501.

Los jugadores van efectuando sus tiradas alternativamente. En cada tirada se lanzan 3 
dardos, salvo si con el 1º o 2º ya se ha ganado o se han obtenido más puntos de los que
tiene el jugador. En este último caso (el jugador obtiene un numero de puntos mayor que
su puntuacion, la tirada se anula, obteniendo 0 puntos).

Para evitar que la partida se alargue en exceso, se considera un número máximo de 20 turnos.

La clase principal es "Partida", que pide al usuario la modalidad del juego y desarrolla una
partida del juego.

Se propone pensar en implementar otras modalidades del juego, como:
* Double-in: se empiezan a contabilizar puntos a partir de un lanzamiento a un doble
* Master-in: se empiezan a contabilizar puntos a partir de un lanzamiento a un triple
* Double-out: el jugador debe ganar finalizando con un lanzamiento a un doble
* Master-out: el jugador debe ganar finalizando con un lanzamiento a un triple
* Parchís: cuando un jugador alcanza la puntuación de otro, este segundo es "comido" y debe
  volver a comenzar a jugar