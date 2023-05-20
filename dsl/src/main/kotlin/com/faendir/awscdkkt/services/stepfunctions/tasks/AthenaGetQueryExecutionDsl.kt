@file:Generated(value = ["Generated based on CDK v2.80.0"])

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
