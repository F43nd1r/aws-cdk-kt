package com.faendir.awscdkkt.services.cloudfront

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
  initializer: CfnMonitoringSubscription.() -> Unit = {},
): CfnMonitoringSubscription = CfnMonitoringSubscription(this, id, props).apply(initializer)
