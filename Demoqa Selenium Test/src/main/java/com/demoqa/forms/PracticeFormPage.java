package com.demoqa.forms;

import static utilities.JavaScriptUtility.*;

import org.openqa.selenium.By;

public class PracticeFormPage extends FormsPage {
  private By femaleRadioButton = By.id("gender-radio-2");
  private By sportsHobbyCheckbox = By.id("hobbies-checkbox-1");
  private By readingHobbyCheckbox = By.id("hobbies-checkbox-2");
  private By musicHobbyCheckbox = By.id("hobbies-checkbox-3");

  public void clickFemaleRadioButton() {
    scrollToElementJS(femaleRadioButton);
    clickJS(femaleRadioButton);
  }

  public boolean isFemaleSelected() {
    return find(femaleRadioButton).isSelected();
  }

  public void clickSportsHobbyCheckbox() {
    if (!find(sportsHobbyCheckbox).isSelected()) {
      // when sports hobby checkbox is not selected then we'll scroll to the checkbox
      // and click it
      scrollToElementJS(sportsHobbyCheckbox);
      clickJS(sportsHobbyCheckbox);
    }
  }

  public void clickReadingHobbyCheckbox() {
    if (!find(readingHobbyCheckbox).isSelected()) {
      // when reading hobby checkbox is not selected then we'll scroll to the checkbox
      // and click it
      scrollToElementJS(readingHobbyCheckbox);
      clickJS(readingHobbyCheckbox);
    }
  }

  public void clickMusicHobbyCheckbox() {
    if (!find(musicHobbyCheckbox).isSelected()) {
      // when music hobby checkbox is not selected then we'll scroll to the checkbox
      // and click it
      scrollToElementJS(musicHobbyCheckbox);
      clickJS(musicHobbyCheckbox);
    }
  }

  public void unclickReadingHobbyCheckbox() {
    if (find(readingHobbyCheckbox).isSelected()) {
      // when reading hobby checkbox is selected then we'll scroll to the checkbox and
      // click it
      scrollToElementJS(readingHobbyCheckbox);
      clickJS(readingHobbyCheckbox);
    }
  }

  // method to verify reading checkbox not selected

  public boolean isReadingSelected() {
    return find(readingHobbyCheckbox).isSelected();

  }

}
