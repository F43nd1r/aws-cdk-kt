package com.faendir.awscdkkt.generated.services.codestarnotifications

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.codestarnotifications.CfnNotificationRule
import software.amazon.awscdk.services.codestarnotifications.CfnNotificationRuleProps
import software.constructs.Construct

@Generated
public fun Construct.cfnNotificationRule(id: String, props: CfnNotificationRuleProps):
    CfnNotificationRule = CfnNotificationRule(this, id, props)

@Generated
public fun Construct.cfnNotificationRule(
  id: String,
  props: CfnNotificationRuleProps,
  initializer: @AwsCdkDsl CfnNotificationRule.() -> Unit,
): CfnNotificationRule = CfnNotificationRule(this, id, props).apply(initializer)

@Generated
public fun Construct.buildCfnNotificationRule(id: String, initializer: @AwsCdkDsl
    CfnNotificationRule.Builder.() -> Unit): CfnNotificationRule =
    CfnNotificationRule.Builder.create(this, id).apply(initializer).build()
