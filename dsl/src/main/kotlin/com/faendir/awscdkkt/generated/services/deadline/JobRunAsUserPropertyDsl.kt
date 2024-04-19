package com.faendir.awscdkkt.generated.services.deadline

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.deadline.CfnQueue

@Generated
public fun buildJobRunAsUserProperty(initializer: @AwsCdkDsl
    CfnQueue.JobRunAsUserProperty.Builder.() -> Unit = {}): CfnQueue.JobRunAsUserProperty =
    CfnQueue.JobRunAsUserProperty.Builder().apply(initializer).build()
