@file:Generated(value = ["Generated 2023-05-19 based on CDK 2.79.1"])

package com.faendir.awscdkkt.services.codestarnotifications

import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.codestarnotifications.NotificationRule
import software.amazon.awscdk.services.codestarnotifications.NotificationRuleProps
import software.constructs.Construct

public fun Construct.notificationRule(
  id: String,
  props: NotificationRuleProps,
  initializer: NotificationRule.() -> Unit = {},
): NotificationRule = NotificationRule(this, id, props).apply(initializer)
