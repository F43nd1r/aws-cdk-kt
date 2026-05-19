package com.faendir.awscdkkt.generated.services.bedrockagentcore

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.bedrockagentcore.Evaluator
import software.amazon.awscdk.services.bedrockagentcore.EvaluatorProps
import software.constructs.Construct

@Generated
public fun Construct.evaluator(
  id: String,
  props: EvaluatorProps,
  initializer: @AwsCdkDsl Evaluator.() -> Unit = {},
): Evaluator = Evaluator(this, id, props).apply(initializer)

@Generated
public fun Construct.buildEvaluator(id: String, initializer: @AwsCdkDsl Evaluator.Builder.() -> Unit = {}): Evaluator = Evaluator.Builder.create(this, id).apply(initializer).build()
