package com.faendir.awscdkkt.services.codeguruprofiler

import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.codeguruprofiler.CfnProfilingGroup
import software.amazon.awscdk.services.codeguruprofiler.CfnProfilingGroupProps
import software.constructs.Construct

@Generated
public fun Construct.cfnProfilingGroup(
  id: String,
  props: CfnProfilingGroupProps,
  initializer: CfnProfilingGroup.() -> Unit = {},
): CfnProfilingGroup = CfnProfilingGroup(this, id, props).apply(initializer)
