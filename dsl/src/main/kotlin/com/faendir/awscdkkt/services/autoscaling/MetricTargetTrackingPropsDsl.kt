package com.faendir.awscdkkt.services.autoscaling

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.autoscaling.MetricTargetTrackingProps

@Generated
public fun metricTargetTrackingProps(initializer: MetricTargetTrackingProps.Builder.() -> Unit =
    {}): MetricTargetTrackingProps = MetricTargetTrackingProps.builder().apply(initializer).build()
