package com.faendir.awscdkkt.generated.services.cloudfront

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.cloudfront.CfnMonitoringSubscription
import software.amazon.awscdk.services.cloudfront.CfnMonitoringSubscriptionProps
import software.constructs.Construct

@Generated
public fun Construct.cfnMonitoringSubscription(
  id: String,
  props: CfnMonitoringSubscriptionProps,
  initializer: @AwsCdkDsl CfnMonitoringSubscription.() -> Unit = {},
): CfnMonitoringSubscription = CfnMonitoringSubscription(this, id, props).apply(initializer)

@Generated
public fun Construct.buildCfnMonitoringSubscription(id: String, initializer: @AwsCdkDsl
    CfnMonitoringSubscription.Builder.() -> Unit = {}): CfnMonitoringSubscription =
    CfnMonitoringSubscription.Builder.create(this, id).apply(initializer).build()
