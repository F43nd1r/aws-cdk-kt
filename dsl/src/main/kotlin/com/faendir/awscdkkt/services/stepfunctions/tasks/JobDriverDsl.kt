package com.faendir.awscdkkt.services.stepfunctions.tasks

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.stepfunctions.tasks.JobDriver

@Generated
public fun jobDriver(initializer: JobDriver.Builder.() -> Unit = {}): JobDriver =
    JobDriver.builder().apply(initializer).build()
