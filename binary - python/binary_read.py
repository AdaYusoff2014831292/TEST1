print 'My Biodata' + '\n'

with open('Rabbil_Atul.bin', 'rb') as biodata:
    data = biodata.read()
    text = data.decode('utf-8')
    

biodata.close()
