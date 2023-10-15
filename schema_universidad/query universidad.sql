use universidad;
-- Primeras consultas de la base de datos Universidad
SELECT apellido1, apellido2, nombre FROM persona ORDER BY apellido1 ASC, apellido2 ASC, nombre ASC;
SELECT apellido1, apellido2, nombre, telefono FROM persona WHERE telefono IS NULL;
SELECT apellido1, apellido2, nombre, fecha_nacimiento FROM persona WHERE YEAR(fecha_nacimiento) = 1999;
SELECT apellido1, apellido2, nombre, tipo, telefono, nif FROM persona WHERE tipo = 'profesor' AND telefono IS NULL AND nif LIKE '%k';
SELECT * FROM asignatura WHERE cuatrimestre = 1 AND curso = 3 AND id_grado = 7; 
SELECT persona.apellido1, persona.apellido2, persona.nombre, departamento.nombre AS nombre_departamento FROM profesor INNER JOIN persona ON profesor.id_profesor = persona.id INNER JOIN departamento ON profesor.id_departamento = departamento.id ORDER BY persona.apellido1 ASC, persona.apellido2 ASC, persona.nombre ASC;
SELECT asignatura.nombre, curso_escolar.anyo_inicio, curso_escolar.anyo_fin FROM alumno_se_matricula_asignatura INNER JOIN asignatura ON alumno_se_matricula_asignatura.id_asignatura = asignatura.id INNER JOIN curso_escolar ON alumno_se_matricula_asignatura.id_curso_escolar = curso_escolar.id INNER JOIN persona ON alumno_se_matricula_asignatura.id_alumno = persona.id WHERE persona.nif = '26902806M';
SELECT DISTINCT departamento.nombre AS nombre_departamento FROM departamento INNER JOIN profesor ON departamento.id = profesor.id_departamento INNER JOIN asignatura ON profesor.id_profesor = asignatura.id_profesor INNER JOIN grado ON asignatura.id_grado = grado.id WHERE grado.nombre = 'Grado en Ingeniería Informática (Plan 2015)';
SELECT DISTINCT persona.nombre, persona.apellido1, persona.apellido2 FROM persona INNER JOIN alumno_se_matricula_asignatura ON persona.id = alumno_se_matricula_asignatura.id_alumno INNER JOIN curso_escolar ON alumno_se_matricula_asignatura.id_curso_escolar = curso_escolar.id WHERE curso_escolar.anyo_inicio = 2018 AND curso_escolar.anyo_fin = 2019;
-- Consultas utilizando las cláusulas LEFT JOIN y RIGHT JOIN
SELECT departamento.nombre AS nombre_departamento, persona.apellido1, persona.apellido2, persona.nombre FROM persona LEFT JOIN profesor ON persona.id = profesor.id_profesor LEFT JOIN departamento ON profesor.id_departamento = departamento.id WHERE persona.tipo = 'profesor' ORDER BY departamento.nombre ASC, persona.apellido1 ASC, persona.apellido2 ASC, persona.nombre ASC;
SELECT persona.apellido1, persona.apellido2, persona.nombre, persona.nif FROM persona LEFT JOIN profesor ON persona.id = profesor.id_profesor WHERE persona.tipo = 'profesor' AND profesor.id_departamento IS NULL;
SELECT departamento.nombre FROM departamento LEFT JOIN profesor ON departamento.id = profesor.id_departamento WHERE profesor.id_profesor IS NULL;
SELECT asignatura.nombre FROM asignatura LEFT JOIN profesor ON asignatura.id_profesor = profesor.id_profesor WHERE profesor.id_profesor IS NULL;
SELECT asignatura.nombre FROM asignatura LEFT JOIN profesor ON asignatura.id_profesor = profesor.id_profesor WHERE profesor.id_profesor IS NULL;
SELECT d.nombre AS Departamento FROM departamento d LEFT JOIN profesor p ON d.id = p.id_departamento LEFT JOIN asignatura a ON p.id_profesor = a.id_profesor LEFT JOIN curso_escolar ce ON a.id = ce.id WHERE ce.id IS NULL GROUP BY d.id, d.nombre;
-- Consultas resumen
SELECT COUNT(*) AS total_alumnos FROM persona WHERE tipo = 'alumno';
SELECT COUNT(*) AS total_alumnos_nac_1999 FROM persona WHERE tipo = 'alumno' AND YEAR(fecha_nacimiento) = 1999;
SELECT d.nombre AS Nombre_Departamento, COUNT(p.id_profesor) AS Numero_Profesores FROM departamento d LEFT JOIN profesor p ON d.id = p.id_departamento GROUP BY d.id HAVING COUNT(p.id_profesor) > 0 ORDER BY Numero_Profesores DESC;
SELECT d.nombre AS Nombre_Departamento, COUNT(p.id_profesor) AS Numero_Profesores FROM departamento d LEFT JOIN profesor p ON d.id = p.id_departamento GROUP BY d.nombre;
SELECT g.nombre AS Nombre_Grado, COUNT(a.id) AS Numero_Asignaturas FROM grado g LEFT JOIN asignatura a ON g.id = a.id_grado GROUP BY g.nombre ORDER BY Numero_Asignaturas DESC;
SELECT g.nombre AS Nombre_Grado, COUNT(a.id) AS Numero_Asignaturas FROM grado g LEFT JOIN asignatura a ON g.id = a.id_grado GROUP BY g.nombre HAVING Numero_Asignaturas > 40 ORDER BY Numero_Asignaturas DESC;
SELECT g.nombre AS Nombre_Grado, a.tipo AS Tipo_Asignatura, SUM(a.creditos) AS Suma_Creditos FROM grado g LEFT JOIN asignatura a ON g.id = a.id_grado GROUP BY g.nombre, a.tipo ORDER BY g.nombre, a.tipo;
SELECT anyo_inicio AS Año_Inicio_Curso, COUNT(DISTINCT id_alumno) AS Num_Alumnos_Matriculados FROM curso_escolar LEFT JOIN alumno_se_matricula_asignatura ON curso_escolar.id = alumno_se_matricula_asignatura.id_curso_escolar GROUP BY anyo_inicio ORDER BY anyo_inicio; 
SELECT p.id AS id_profesor, p.nombre AS nombre_profesor, p.apellido1 AS primer_apellido, p.apellido2 AS segundo_apellido, COUNT(a.id) AS numero_de_asignaturas FROM persona p LEFT JOIN profesor pr ON p.id = pr.id_profesor LEFT JOIN asignatura a ON pr.id_profesor = a.id_profesor GROUP BY p.id, p.nombre, p.apellido1, p.apellido2 ORDER BY numero_de_asignaturas DESC;
SELECT * FROM persona WHERE tipo = 'alumno' ORDER BY fecha_nacimiento DESC LIMIT 1;
SELECT persona.id, persona.nombre, persona.apellido1, persona.apellido2 FROM persona INNER JOIN profesor ON persona.id = profesor.id_profesor LEFT JOIN asignatura ON profesor.id_profesor = asignatura.id_profesor WHERE profesor.id_departamento IS NOT NULL AND asignatura.id IS NULL; 

