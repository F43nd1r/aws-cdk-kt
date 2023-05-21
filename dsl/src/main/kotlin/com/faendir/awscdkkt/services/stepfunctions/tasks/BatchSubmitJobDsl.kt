package com.faendir.awscdkkt.services.stepfunctions.tasks

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
  initializer: BatchSubmitJob.() -> Unit = {},
): BatchSubmitJob = BatchSubmitJob(this, id, props).apply(initializer)
