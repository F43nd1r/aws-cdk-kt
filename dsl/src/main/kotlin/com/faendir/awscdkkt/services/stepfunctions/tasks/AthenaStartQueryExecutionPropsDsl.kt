package com.faendir.awscdkkt.services.stepfunctions.tasks

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.stepfunctions.tasks.AthenaStartQueryExecutionProps

@Generated
public
    fun athenaStartQueryExecutionProps(initializer: AthenaStartQueryExecutionProps.Builder.() -> Unit
    = {}): AthenaStartQueryExecutionProps =
    AthenaStartQueryExecutionProps.builder().apply(initializer).build()
