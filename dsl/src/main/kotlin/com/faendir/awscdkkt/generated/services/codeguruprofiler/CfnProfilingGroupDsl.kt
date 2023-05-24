package com.faendir.awscdkkt.generated.services.codeguruprofiler

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.codeguruprofiler.CfnProfilingGroup
import software.amazon.awscdk.services.codeguruprofiler.CfnProfilingGroupProps
import software.constructs.Construct

@Generated
public fun Construct.cfnProfilingGroup(id: String, props: CfnProfilingGroupProps): CfnProfilingGroup
    = CfnProfilingGroup(this, id, props)

@Generated
public fun Construct.cfnProfilingGroup(
  id: String,
  props: CfnProfilingGroupProps,
  initializer: @AwsCdkDsl CfnProfilingGroup.() -> Unit,
): CfnProfilingGroup = CfnProfilingGroup(this, id, props).apply(initializer)

@Generated
public fun Construct.buildCfnProfilingGroup(id: String, initializer: @AwsCdkDsl
    CfnProfilingGroup.Builder.() -> Unit): CfnProfilingGroup =
    CfnProfilingGroup.Builder.create(this, id).apply(initializer).build()
