package com.faendir.awscdkkt.services.codestarnotifications

import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.codestarnotifications.CfnNotificationRule
import software.amazon.awscdk.services.codestarnotifications.CfnNotificationRuleProps
import software.constructs.Construct

@Generated
public fun Construct.cfnNotificationRule(
  id: String,
  props: CfnNotificationRuleProps,
  initializer: CfnNotificationRule.() -> Unit = {},
): CfnNotificationRule = CfnNotificationRule(this, id, props).apply(initializer)
