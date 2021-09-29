# JavaFX_ScrollPaneContentBlurIssue
Some tests to investigate and try to resolve an issue where deeper layered content within a scrollpane results in increasingly blurry text, buttons, etc.

## Issue behaviour
If content is dynamically created and embedded within a series of scrollpanes, each layer becomes blurrier and blurrier. 

For example, I created a test scenario (Test 04) where a ScrollPane wraps around a BorderPane that has a VBox at its center. 

A button creates a new instance of this same view inside the VBox. 

If you keep creating layers within layers using this view, they keep getting blurrier. 

This gif illustrates the issue:

![](https://github.com/KapFlagon/JavaFX_ScrollPaneContentBlurIssue/blob/main/images/BlurIssue.gif)



## Issue fix
This is a gif illustrating the aplication of a fix for the behaviour:

![](https://github.com/KapFlagon/JavaFX_ScrollPaneContentBlurIssue/blob/main/images/IssueFixed.gif)
