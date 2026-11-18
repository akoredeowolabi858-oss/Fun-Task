def coversion(value, unit ='c'):
    if unit == 'c':
        f = (c*9/5)+32
        if f >= 30:
            advisory = 'heat advisory'
        else:
            advisory = 'cold advisory'
            
            
            
    if unit == 'f':
        c = (f-32)*5/9
        if c > 30:
            advisory ='heat advisory'
        else
            advisory = 'cold advisory'
    return advisory
    
    
