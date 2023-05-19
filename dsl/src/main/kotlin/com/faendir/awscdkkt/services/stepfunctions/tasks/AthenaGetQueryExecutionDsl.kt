@file:Generated(value = ["Generated 2023-05-19 based on CDK 2.79.1"])

package com.faendir.awscdkkt.services.stepfunctions.tasks

import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.stepfunctions.tasks.AthenaGetQueryExecution
import software.amazon.awscdk.services.stepfunctions.tasks.AthenaGetQueryExecutionProps
import software.constructs.Construct

public fun Construct.athenaGetQueryExecution(
  id: String,
  props: AthenaGetQueryExecutionProps,
  initializer: AthenaGetQueryExecution.() -> Unit = {},
): AthenaGetQueryExecution = AthenaGetQueryExecution(this, id, props).apply(initializer)
