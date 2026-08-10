package com.faendir.awscdkkt.generated.services.bedrock

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.bedrock.CfnModelInvocationJob
import software.amazon.awscdk.services.bedrock.CfnModelInvocationJobProps
import software.constructs.Construct

@Generated
public fun Construct.cfnModelInvocationJob(id: String, initializer: @AwsCdkDsl CfnModelInvocationJob.() -> Unit = {}): CfnModelInvocationJob = CfnModelInvocationJob(this, id).apply(initializer)

@Generated
public fun Construct.cfnModelInvocationJob(
  id: String,
  props: CfnModelInvocationJobProps,
  initializer: @AwsCdkDsl CfnModelInvocationJob.() -> Unit = {},
): CfnModelInvocationJob = CfnModelInvocationJob(this, id, props).apply(initializer)

@Generated
public fun Construct.buildCfnModelInvocationJob(id: String, initializer: @AwsCdkDsl CfnModelInvocationJob.Builder.() -> Unit = {}): CfnModelInvocationJob = CfnModelInvocationJob.Builder.create(this, id).apply(initializer).build()
