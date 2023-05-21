package com.faendir.awscdkkt.services.elasticloadbalancingv2

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.elasticloadbalancingv2.WeightedTargetGroup

@Generated
public fun weightedTargetGroup(initializer: WeightedTargetGroup.Builder.() -> Unit = {}):
    WeightedTargetGroup = WeightedTargetGroup.builder().apply(initializer).build()
