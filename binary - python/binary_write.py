with open('Rabbil_Atul.bin' , 'wb') as biodata:
    text = 'Name Rabbil Atul Hadawiah Binti Che Yusoff, Matrix No 2014831292, Gender Female, Email adayusoff@yahoo.com'
    biodata.write(text.encode('utf-8'))
    
biodata.close()
