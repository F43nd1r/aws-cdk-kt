package com.faendir.awscdkkt.services.elasticloadbalancingv2

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.elasticloadbalancingv2.NetworkWeightedTargetGroup

@Generated
public fun networkWeightedTargetGroup(initializer: NetworkWeightedTargetGroup.Builder.() -> Unit =
    {}): NetworkWeightedTargetGroup =
    NetworkWeightedTargetGroup.builder().apply(initializer).build()
