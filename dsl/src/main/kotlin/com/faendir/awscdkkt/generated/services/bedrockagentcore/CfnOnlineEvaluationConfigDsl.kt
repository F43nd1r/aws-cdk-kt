package com.faendir.awscdkkt.generated.services.bedrockagentcore

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.bedrockagentcore.CfnOnlineEvaluationConfig
import software.amazon.awscdk.services.bedrockagentcore.CfnOnlineEvaluationConfigProps
import software.constructs.Construct

@Generated
public fun Construct.cfnOnlineEvaluationConfig(
  id: String,
  props: CfnOnlineEvaluationConfigProps,
  initializer: @AwsCdkDsl CfnOnlineEvaluationConfig.() -> Unit = {},
): CfnOnlineEvaluationConfig = CfnOnlineEvaluationConfig(this, id, props).apply(initializer)

@Generated
public fun Construct.buildCfnOnlineEvaluationConfig(id: String, initializer: @AwsCdkDsl CfnOnlineEvaluationConfig.Builder.() -> Unit = {}): CfnOnlineEvaluationConfig = CfnOnlineEvaluationConfig.Builder.create(this, id).apply(initializer).build()
