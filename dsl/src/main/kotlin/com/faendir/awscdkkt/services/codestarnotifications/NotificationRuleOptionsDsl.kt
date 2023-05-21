package com.faendir.awscdkkt.services.codestarnotifications

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.codestarnotifications.NotificationRuleOptions

@Generated
public fun notificationRuleOptions(initializer: NotificationRuleOptions.Builder.() -> Unit = {}):
    NotificationRuleOptions = NotificationRuleOptions.builder().apply(initializer).build()
