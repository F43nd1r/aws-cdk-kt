package com.faendir.awscdkkt.services.stepfunctions.tasks

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.stepfunctions.tasks.JobDependency

@Generated
public fun jobDependency(initializer: JobDependency.Builder.() -> Unit = {}): JobDependency =
    JobDependency.builder().apply(initializer).build()
