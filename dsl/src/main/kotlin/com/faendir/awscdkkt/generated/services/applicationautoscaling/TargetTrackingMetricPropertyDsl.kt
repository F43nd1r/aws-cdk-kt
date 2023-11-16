package com.faendir.awscdkkt.generated.services.applicationautoscaling

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.applicationautoscaling.CfnScalingPolicy

@Generated
public fun buildTargetTrackingMetricProperty(initializer: @AwsCdkDsl
    CfnScalingPolicy.TargetTrackingMetricProperty.Builder.() -> Unit = {}):
    CfnScalingPolicy.TargetTrackingMetricProperty =
    CfnScalingPolicy.TargetTrackingMetricProperty.Builder().apply(initializer).build()
