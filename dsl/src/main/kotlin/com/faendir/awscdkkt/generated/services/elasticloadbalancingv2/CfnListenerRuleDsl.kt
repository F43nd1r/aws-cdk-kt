package com.faendir.awscdkkt.generated.services.elasticloadbalancingv2

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.elasticloadbalancingv2.CfnListenerRule
import software.amazon.awscdk.services.elasticloadbalancingv2.CfnListenerRuleProps
import software.constructs.Construct

@Generated
public fun Construct.cfnListenerRule(id: String, props: CfnListenerRuleProps): CfnListenerRule =
    CfnListenerRule(this, id, props)

@Generated
public fun Construct.cfnListenerRule(
  id: String,
  props: CfnListenerRuleProps,
  initializer: @AwsCdkDsl CfnListenerRule.() -> Unit,
): CfnListenerRule = CfnListenerRule(this, id, props).apply(initializer)

@Generated
public fun Construct.buildCfnListenerRule(id: String, initializer: @AwsCdkDsl
    CfnListenerRule.Builder.() -> Unit): CfnListenerRule = CfnListenerRule.Builder.create(this,
    id).apply(initializer).build()
