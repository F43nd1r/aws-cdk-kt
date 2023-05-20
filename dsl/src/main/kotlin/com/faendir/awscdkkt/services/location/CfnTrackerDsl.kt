@file:Generated(value = ["Generated based on CDK v2.80.0"])

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
