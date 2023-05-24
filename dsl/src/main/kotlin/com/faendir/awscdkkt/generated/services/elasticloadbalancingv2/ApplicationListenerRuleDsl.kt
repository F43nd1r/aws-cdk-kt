package com.faendir.awscdkkt.generated.services.elasticloadbalancingv2

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.elasticloadbalancingv2.ApplicationListenerRule
import software.amazon.awscdk.services.elasticloadbalancingv2.ApplicationListenerRuleProps
import software.constructs.Construct

@Generated
public fun Construct.applicationListenerRule(id: String, props: ApplicationListenerRuleProps):
    ApplicationListenerRule = ApplicationListenerRule(this, id, props)

@Generated
public fun Construct.applicationListenerRule(
  id: String,
  props: ApplicationListenerRuleProps,
  initializer: @AwsCdkDsl ApplicationListenerRule.() -> Unit,
): ApplicationListenerRule = ApplicationListenerRule(this, id, props).apply(initializer)

@Generated
public fun Construct.buildApplicationListenerRule(id: String, initializer: @AwsCdkDsl
    ApplicationListenerRule.Builder.() -> Unit): ApplicationListenerRule =
    ApplicationListenerRule.Builder.create(this, id).apply(initializer).build()
