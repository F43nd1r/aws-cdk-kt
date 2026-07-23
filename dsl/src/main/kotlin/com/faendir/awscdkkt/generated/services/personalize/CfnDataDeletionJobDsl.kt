package com.faendir.awscdkkt.generated.services.personalize

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.personalize.CfnDataDeletionJob
import software.amazon.awscdk.services.personalize.CfnDataDeletionJobProps
import software.constructs.Construct

@Generated
public fun Construct.cfnDataDeletionJob(id: String, initializer: @AwsCdkDsl CfnDataDeletionJob.() -> Unit = {}): CfnDataDeletionJob = CfnDataDeletionJob(this, id).apply(initializer)

@Generated
public fun Construct.cfnDataDeletionJob(
  id: String,
  props: CfnDataDeletionJobProps,
  initializer: @AwsCdkDsl CfnDataDeletionJob.() -> Unit = {},
): CfnDataDeletionJob = CfnDataDeletionJob(this, id, props).apply(initializer)

@Generated
public fun Construct.buildCfnDataDeletionJob(id: String, initializer: @AwsCdkDsl CfnDataDeletionJob.Builder.() -> Unit = {}): CfnDataDeletionJob = CfnDataDeletionJob.Builder.create(this, id).apply(initializer).build()
