package com.faendir.awscdkkt.services.ec2

import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.ec2.CfnNetworkPerformanceMetricSubscription
import software.amazon.awscdk.services.ec2.CfnNetworkPerformanceMetricSubscriptionProps
import software.constructs.Construct

@Generated
public fun Construct.cfnNetworkPerformanceMetricSubscription(
  id: String,
  props: CfnNetworkPerformanceMetricSubscriptionProps,
  initializer: CfnNetworkPerformanceMetricSubscription.() -> Unit = {},
): CfnNetworkPerformanceMetricSubscription = CfnNetworkPerformanceMetricSubscription(this, id,
    props).apply(initializer)
