# Event System #
The event system in Text Quest is Scenario based. Scenario is a term coined in the code describing encounters (Quests) and various dialogues and depending on how large the Scenario is it could very well have its own class. The Smaller Scenarios are handled directly through the Scenario Handler Class which is a large Switch Statement. Each Scenario is identified in the code with a unique and numeric Scenario ID.
**At the current time, I am still working on the Scenarios associated with the Scenario ID System, so there is only one Scenario ID that has been permanently assigned.**
|Scenario ID|Scenario Name| |
|:----------|:------------|:|
|0          |Tutorial     | |



&lt;hr /&gt;


## Random Scenario's ##
A Random Scenario is a Scenario that occurs at random, the system I am going to implement will select a random Scenario from the Random Scenario's list and if the player meets certain requirements (such as level) then the player will be asked to participate in a certain thing from a random unknown npc through a dialouge. The player can then choose to accept the challenge or not, but don't fret, if you refuse the scenario at first there is a chance you will get the opportunity again. Scenario Completion is a simple boolean, if you refuse the challenge the boolean will be set to False, and will be available again when random scenario selection is called again.



&lt;hr /&gt;


## Main Line/Side Lines ##
Scenario importance is determined by the story, the main storyline in text quest regards the king of Taften's strange death. However the main storyline has various other side lines too, this allows the player to get off track of the main story line and allow them to gather power and strength through the various minor story lines. For instance, the Keln story line, is the only possible chance to get the matierials and the knowledge to craft Dragonnite Armor.