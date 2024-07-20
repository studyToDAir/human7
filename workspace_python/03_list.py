a = [1, 1.2, 'word', True, [1,2,3]]
print(a)
print( a[1] )
# print( a[10] )    # 범위를 벗어나는 경우 오류 발생
print( a[-2] )  # 음수 index는 뒤에서 부터 센다, 맨 마지막이 -1

a[3] = False
a[-1] = False

print('abcd'[0])    # 문자열도 배열로 취급한다
print( a[2][1] )

# 초기화
a = []
a = list()

# range
# range(시작index, 종료index, step)
# 시작index부터 종료index 바로 앞까지 step 만큼 증가
# 시작index 기본값 : 0
# step 기본값 : 1
a = range(10) # 전달인자 하나인 경우 종료index로 인식
print(a)
print( list(a) )
print( list( range(4, 10, 2) )) # 4부터 10바로 앞까지 2씩 증가
print( list( range(10, 0) )) # 종료index가 시작보다 작으면 비어있음
print( list( range(10, 0, -1) )) #step도 음수가 될 수 있음

# https://wikidocs.net/14
a = [100,15,1,1,1,25,13,54]
a.append(5)     # 마지막에 추가
print(a)

a.sort()        # 오름차순으로 정렬
print(a)
print('!')
a.sort(reverse=True)    # 내림차순으로 정렬 
print(a)

a.reverse()     # 배열 뒤집기
print(a)

print( a.index(25) )    # 값이 있는 곳의 index를 반환

a.insert(1, 200)    # 원하는 index에 값 끼워넣기
print(a)

a.remove(1)     # 순차적으로 첫번째 나오는 값을 삭제
                # 값이 없는 경우 에러 발생
print(a)

x = a.pop()     # 맨 마지막값을 지우면서 돌려준다
print(x)
print(a)

print( a.count(1) ) # 값이 몇개나 있는가?

b = [-1,-2]
c = a.extend(b) # a += b 와 같다
print(a)
print(c)

print( min(a) )
print( max(a) )
print( sum(a) )


