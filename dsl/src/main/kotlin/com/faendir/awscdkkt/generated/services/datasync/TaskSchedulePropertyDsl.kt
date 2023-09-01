package com.faendir.awscdkkt.generated.services.datasync

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.datasync.CfnTask

@Generated
public fun buildTaskScheduleProperty(initializer: @AwsCdkDsl
    CfnTask.TaskScheduleProperty.Builder.() -> Unit = {}): CfnTask.TaskScheduleProperty =
    CfnTask.TaskScheduleProperty.Builder().apply(initializer).build()
