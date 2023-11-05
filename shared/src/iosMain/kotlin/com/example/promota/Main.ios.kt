package com.example.promota

import androidx.compose.ui.window.ComposeUIViewController
import platform.Foundation.NSUUID.Companion.UUID
import platform.UserNotifications.UNMutableNotificationContent
import platform.UserNotifications.UNNotificationPresentationOptionAlert
import platform.UserNotifications.UNNotificationPresentationOptionSound
import platform.UserNotifications.UNNotificationRequest.Companion.requestWithIdentifier
import platform.UserNotifications.UNNotificationSound
import platform.UserNotifications.UNTimeIntervalNotificationTrigger
import platform.UserNotifications.UNUserNotificationCenter

fun MainViewController() = ComposeUIViewController { App() }

actual fun userNotificationCenter(
) {
    UNUserNotificationCenter.currentNotificationCenter()
        .requestAuthorizationWithOptions(
            options = (UNNotificationPresentationOptionAlert + UNNotificationPresentationOptionSound)
        ) { success, error ->
            if (success) {
                    val content = UNMutableNotificationContent()
                    content.setTitle("ashraf")
                    content.setSubtitle("It looks hungry")
                    content.setSound(UNNotificationSound.defaultSound())

                var trigger = UNTimeIntervalNotificationTrigger.triggerWithTimeInterval(timeInterval = 60.0 ,repeats = true)
                    val request = requestWithIdentifier(
                        identifier = UUID().UUIDString,
                        content = content,
                        trigger = trigger
                    )
                    UNUserNotificationCenter.currentNotificationCenter()
                        .addNotificationRequest(request) { error2 ->
                            print("ashraf error " +error2)
                        }
                    print("Notification scheduled.")
            } else {
                error?.let { println(it.localizedDescription) }
                println("All set! ashraf   " + error?.localizedDescription)

            }
        }
}