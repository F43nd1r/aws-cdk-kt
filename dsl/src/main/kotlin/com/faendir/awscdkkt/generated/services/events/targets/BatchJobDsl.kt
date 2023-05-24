package com.faendir.awscdkkt.generated.services.events.targets

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.events.targets.BatchJob
import software.constructs.IConstruct

@Generated
public fun buildBatchJob(
  jobQueueArn: String,
  jobQueueScope: IConstruct,
  jobDefinitionArn: String,
  jobDefinitionScope: IConstruct,
  initializer: @AwsCdkDsl BatchJob.Builder.() -> Unit,
): BatchJob = BatchJob.Builder.create(jobQueueArn, jobQueueScope, jobDefinitionArn,
    jobDefinitionScope).apply(initializer).build()
