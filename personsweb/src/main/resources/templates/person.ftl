<#import "/_master.ftl" as master>
<@master.template>

<body>
<h1>${person.name}</h1>
<p>Hitpoints: ${person.healthPointsCurrent}/${person.healthPointsMax}</p>
<p>Experience: ${person.experiencePoints}</p>
<p>Ready to fight: ${person.readyToFight?c}</p>
<p>Alive: ${person.alive?c}</p>
<h3>Abilities:</h3>
<ul>
    <li>
        <p>${person.abilities[0].name} (${person.abilities[0].actionDescription})</p>
    </li>
    <li>
        <p>${person.abilities[1].name} (${person.abilities[1].actionDescription})</p>
    </li>
    <li>
        <p>${person.abilities[2].name} (${person.abilities[2].actionDescription})</p>
    </li>
</ul>
<a href="/persons">Back to overview</a>
</@master.template>