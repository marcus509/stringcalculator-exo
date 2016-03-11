StringCalculator

Avant de commencer : 
1. Faire les taches dans l’ordre
2. Faire une tâche à la fois.
3. Assurez-vous que vous testez seulement les entrées valides. Il n'y a pas besoin de tester les cas non valides.
4. Il doit pas avoir des régressions sur les taches précédentes au cours de l’exercice.


Exercice : 
1. Compléter la méthode add pour accepter 0, 1 ou 2 chiffres et qui retourne leur somme (la chaîne vide retourne 0).
   Le caractère de séparation est la virgule. 
   Exemple : add("")=0, add("1")=1 ou add("1,2")=3
   
2. Permettre à la méthode add d'accepter plus de deux nombres
   Exemple : add("1,2,3")=6
   
3. La méthode add peut gérer le retour à la ligne "\n" 
   Exemple : add("1\n2,3")=6
   ATTENTION : l'entrée suivante n’est PAS autorisée: "1,\n"

4. Différents séparateurs : la méthode peut accepter un séparateur different de la virgule, 
   le début de la chaîne contiendra une ligne distincte qui ressemble à ceci: "//[séparateur]\[nombre ...]"
   Exemple : add("//;\n1;2")=3 
   ATTENTION : la première ligne est facultative. tous les scénarios existants doivent encore être pris en charge.
    
5. Si la chaine d'entrée contient un numéro négatif, la méthode add lance une exception 
   avec le message suivant "negatives not allowed [numéros négatifs...]"
   Exemple : add("1,-2") : "negatives not allowed -2"