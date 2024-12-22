def Schleife(liste_eins, liste_zwei):
    result=[]
    for zahl_1 in liste_eins:
        for zahl_2 in liste_zwei:
            result.append(zahl_1*zahl_2)
    return result
            
            
arr_eins= [1,2,3]
arr_zwei= [4,5,6]

result= schleife(arr_eins, arr_zwei)
print(result)

#Berechnet jeweils vom ersten Arrays die Indexe mal die zweite Arrays jeweils nacheinander

#It calculated the indexes of first arrays with each Array Indexes of 2 Array
