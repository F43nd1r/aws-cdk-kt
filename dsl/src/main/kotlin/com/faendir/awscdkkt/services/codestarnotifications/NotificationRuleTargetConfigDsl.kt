package com.faendir.awscdkkt.services.codestarnotifications

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.codestarnotifications.NotificationRuleTargetConfig

@Generated
public fun notificationRuleTargetConfig(initializer: NotificationRuleTargetConfig.Builder.() -> Unit
    = {}): NotificationRuleTargetConfig =
    NotificationRuleTargetConfig.builder().apply(initializer).build()
