@file:Generated(value = ["Generated based on CDK v2.80.0"])

package com.faendir.awscdkkt.services.codeguruprofiler

import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.codeguruprofiler.CfnProfilingGroup
import software.amazon.awscdk.services.codeguruprofiler.CfnProfilingGroupProps
import software.constructs.Construct

public fun Construct.cfnProfilingGroup(
  id: String,
  props: CfnProfilingGroupProps,
  initializer: CfnProfilingGroup.() -> Unit = {},
): CfnProfilingGroup = CfnProfilingGroup(this, id, props).apply(initializer)
