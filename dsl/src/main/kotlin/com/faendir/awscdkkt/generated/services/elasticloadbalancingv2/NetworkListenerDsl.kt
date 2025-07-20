package com.faendir.awscdkkt.generated.services.elasticloadbalancingv2

import com.faendir.awscdkkt.AwsCdkDsl
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
  initializer: @AwsCdkDsl NetworkListener.() -> Unit = {},
): NetworkListener = NetworkListener(this, id, props).apply(initializer)

@Generated
public fun Construct.buildNetworkListener(id: String, initializer: @AwsCdkDsl NetworkListener.Builder.() -> Unit = {}): NetworkListener = NetworkListener.Builder.create(this, id).apply(initializer).build()
