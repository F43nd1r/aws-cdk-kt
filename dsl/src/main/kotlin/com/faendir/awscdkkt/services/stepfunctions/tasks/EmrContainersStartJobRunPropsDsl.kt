package com.faendir.awscdkkt.services.stepfunctions.tasks

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.stepfunctions.tasks.EmrContainersStartJobRunProps

@Generated
public
    fun emrContainersStartJobRunProps(initializer: EmrContainersStartJobRunProps.Builder.() -> Unit
    = {}): EmrContainersStartJobRunProps =
    EmrContainersStartJobRunProps.builder().apply(initializer).build()
