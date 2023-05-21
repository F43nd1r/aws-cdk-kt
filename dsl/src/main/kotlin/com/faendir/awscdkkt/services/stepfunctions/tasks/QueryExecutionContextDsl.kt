package com.faendir.awscdkkt.services.stepfunctions.tasks

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.stepfunctions.tasks.QueryExecutionContext

@Generated
public fun queryExecutionContext(initializer: QueryExecutionContext.Builder.() -> Unit = {}):
    QueryExecutionContext = QueryExecutionContext.builder().apply(initializer).build()
