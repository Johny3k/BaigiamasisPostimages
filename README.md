# Final work project
### Site used for testing
[postimage.org](https://postimages.org/)
### Packages used
- TestNG `org.testng:testng`
- Selenium `org.seleniumhq.selenium:selenium-java`
- WebDriverManager `io.github.bonigarcia:webdrivermanager`

## Test Scenarios:
### 1. Login
#### Login with existing information
- Open page `https://postimages.org/`
- Click button `Log in`
- Enter existing email address into field *"E-mail or username:"*: ***jonuimileriui@gmail.com***
- Enter existing password into field *"Password"*: ***RjXzkC6tSLpS***
- Click button `Log in`

Expected result: Logged into account successfully.

### 2. Upload Image
#### Upload image from root directory
- Open page `https://postimages.org/`
- Click button `Log in`
- Enter existing email address into field *"E-mail or username:"*: ***jonuimileriui@gmail.com***
- Enter existing password into field *"Password"*: ***RjXzkC6tSLpS***
- Click button `Log in`
- Click button `Choose images`
- Click button `Select image: Image.jpg from root directory`
- Click button `Open`
- Click button `My images`
- Click gallery button `default`
- Check if the image has been uploaded

Expected result: Image successfully uploaded.

### 3. Upload image
#### Upload image by URL
- Open page `https://postimages.org/`
- Click button `Log in`
- Enter existing email address into field *"E-mail or username:"*: ***jonuimileriui@gmail.com***
- Enter existing password into field *"Password"*: ***RjXzkC6tSLpS***
- Click button `Log in`
- Click button `Upload by URL`
- Input URL: [Image URL](https://contentstatic.techgig.com/photo/93000110/what-makes-java-still-popular-among-developers.jpg?28608)
- Click button `Upload`
- Click button `My images`
- Click gallery button `default`
- Check if the image has been uploaded

Expected result: Image successfully uploaded.

### 4. Delete Images
#### Delete both previously uploaded images

##### *Part 1 - Check if both images have been uploaded:*
- Open page `https://postimages.org/`
- Click button `Log in`
- Enter existing email address into field *"E-mail or username:"*: ***jonuimileriui@gmail.com***
- Enter existing password into field *"Password"*: ***RjXzkC6tSLpS***
- Click button `Log in`
- Click button `My images`
- Click gallery button `default`
- Check if both images had been uploaded

Expected result: Both images have been uploaded.

##### *Part 2 - Delete images*
- Open page `https://postimages.org/`
- Click button `Log in`
- Enter existing email address into field *"E-mail or username:"*: ***jonuimileriui@gmail.com***
- Enter existing password into field *"Password"*: ***RjXzkC6tSLpS***
- Click button `Log in`
- Click button `My images`
- Click gallery button `default`
- Click the image you want to be deleted
- Click button `Remove`
- Click `Ok` in alert box
- Click the other image that you want to delete
- Click button `Remove`
- Click `Ok` in alert box
- Click button `My images`
- Check if `default` gallery says `empty`

Expected result: The gallery is empty and both the images have been deleted

### 5. Logout
#### Logout by using existing information
- Open page `https://postimages.org/`
- Click button `Log in`
- Enter existing email address into field *"E-mail or username:"*: ***jonuimileriui@gmail.com***
- Enter existing password into field *"Password"*: ***RjXzkC6tSLpS***
- Click button `Log in`
- Click button `Log out`
- Check if your email is no longer visible in the top right corner

Expected result: Logged out successfully.