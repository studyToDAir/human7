l = [1,2,3]
t = (1,2,3)
l[0] = 10
# t[0] = 10 # 튜플은 값을 바꿀 수 없는 리스트
print(t[0])

# 튜플 선언 방법
t1 = (1,2,3)
t2 = 1,2,3,4
print(t2)
# 한개짜리 튜플을 만들때
t3 = 1      # 그냥 int 1
t3 = (1)    # 예도 그냥 int 1
t3 = (1,)   # 그래서 이렇게 적어야 한다
t3 = 1,     # () 생략 가능
print(t3)
# print(t3[1])  # 리스트와 마찬가지로 tuple index out of range

t = tuple( range(5) )
print(t)

l = list('hello')
print(l)
t = tuple('hello')
print(t)

