# Donjon

Des aventuriers parcourent un donjon. Chaque aventurier a un nom et possède un nombre de pièces d'or.
Le donjon contient des salles au trésor, avec dans chacune un nombre de pièce d'or à trouver.

Les aventuriers ont décidé qu'ils allaient ouvrir les salles aux trésors à tour et prendre tout l'argent contenu dans ces dernières.

Par exemple : une équipe d'aventuriers est composée d'Arnold, Electra et DarkSasuke, parcourent un donjon composé de quatre salles aux trésors.

* Arnold ouvre la première salle, il prend 50 pièces d'or.
* Electra ouvre la seconde salle, elle prend 120 pièces d'or.
* DarkSasuke ouvre la troisième salle, il n'y a pas de pièce d'or.
* Arnold ouvre la quatrième et dernière salle, il prend 60 pièces d'or.

Une fois toutes les salles du donjon parcourues, retourne un HashMap avec les noms des aventuriers et le nombre de pièces d'or qu'ils ont trouvé, dans notre exemple :

	{
		{"Arnold", 110},
		{"Electra", 120},
		{"DarkSasuke", 0}
	}

Rappel des commandes junit :

    javac -cp .:junit-4.12.jar DungeonTest.java
    java -cp .:junit-4.12.jar:hamcrest-core-1.3.jar org.junit.runner.JUnitCore DungeonTest
