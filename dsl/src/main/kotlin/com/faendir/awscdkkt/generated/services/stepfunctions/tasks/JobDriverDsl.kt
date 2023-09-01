package com.faendir.awscdkkt.generated.services.stepfunctions.tasks

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.stepfunctions.tasks.JobDriver

@Generated
public fun buildJobDriver(initializer: @AwsCdkDsl JobDriver.Builder.() -> Unit = {}): JobDriver =
    JobDriver.Builder().apply(initializer).build()
