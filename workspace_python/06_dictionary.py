lux = {'health': 490, 'mana': 334, 'melee': 550, 'armor': 18.72}
print(lux['mana'])
lux['mana'] = 400
print(lux['mana'])

x = {1,2,3} # 키만 존재할 수도 있다
print(x)

print( 'mana' in lux )
print( len(lux) )

print( lux.items() )
print( lux.keys() )
print( lux.values() )

print( lux.get('mana') )
print( lux.get('mana2') ) # 키값이 없을때 None
print( lux.get('mana2', 'not found') ) # None일때 기본값을 지정할 수 있다

