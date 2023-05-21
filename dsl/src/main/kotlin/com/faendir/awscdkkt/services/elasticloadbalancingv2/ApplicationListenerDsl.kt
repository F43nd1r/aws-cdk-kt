package com.faendir.awscdkkt.services.elasticloadbalancingv2

import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.elasticloadbalancingv2.ApplicationListener
import software.amazon.awscdk.services.elasticloadbalancingv2.ApplicationListenerProps
import software.constructs.Construct

@Generated
public fun Construct.applicationListener(
  id: String,
  props: ApplicationListenerProps,
  initializer: ApplicationListener.() -> Unit = {},
): ApplicationListener = ApplicationListener(this, id, props).apply(initializer)
