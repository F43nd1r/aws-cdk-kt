package com.faendir.awscdkkt.generated.services.applicationautoscaling

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.applicationautoscaling.CfnScalingPolicy

@Generated
public fun buildTargetTrackingMetricDimensionProperty(initializer: @AwsCdkDsl
    CfnScalingPolicy.TargetTrackingMetricDimensionProperty.Builder.() -> Unit = {}):
    CfnScalingPolicy.TargetTrackingMetricDimensionProperty =
    CfnScalingPolicy.TargetTrackingMetricDimensionProperty.Builder().apply(initializer).build()
