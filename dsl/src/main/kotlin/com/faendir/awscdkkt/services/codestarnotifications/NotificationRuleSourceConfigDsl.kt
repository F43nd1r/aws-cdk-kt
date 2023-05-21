package com.faendir.awscdkkt.services.codestarnotifications

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.codestarnotifications.NotificationRuleSourceConfig

@Generated
public fun notificationRuleSourceConfig(initializer: NotificationRuleSourceConfig.Builder.() -> Unit
    = {}): NotificationRuleSourceConfig =
    NotificationRuleSourceConfig.builder().apply(initializer).build()
