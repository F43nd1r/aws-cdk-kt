package com.faendir.awscdkkt.generated.services.batch

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.batch.CfnJobQueue

@Generated
public fun buildJobStateTimeLimitActionProperty(initializer: @AwsCdkDsl
    CfnJobQueue.JobStateTimeLimitActionProperty.Builder.() -> Unit = {}):
    CfnJobQueue.JobStateTimeLimitActionProperty =
    CfnJobQueue.JobStateTimeLimitActionProperty.Builder().apply(initializer).build()
