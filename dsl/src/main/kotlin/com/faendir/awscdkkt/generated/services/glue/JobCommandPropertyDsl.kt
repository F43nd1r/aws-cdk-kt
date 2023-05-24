package com.faendir.awscdkkt.generated.services.glue

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.glue.CfnJob

@Generated
public fun buildJobCommandProperty(initializer: @AwsCdkDsl
    CfnJob.JobCommandProperty.Builder.() -> Unit): CfnJob.JobCommandProperty =
    CfnJob.JobCommandProperty.Builder().apply(initializer).build()
