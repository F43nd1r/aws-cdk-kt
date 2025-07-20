package com.faendir.awscdkkt.generated.services.notifications

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.notifications.CfnEventRule
import software.amazon.awscdk.services.notifications.CfnEventRuleProps
import software.constructs.Construct

@Generated
public fun Construct.cfnEventRule(
  id: String,
  props: CfnEventRuleProps,
  initializer: @AwsCdkDsl CfnEventRule.() -> Unit = {},
): CfnEventRule = CfnEventRule(this, id, props).apply(initializer)

@Generated
public fun Construct.buildCfnEventRule(id: String, initializer: @AwsCdkDsl CfnEventRule.Builder.() -> Unit = {}): CfnEventRule = CfnEventRule.Builder.create(this, id).apply(initializer).build()
