package com.faendir.awscdkkt.services.vpclattice

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.vpclattice.CfnTargetGroup

@Generated
public fun matcherProperty(initializer: CfnTargetGroup.MatcherProperty.Builder.() -> Unit = {}):
    CfnTargetGroup.MatcherProperty =
    CfnTargetGroup.MatcherProperty.builder().apply(initializer).build()
