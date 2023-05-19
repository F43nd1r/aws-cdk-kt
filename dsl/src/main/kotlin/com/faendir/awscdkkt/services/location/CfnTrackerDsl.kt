@file:Generated(value = ["Generated 2023-05-19 based on CDK 2.79.1"])

package com.faendir.awscdkkt.services.location

import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.location.CfnTracker
import software.amazon.awscdk.services.location.CfnTrackerProps
import software.constructs.Construct

public fun Construct.cfnTracker(
  id: String,
  props: CfnTrackerProps,
  initializer: CfnTracker.() -> Unit = {},
): CfnTracker = CfnTracker(this, id, props).apply(initializer)
