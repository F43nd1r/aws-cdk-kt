package com.faendir.awscdkkt.generated.services.batch

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.batch.JobQueueProps

@Generated
public fun buildJobQueueProps(initializer: @AwsCdkDsl JobQueueProps.Builder.() -> Unit = {}):
    JobQueueProps = JobQueueProps.Builder().apply(initializer).build()
