package com.faendir.awscdkkt.services.elasticloadbalancingv2

import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.elasticloadbalancingv2.CfnListener
import software.amazon.awscdk.services.elasticloadbalancingv2.CfnListenerProps
import software.constructs.Construct

@Generated
public fun Construct.cfnListener(
  id: String,
  props: CfnListenerProps,
  initializer: CfnListener.() -> Unit = {},
): CfnListener = CfnListener(this, id, props).apply(initializer)
