package com.faendir.awscdkkt.generated.services.autoscaling

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.autoscaling.CfnScalingPolicy

@Generated
public fun buildTargetTrackingMetricStatProperty(initializer: @AwsCdkDsl
    CfnScalingPolicy.TargetTrackingMetricStatProperty.Builder.() -> Unit = {}):
    CfnScalingPolicy.TargetTrackingMetricStatProperty =
    CfnScalingPolicy.TargetTrackingMetricStatProperty.Builder().apply(initializer).build()
