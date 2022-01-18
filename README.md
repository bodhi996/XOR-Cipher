# XOR-Cipher

## Domain 
The following project has been made in Java, using some core concepts of Cryptography. This is the implementation of the famous XOR cupher or the one touch pad.

## Idea

We are taking a plain text image bringing out the RGB from it and using the XOR function to encrypt it into something totally different. This method is the very popular One-time Pad XOR cipher.
Notice that the plaintext only shines through 50% of the time, which results in noise as each pixel is equally likely to be 0 or 1.
This image contains no information about the original image. If we didn’t provide the shift sequence it would be impossible for you to reverse it back to the original image. You could try every possible sequence, but that would result in every possible image! How could you know it was the original? It's equally likely to be a picture of you or anything else you can think of.

## Description of the codebase
 
<pre> <img src="Encrypt.jpg" width="250" height="250">    <img src="Out.jpg" width="250" height="250"> </pre>

The code is well arranged into sub-directories which are -
1. The first page is the ```initial``` image which we are intersted in Encrypting.
2. The second image is the ```Encrypted``` image, which is mathematically impossible to decrypt. 

# How to Run

1. Make sure VS Code is installed in your system.
2. Fork this repository.
3. Clone the forked repository:
~~~
git clone https://github.com/<your github username>/XOR-Cipher
~~~
4. Add a remote to the upstream repository:
~~~
# typing the command below should show you only 1 remote named origin with the URL of your forked repository
git remote -v
# adding a remote for the upstream repository
git remote add upstream https://github.com/bodhi996/XOR-Cipher.github
~~~
5. Run the application.
6. Create a new issue if you face any difficulties (after browsing through StackOverflow on your own) and someone will help you 😁
