@file:Generated(value = ["Generated 2023-05-19 based on CDK 2.79.1"])

package com.faendir.awscdkkt.services.codeguruprofiler

import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.codeguruprofiler.ProfilingGroup
import software.amazon.awscdk.services.codeguruprofiler.ProfilingGroupProps
import software.constructs.Construct

public fun Construct.profilingGroup(id: String, initializer: ProfilingGroup.() -> Unit = {}):
    ProfilingGroup = ProfilingGroup(this, id).apply(initializer)

public fun Construct.profilingGroup(
  id: String,
  props: ProfilingGroupProps,
  initializer: ProfilingGroup.() -> Unit = {},
): ProfilingGroup = ProfilingGroup(this, id, props).apply(initializer)
