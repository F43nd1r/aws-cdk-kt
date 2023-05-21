package com.faendir.awscdkkt.services.applicationautoscaling

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.applicationautoscaling.CfnScalableTarget

@Generated
public
    fun scalableTargetActionProperty(initializer: CfnScalableTarget.ScalableTargetActionProperty.Builder.() -> Unit
    = {}): CfnScalableTarget.ScalableTargetActionProperty =
    CfnScalableTarget.ScalableTargetActionProperty.builder().apply(initializer).build()
