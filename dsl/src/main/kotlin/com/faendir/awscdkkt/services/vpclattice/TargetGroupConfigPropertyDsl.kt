package com.faendir.awscdkkt.services.vpclattice

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.vpclattice.CfnTargetGroup

@Generated
public
    fun targetGroupConfigProperty(initializer: CfnTargetGroup.TargetGroupConfigProperty.Builder.() -> Unit
    = {}): CfnTargetGroup.TargetGroupConfigProperty =
    CfnTargetGroup.TargetGroupConfigProperty.builder().apply(initializer).build()
