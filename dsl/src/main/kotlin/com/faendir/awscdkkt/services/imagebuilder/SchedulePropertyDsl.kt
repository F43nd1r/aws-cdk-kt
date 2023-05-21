package com.faendir.awscdkkt.services.imagebuilder

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.imagebuilder.CfnImagePipeline

@Generated
public fun scheduleProperty(initializer: CfnImagePipeline.ScheduleProperty.Builder.() -> Unit = {}):
    CfnImagePipeline.ScheduleProperty =
    CfnImagePipeline.ScheduleProperty.builder().apply(initializer).build()
