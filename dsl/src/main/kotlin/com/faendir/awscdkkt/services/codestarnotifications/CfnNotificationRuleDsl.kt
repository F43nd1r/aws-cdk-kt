@file:Generated(value = ["Generated 2023-05-20 based on CDK 2.79.1"])

package com.faendir.awscdkkt.services.codestarnotifications

import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.codestarnotifications.CfnNotificationRule
import software.amazon.awscdk.services.codestarnotifications.CfnNotificationRuleProps
import software.constructs.Construct

public fun Construct.cfnNotificationRule(
  id: String,
  props: CfnNotificationRuleProps,
  initializer: CfnNotificationRule.() -> Unit = {},
): CfnNotificationRule = CfnNotificationRule(this, id, props).apply(initializer)
