harf=[]
sayi=[]
metin=input("Karakter giriniz: ")
metin=list(metin)
metin.sort()
for i in metin:
    if not i in harf:
        harf.append(i)
        sayi.append(1)
    else:
        sayi[harf.index(i)]+=1
for j in range(len(harf)):
    if harf[j]==" ":
        print("boşluk karakterinden",sayi[j],"tane var.")
    else:
        print(harf[j],"karakterinden",sayi[j],"tane var.")