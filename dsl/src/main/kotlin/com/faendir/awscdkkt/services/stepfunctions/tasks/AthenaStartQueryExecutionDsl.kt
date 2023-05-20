@file:Generated(value = ["Generated 2023-05-20 based on CDK 2.79.1"])

package com.faendir.awscdkkt.services.stepfunctions.tasks

import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.stepfunctions.tasks.AthenaStartQueryExecution
import software.amazon.awscdk.services.stepfunctions.tasks.AthenaStartQueryExecutionProps
import software.constructs.Construct

public fun Construct.athenaStartQueryExecution(
  id: String,
  props: AthenaStartQueryExecutionProps,
  initializer: AthenaStartQueryExecution.() -> Unit = {},
): AthenaStartQueryExecution = AthenaStartQueryExecution(this, id, props).apply(initializer)
