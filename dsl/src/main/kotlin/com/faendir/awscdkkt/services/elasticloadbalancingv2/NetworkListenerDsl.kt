package com.faendir.awscdkkt.services.elasticloadbalancingv2

import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.elasticloadbalancingv2.NetworkListener
import software.amazon.awscdk.services.elasticloadbalancingv2.NetworkListenerProps
import software.constructs.Construct

@Generated
public fun Construct.networkListener(
  id: String,
  props: NetworkListenerProps,
  initializer: NetworkListener.() -> Unit = {},
): NetworkListener = NetworkListener(this, id, props).apply(initializer)
