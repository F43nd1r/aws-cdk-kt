package com.faendir.awscdkkt.services.stepfunctions.tasks

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.stepfunctions.tasks.BatchJobDependency

@Generated
public fun batchJobDependency(initializer: BatchJobDependency.Builder.() -> Unit = {}):
    BatchJobDependency = BatchJobDependency.builder().apply(initializer).build()
