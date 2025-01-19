<#import "/_master.ftl" as master>
<@master.template>

    <h1>Create new hero</h1>
    <form method="post" action="/persons/create">
        <label>Name:</label>
        <input type="text" name="personName"/>

        <h2>Persons:</h2>
        <ol>
            <li>
                <label>Name:</label>
                <input type="text" name="ability1Name">
                <label>Description:</label>
                <input type="text" name="ability1Description">
            </li>
            <li>
                <label>Name:</label>
                <input type="text" name="ability2Name">
                <label>Description:</label>
                <input type="text" name="ability2Description">
            </li>
            <li>
                <label>Name:</label>
                <input type="text" name="ability3Name">
                <label>Description:</label>
                <input type="text" name="ability3Description">
            </li>
        </ol>

        <button type="submit">Create</button>
    </form>

</@master.template>