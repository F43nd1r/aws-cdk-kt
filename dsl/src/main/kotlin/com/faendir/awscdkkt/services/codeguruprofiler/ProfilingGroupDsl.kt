package com.faendir.awscdkkt.services.codeguruprofiler

import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.codeguruprofiler.ProfilingGroup
import software.amazon.awscdk.services.codeguruprofiler.ProfilingGroupProps
import software.constructs.Construct

@Generated
public fun Construct.profilingGroup(id: String, initializer: ProfilingGroup.() -> Unit = {}):
    ProfilingGroup = ProfilingGroup(this, id).apply(initializer)

@Generated
public fun Construct.profilingGroup(
  id: String,
  props: ProfilingGroupProps,
  initializer: ProfilingGroup.() -> Unit = {},
): ProfilingGroup = ProfilingGroup(this, id, props).apply(initializer)
