package com.faendir.awscdkkt.generated.services.bedrockagentcore

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.bedrockagentcore.CfnEvaluator
import software.amazon.awscdk.services.bedrockagentcore.CfnEvaluatorProps
import software.constructs.Construct

@Generated
public fun Construct.cfnEvaluator(
  id: String,
  props: CfnEvaluatorProps,
  initializer: @AwsCdkDsl CfnEvaluator.() -> Unit = {},
): CfnEvaluator = CfnEvaluator(this, id, props).apply(initializer)

@Generated
public fun Construct.buildCfnEvaluator(id: String, initializer: @AwsCdkDsl CfnEvaluator.Builder.() -> Unit = {}): CfnEvaluator = CfnEvaluator.Builder.create(this, id).apply(initializer).build()
