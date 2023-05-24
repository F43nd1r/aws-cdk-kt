package com.faendir.awscdkkt.generated.services.codeguruprofiler

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.codeguruprofiler.ProfilingGroup
import software.amazon.awscdk.services.codeguruprofiler.ProfilingGroupProps
import software.constructs.Construct

@Generated
public fun Construct.profilingGroup(id: String, props: ProfilingGroupProps): ProfilingGroup =
    ProfilingGroup(this, id, props)

@Generated
public fun Construct.profilingGroup(
  id: String,
  props: ProfilingGroupProps,
  initializer: @AwsCdkDsl ProfilingGroup.() -> Unit,
): ProfilingGroup = ProfilingGroup(this, id, props).apply(initializer)

@Generated
public fun Construct.profilingGroup(id: String): ProfilingGroup = ProfilingGroup(this, id)

@Generated
public fun Construct.profilingGroup(id: String, initializer: @AwsCdkDsl ProfilingGroup.() -> Unit):
    ProfilingGroup = ProfilingGroup(this, id).apply(initializer)

@Generated
public fun Construct.buildProfilingGroup(id: String, initializer: @AwsCdkDsl
    ProfilingGroup.Builder.() -> Unit): ProfilingGroup = ProfilingGroup.Builder.create(this,
    id).apply(initializer).build()
