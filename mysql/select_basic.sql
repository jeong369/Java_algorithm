select	empno,ename
from	emp;
-- where
-- group by
-- having
-- order by

select	*
from	emp;

select	*
from	emp
where	deptno = 10;

select	*
from	emp
where	deptno = 10
and		SAL >= 2000;

select 	empno,ename,sal,comm, sal*12+comm
from	emp;

select 	empno,ename,sal,comm, sal*12+ifnull(comm,0) as 연봉
from	emp;

select  *
from 	emp
where	comm is null;

select  *
from 	emp
where	comm is not null;

select *
from emp
-- where	ename = 'SMITH';
-- where	ename like 'S%';
-- where	ename like '%S';-- 
-- where	ename like '%S%';-- 
-- where	ename like '___E%';-- 
where sal between 1300 and 3000;
-- where job in('CLERK','MANAGER');

select	deptno, count(*), count(comm),max(sal), min(sal), avg(sal)
from	emp
group by deptno;

select count(mgr),count(distinct mgr)
from emp;


select	deptno, count(*)
from	emp
group by deptno
having count(*) >=5;


select * 
from emp
order by deptno desc,sal;



