package com.faendir.awscdkkt.services.elasticloadbalancingv2

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.elasticloadbalancingv2.CfnTargetGroup

@Generated
public fun matcherProperty(initializer: CfnTargetGroup.MatcherProperty.Builder.() -> Unit = {}):
    CfnTargetGroup.MatcherProperty =
    CfnTargetGroup.MatcherProperty.builder().apply(initializer).build()
