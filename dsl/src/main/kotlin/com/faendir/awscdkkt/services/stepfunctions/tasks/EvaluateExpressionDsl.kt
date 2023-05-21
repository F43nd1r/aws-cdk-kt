package com.faendir.awscdkkt.services.stepfunctions.tasks

import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.stepfunctions.tasks.EvaluateExpression
import software.amazon.awscdk.services.stepfunctions.tasks.EvaluateExpressionProps
import software.constructs.Construct

@Generated
public fun Construct.evaluateExpression(
  id: String,
  props: EvaluateExpressionProps,
  initializer: EvaluateExpression.() -> Unit = {},
): EvaluateExpression = EvaluateExpression(this, id, props).apply(initializer)
