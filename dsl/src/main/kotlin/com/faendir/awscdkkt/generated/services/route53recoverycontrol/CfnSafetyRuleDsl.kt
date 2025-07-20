package com.faendir.awscdkkt.generated.services.route53recoverycontrol

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.route53recoverycontrol.CfnSafetyRule
import software.amazon.awscdk.services.route53recoverycontrol.CfnSafetyRuleProps
import software.constructs.Construct

@Generated
public fun Construct.cfnSafetyRule(
  id: String,
  props: CfnSafetyRuleProps,
  initializer: @AwsCdkDsl CfnSafetyRule.() -> Unit = {},
): CfnSafetyRule = CfnSafetyRule(this, id, props).apply(initializer)

@Generated
public fun Construct.buildCfnSafetyRule(id: String, initializer: @AwsCdkDsl CfnSafetyRule.Builder.() -> Unit = {}): CfnSafetyRule = CfnSafetyRule.Builder.create(this, id).apply(initializer).build()
