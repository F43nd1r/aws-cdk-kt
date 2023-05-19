@file:Generated(value = ["Generated 2023-05-19 based on CDK 2.79.1"])

package com.faendir.awscdkkt.services.stepfunctions.tasks

import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.stepfunctions.tasks.AthenaStopQueryExecution
import software.amazon.awscdk.services.stepfunctions.tasks.AthenaStopQueryExecutionProps
import software.constructs.Construct

public fun Construct.athenaStopQueryExecution(
  id: String,
  props: AthenaStopQueryExecutionProps,
  initializer: AthenaStopQueryExecution.() -> Unit = {},
): AthenaStopQueryExecution = AthenaStopQueryExecution(this, id, props).apply(initializer)
