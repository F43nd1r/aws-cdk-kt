package com.faendir.awscdkkt.services.codestarnotifications

import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.codestarnotifications.NotificationRule
import software.amazon.awscdk.services.codestarnotifications.NotificationRuleProps
import software.constructs.Construct

@Generated
public fun Construct.notificationRule(
  id: String,
  props: NotificationRuleProps,
  initializer: NotificationRule.() -> Unit = {},
): NotificationRule = NotificationRule(this, id, props).apply(initializer)
