package com.faendir.awscdkkt.services.elasticloadbalancingv2

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.elasticloadbalancingv2.TargetGroupAttributes

@Generated
public fun targetGroupAttributes(initializer: TargetGroupAttributes.Builder.() -> Unit = {}):
    TargetGroupAttributes = TargetGroupAttributes.builder().apply(initializer).build()
