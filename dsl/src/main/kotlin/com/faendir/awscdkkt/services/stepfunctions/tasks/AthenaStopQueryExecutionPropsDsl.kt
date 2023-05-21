package com.faendir.awscdkkt.services.stepfunctions.tasks

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.stepfunctions.tasks.AthenaStopQueryExecutionProps

@Generated
public
    fun athenaStopQueryExecutionProps(initializer: AthenaStopQueryExecutionProps.Builder.() -> Unit
    = {}): AthenaStopQueryExecutionProps =
    AthenaStopQueryExecutionProps.builder().apply(initializer).build()
