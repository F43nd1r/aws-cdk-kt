@file:Generated(value = ["Generated based on CDK v2.80.0"])

package com.faendir.awscdkkt.services.stepfunctions.tasks

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.stepfunctions.tasks.JobDependency

public fun jobDependency(initializer: JobDependency.Builder.() -> Unit): JobDependency =
    JobDependency.builder().apply(initializer).build()
