package com.faendir.awscdkkt.generated.services.stepfunctions.tasks

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.stepfunctions.tasks.BatchSubmitJob
import software.amazon.awscdk.services.stepfunctions.tasks.BatchSubmitJobProps
import software.constructs.Construct

@Generated
public fun Construct.batchSubmitJob(
  id: String,
  props: BatchSubmitJobProps,
  initializer: @AwsCdkDsl BatchSubmitJob.() -> Unit = {},
): BatchSubmitJob = BatchSubmitJob(this, id, props).apply(initializer)

@Generated
public fun Construct.buildBatchSubmitJob(id: String, initializer: @AwsCdkDsl
    BatchSubmitJob.Builder.() -> Unit = {}): BatchSubmitJob = BatchSubmitJob.Builder.create(this,
    id).apply(initializer).build()
