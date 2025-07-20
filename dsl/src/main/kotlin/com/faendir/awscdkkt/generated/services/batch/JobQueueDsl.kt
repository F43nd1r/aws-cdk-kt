package com.faendir.awscdkkt.generated.services.batch

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.batch.JobQueue
import software.amazon.awscdk.services.batch.JobQueueProps
import software.constructs.Construct

@Generated
public fun Construct.jobQueue(id: String, initializer: @AwsCdkDsl JobQueue.() -> Unit = {}): JobQueue = JobQueue(this, id).apply(initializer)

@Generated
public fun Construct.jobQueue(
  id: String,
  props: JobQueueProps,
  initializer: @AwsCdkDsl JobQueue.() -> Unit = {},
): JobQueue = JobQueue(this, id, props).apply(initializer)

@Generated
public fun Construct.buildJobQueue(id: String, initializer: @AwsCdkDsl JobQueue.Builder.() -> Unit = {}): JobQueue = JobQueue.Builder.create(this, id).apply(initializer).build()
