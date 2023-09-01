package com.faendir.awscdkkt.generated.services.stepfunctions.tasks

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.stepfunctions.tasks.JobDependency

@Generated
public fun buildJobDependency(initializer: @AwsCdkDsl JobDependency.Builder.() -> Unit = {}):
    JobDependency = JobDependency.Builder().apply(initializer).build()
