package com.faendir.awscdkkt.services.applicationautoscaling

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.applicationautoscaling.ScalableTargetProps

@Generated
public fun scalableTargetProps(initializer: ScalableTargetProps.Builder.() -> Unit = {}):
    ScalableTargetProps = ScalableTargetProps.builder().apply(initializer).build()
