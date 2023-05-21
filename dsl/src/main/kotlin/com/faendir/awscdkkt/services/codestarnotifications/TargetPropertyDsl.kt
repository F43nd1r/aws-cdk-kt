package com.faendir.awscdkkt.services.codestarnotifications

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.codestarnotifications.CfnNotificationRule

@Generated
public fun targetProperty(initializer: CfnNotificationRule.TargetProperty.Builder.() -> Unit = {}):
    CfnNotificationRule.TargetProperty =
    CfnNotificationRule.TargetProperty.builder().apply(initializer).build()
