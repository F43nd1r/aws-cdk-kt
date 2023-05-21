package com.faendir.awscdkkt.services.datasync

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.datasync.CfnTask

@Generated
public fun taskScheduleProperty(initializer: CfnTask.TaskScheduleProperty.Builder.() -> Unit = {}):
    CfnTask.TaskScheduleProperty = CfnTask.TaskScheduleProperty.builder().apply(initializer).build()
