@file:Generated(value = ["Generated based on CDK v2.80.0"])

package com.faendir.awscdkkt.services.cloudfront

import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.cloudfront.CfnMonitoringSubscription
import software.amazon.awscdk.services.cloudfront.CfnMonitoringSubscriptionProps
import software.constructs.Construct

public fun Construct.cfnMonitoringSubscription(
  id: String,
  props: CfnMonitoringSubscriptionProps,
  initializer: CfnMonitoringSubscription.() -> Unit = {},
): CfnMonitoringSubscription = CfnMonitoringSubscription(this, id, props).apply(initializer)
