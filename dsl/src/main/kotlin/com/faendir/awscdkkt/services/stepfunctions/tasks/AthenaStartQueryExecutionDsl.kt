@file:Generated(value = ["Generated based on CDK v2.79.1"])

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
