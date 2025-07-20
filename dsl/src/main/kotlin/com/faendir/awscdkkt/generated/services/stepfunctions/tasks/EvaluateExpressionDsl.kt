package com.faendir.awscdkkt.generated.services.stepfunctions.tasks

import com.faendir.awscdkkt.AwsCdkDsl
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
  initializer: @AwsCdkDsl EvaluateExpression.() -> Unit = {},
): EvaluateExpression = EvaluateExpression(this, id, props).apply(initializer)

@Generated
public fun Construct.buildEvaluateExpression(id: String, initializer: @AwsCdkDsl EvaluateExpression.Builder.() -> Unit = {}): EvaluateExpression = EvaluateExpression.Builder.create(this, id).apply(initializer).build()
