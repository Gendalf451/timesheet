<!DOCTYPE html>
<html>
<head>
    <title>Добавление записи</title>
</head>
<body>
<h1>Добавить запись в табель</h1>

<form method="post">
    ФИО
    <select name="employee[]" multiple="multiple" size="5">
        <#list employee as employee>
        <option value="${employee.fullName}">${employee.fullName}</option>
        </#list>
    </select><br>
<#--    <input type="text" name="employee" placeholder="ФИО" /><br>-->
    Должность
<#--    <input type="text" name="position" placeholder="Должность"><br>-->
    <select name="position[]" multiple="multiple" size="5">
        <#list position as position>
            <option value="${position.post}">${position.post}</option>
        </#list>
    </select><br>
    Дата отсутствия
    <input type="date" name="absenceDate" placeholder="Дата отсутствия"><br>
    Время отсутствия
    <input type="text" name="absenceTime" placeholder="Время отсутствия"><br>
    Причина отсутствия
    <input type="text" name="absenceReason" placeholder="Причина отсутствия"><br>
    <button type="submit">Добавить</button>
</form>



</body>
</html>