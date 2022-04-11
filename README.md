# Friend Maker-Inator
Bot that converses with the user

Our agent receives an input from the user via our Discord messaging channel. The agent then uses a keyword system to generate an appropriate output message. The output message is then sent to the user via the Discord channel.

# Assignment 3 - Features
1. Switch statement keyword system: Our agent uses a keyword system to generate the appropriate output to send to the user. The keyword system is fitted with multiple topics, greetings, small-talk phrases, and reactions that can be used in the agent's output. We have even implemented some randomization when it comes to the agent's response, so that the conversation can always be unique.

2. SpellChecker method: This method will correct any spelling mistakes made in the message sent by the user. The agent will then respond to the correctly spelled sentence. If the message sent by the user is very misspelled, the agent will notify the user that it does not understand.

3. Parts of speech tagging Method: This method can identify the type of words used in the message sent by the user. Depending on the nouns used in the sentence the agent will respond with a more engaged output. This can make conversations more interesting and shows that the agent is trying to keep the conversation flowing.

POS Tagging setup: Java build path libraries need the required jar files added to the Classpath. Jar files are located in the lib folder from the top link: https://www.apache.org/dyn/closer.cgi/opennlp/opennlp-1.9.4/apache-opennlp-1.9.4-bin.zip

Required model for POS Tagging: Download opennlp-en-ud-ewt-pos-1.0-1.9.3.bin from: https://opennlp.apache.org/models.html

4. NameFinder method: This method can identify names in a message sent by the user. The agent will respond addressing the given name instead of outputting a generic sentence. This makes the conversation more natural and shows that the agent is "listening" to the user.

NameFinder setup: Java build path libraries need the required jar files added to the Classpath. Jar files are located in the lib folder from the top link: https://www.apache.org/dyn/closer.cgi/opennlp/opennlp-1.9.4/apache-opennlp-1.9.4-bin.zip

Required model for NameFinder: Download en-ner-person.bin from: http://opennlp.sourceforge.net/models-1.5/

# Individual Assignment - API Features
1. Google translate method: This method can take a phrase provided by the user and translate it to either french, german, or danish. The agent returns the translated phrase. Command:
    !translate [language], [phrase]

2. Twitter method: This method can take a username provided by the user and display the latest status posted by them. The agent returns the desired user's status as text. Command:
    !twitter [username]
    
# Demo Conversations
SpellChecker: The agent is able to understand the message sent by the user even if there are spelling mistakes. This is because the agent will correct misspelled words and respond to the corrected message.

<img width="379" src="https://user-images.githubusercontent.com/99511208/158907737-041d5b43-4343-4702-9971-794c2746d81e.png">

POS Tagging: The agent is able to identify the specific item that the user is talking about and delivers an involved response.

<img width="379" src="https://user-images.githubusercontent.com/99511208/158702513-d25860e9-c6ce-43cc-9182-b5afecd0345b.png">

NameFinder: The agent is able to identify names within a message and generate an output that incorporates the name that was identified.

<img width = "379" src="https://user-images.githubusercontent.com/99511208/158907144-532fd37c-f032-4f58-9654-a0eb9511e57c.png">

