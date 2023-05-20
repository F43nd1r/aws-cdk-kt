@file:Generated(value = ["Generated 2023-05-20 based on CDK 2.79.1"])

package com.faendir.awscdkkt.services.elasticloadbalancingv2

import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.elasticloadbalancingv2.NetworkListener
import software.amazon.awscdk.services.elasticloadbalancingv2.NetworkListenerProps
import software.constructs.Construct

public fun Construct.networkListener(
  id: String,
  props: NetworkListenerProps,
  initializer: NetworkListener.() -> Unit = {},
): NetworkListener = NetworkListener(this, id, props).apply(initializer)
