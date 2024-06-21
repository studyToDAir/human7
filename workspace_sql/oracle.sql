-- 한줄 주석
/* 범위 주석 */
SELECT
    *
FROM
    emp;
-- sql developer 자동 정렬 단축키 : Ctrl + F7
SELECT
    empno,-- 조회하고 싶은 컬럼 명들
    ename,
    deptno
FROM
    emp;

SELECT
    1, 'a', 30*654
FROM
    emp;
    
select * from dept;
select * from salgrade;

select deptno from emp;
-- 한줄 복사 단축키 : ctrl + shift + d
-- 한줄 지우기 : ctrl + x , alt + shift + d
-- distinct : select에서 중복되는 자료를 제거해준다
select distinct deptno from emp;
select distinct job from emp;

select deptno, job from emp;
-- 컬럼이 여러개인 경우 컬럼들의 조합이 중복되는걸 제거한다
select distinct deptno, job from emp;

-- null과 연산하면 무조건 null이다
select ename, sal, sal*12+comm, comm from emp;

-- 컬럼명에 별칭 사용
-- " 생략 가능
-- as 생략 가능
-- 별칭안에 띄어쓰기가 있는 경우 " 생략 불가
-- 가능하면 띄어쓰기보다 _를 넣자
select ename, sal, sal*12+comm as "new sal", comm from emp;

-- order by : 해당 컬럼으로 정렬
-- 오름차순 : asc 생략가능
-- 내림차순 : desc
select * from emp
order by sal asc;

select * from emp
order by comm;

select * from emp
order by sal desc;

-- order by 첫번째거로 정렬하고
-- 그 중에 같은게 있다면 다음거로 정렬하고
-- 그 중에 같은게 있다면 다음거로 정렬하고
select * from emp
order by deptno asc, sal desc;

select distinct job from emp
order by job;

select * from emp
where deptno = 30;

select * from emp
where empno = 7782;

select * from emp
where sal >= 2000
order by sal;

select * from emp
where ename = 'KING';

select * from emp
where deptno = 30 and job = 'SALESMAN';

select * from emp
where job = 'CLERK' and deptno = 30;

select * from emp
where job = 'CLERK' and deptno = 30 or deptno = 20;

select * from emp
where job = 'CLERK' and (deptno = 30 or deptno = 20);

select * from emp
where sal >= 2000 and sal < 3000;
--2000 <= sal < 3000

select * from emp
--where sal != 3000;
where sal <> 3000;


/*
    !(a != b)
*/
select * from emp
where not (sal >= 2000 and sal < 3000);

select * from emp
where job = 'MANAGER' or job = 'SALESMAN' or job = 'CLERK';

select * from emp
where job in ('MANAGER', 'SALESMAN', 'CLERK');

select * from emp
where job not in ('MANAGER', 'SALESMAN', 'CLERK');

select * from emp
where sal >= 2000 and sal <= 3000;

select * from emp
where sal between 2000 and 3000;

select * from emp
where sal not between 2000 and 3000;

-- %는 어떤거든 관계없음
select * from emp
where ename like 'S%';

select * from emp where ename like 'A%';

-- _는 딱 한글자인데 어떤 글자던 관계 없음
select * from emp
where ename like '_L%';

select * from emp
where ename not like '____';

select * from emp
where ename like '%AM%';

select * from emp
where comm <= 400;

select * from emp
where comm = null;

select * from emp
where comm is null;

select * from emp
where comm is not null;

-- emp에서 deptno가 10 또는 20인 사원의
-- empno, ename, sal, deptno를 출력하세요
select empno, ename, sal, deptno from emp
--where deptno = 10 or deptno = 20;
where deptno in (10, 20);

-- 서로 다른 조회 결과물을 합쳐줍니다.
-- 단, 조회한 컬럼의 개수, 타입이 같아야 한다.
select empno, ename, sal, deptno from emp
where deptno = 10
union
select empno, ename, sal, deptno from emp
where deptno = 20;

-- union : 중복된 자료를 제거해줌
select empno, ename, sal, deptno from emp
where deptno = 10
union
select empno, ename, sal, deptno from emp
where deptno = 10;

-- union all : 중복에 관계없이 합쳐준다
select empno, ename, sal, deptno from emp
where deptno = 10
union all
select empno, ename, sal, deptno from emp
where deptno = 10;

-- 125p.
-- Q1
select * from emp where ename like '%S';
-- Q2
select empno, ename, job, sal, deptno from emp where deptno = 30 and job = 'SALESMAN';
-- Q3
select empno, ename, job, sal, deptno from emp
where deptno in (20, 30) and sal > 2000;
-- Q3-union
select empno, ename, job, sal, deptno from emp
where deptno = 20 and sal > 2000
union all
select empno, ename, job, sal, deptno from emp
where deptno = 30 and sal > 2000;
-- Q4
select * from emp 
where not (2000 <= sal and sal <= 3000);
-- Q5
select ename, empno, sal, deptno
from emp
where ename like '%E%'
and deptno = 30
and not (sal > 1000 and sal < 2000);
-- Q6
select * from emp
where
        comm is null
    and mgr is not null
    and job in ('MANAGER', 'CLERK')
    and ename not like ('_L%');

select ename, upper(ename), lower(ename), initcap(ename)
from emp;

-- upper, lower는 대소문자 구분 없이 like할때 딱 좋다
select * from emp
where lower(ename) like lower('%Mi%');

-- length : 문자 개수
select ename, length(ename)
from emp;

select * from emp 
where length(ename) >= 5;

-- dual : 임시 테이블
select length('한'), lengthb('한') from dual;

-- substr  : 대상이되는 문자, 시작위치, 가져올 개수
-- 가져올 개수를 안쓰거나 너무 크면 끝까지
select 
    job, 
    substr(job, 1, 2), substr(job, 0, 2), 
    substr(job, 3, 3), 
    substr(job, 5),
    ename,
    substr(job, -3, 2),
    length( lower( substr(job, 5, 100) ) )
from emp;

select job, replace(job, 'A', '*') from emp;

select 
    job,
    length(job),
    (length(job)+1) / 2,
    substr(job, (length(job)+1) / 2, 1),
    replace(
        job,
        substr(job, (length(job)+1) / 2, 1),
        '*'
    )
from emp;

-- lpad : 대상이 되는 문자, 전체 자리수, 채울 문자
-- 채울 문자 생략 시 공백문자
select 
    job,
    lpad(job, 10, '#'),
    lpad(job, 4, '#')
from emp;

select 
    job, length(job), (15 - length(job))/2
from emp;

-- 뭔가 가운데 정렬 느낌
select
    rpad(
        lpad(
            job, 
            (16 - (length(job)))/2 + length(job), 
            '*'
        ),
            
        (16 - (length(job)))/2 + length(lpad(
            job, 
            (16 - (length(job)))/2 + length(job), 
            '*')
        ),
        
        '*')
from emp;



