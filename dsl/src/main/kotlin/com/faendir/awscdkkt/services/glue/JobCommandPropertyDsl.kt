package com.faendir.awscdkkt.services.glue

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.glue.CfnJob

@Generated
public fun jobCommandProperty(initializer: CfnJob.JobCommandProperty.Builder.() -> Unit = {}):
    CfnJob.JobCommandProperty = CfnJob.JobCommandProperty.builder().apply(initializer).build()
