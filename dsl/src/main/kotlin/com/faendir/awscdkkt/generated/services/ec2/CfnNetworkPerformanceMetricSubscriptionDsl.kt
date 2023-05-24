package com.faendir.awscdkkt.generated.services.ec2

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.ec2.CfnNetworkPerformanceMetricSubscription
import software.amazon.awscdk.services.ec2.CfnNetworkPerformanceMetricSubscriptionProps
import software.constructs.Construct

@Generated
public fun Construct.cfnNetworkPerformanceMetricSubscription(id: String,
    props: CfnNetworkPerformanceMetricSubscriptionProps): CfnNetworkPerformanceMetricSubscription =
    CfnNetworkPerformanceMetricSubscription(this, id, props)

@Generated
public fun Construct.cfnNetworkPerformanceMetricSubscription(
  id: String,
  props: CfnNetworkPerformanceMetricSubscriptionProps,
  initializer: @AwsCdkDsl CfnNetworkPerformanceMetricSubscription.() -> Unit,
): CfnNetworkPerformanceMetricSubscription = CfnNetworkPerformanceMetricSubscription(this, id,
    props).apply(initializer)

@Generated
public fun Construct.buildCfnNetworkPerformanceMetricSubscription(id: String,
    initializer: @AwsCdkDsl CfnNetworkPerformanceMetricSubscription.Builder.() -> Unit):
    CfnNetworkPerformanceMetricSubscription =
    CfnNetworkPerformanceMetricSubscription.Builder.create(this, id).apply(initializer).build()
