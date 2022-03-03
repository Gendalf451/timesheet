<!DOCTYPE html>
<html>
<head>
    <title>Табель отсутствия сотрудников</title>
</head>
<body>
<h1>Табель отсутствия на работе</h1>

<style>
    table {
        border-collapse: separate;
        width: 100%;
        border: 1px solid #000;;
    }
    th, td {
        text-align: left;
        padding: 8px;
        border: 1px solid #000;;
    }
    tr:nth-child(even){background-color: #f2f2f2}
</style>

    <table>
        <tr>
            <td><b>ФИО</b></td>
            <td><b>Должность</b></td>
            <td><b>Дата отсутствия</b></td>
            <td><b>Время отсутствия</b></td>
            <td><b>Причина отсутствия</b></td>
        </tr>
        <#list staff as staff>
        <tr>
            <td>${staff.employee}</td>
            <td>${staff.position}</td>
            <td>${staff.absenceDate}</td>
            <td>${staff.absenceTime}</td>
            <td>${staff.absenceReason}</td>
        </tr>
        <#else>
            <h3>Ничего не найдено!</h3>
        </#list>
</table>

<h3>Поиск</h3>

<form method="post" action="filter">
    <ul>
        <p>ФИО
        <input type="text" name="employee" placeholder="ФИО" /><br>
        <p>Дата отсутствия
        <input type="date" name="absenceDate" placeholder="Дата отсутствия"><br>
        <p><button type="submit">Поиск</button>
    </ul>
</form>
<p><a href="add/">Добавить запись</a></p>
<p><a href="/main/">Показать все</a></p>
</body>
</html>