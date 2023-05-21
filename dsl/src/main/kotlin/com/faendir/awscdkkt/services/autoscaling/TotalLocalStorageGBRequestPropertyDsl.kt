package com.faendir.awscdkkt.services.autoscaling

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.autoscaling.CfnAutoScalingGroup

@Generated
public
    fun totalLocalStorageGBRequestProperty(initializer: CfnAutoScalingGroup.TotalLocalStorageGBRequestProperty.Builder.() -> Unit
    = {}): CfnAutoScalingGroup.TotalLocalStorageGBRequestProperty =
    CfnAutoScalingGroup.TotalLocalStorageGBRequestProperty.builder().apply(initializer).build()
