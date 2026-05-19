package com.faendir.awscdkkt.generated.services.bedrockagentcore

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.bedrockagentcore.OnlineEvaluationConfig
import software.amazon.awscdk.services.bedrockagentcore.OnlineEvaluationConfigProps
import software.constructs.Construct

@Generated
public fun Construct.onlineEvaluationConfig(
  id: String,
  props: OnlineEvaluationConfigProps,
  initializer: @AwsCdkDsl OnlineEvaluationConfig.() -> Unit = {},
): OnlineEvaluationConfig = OnlineEvaluationConfig(this, id, props).apply(initializer)

@Generated
public fun Construct.buildOnlineEvaluationConfig(id: String, initializer: @AwsCdkDsl OnlineEvaluationConfig.Builder.() -> Unit = {}): OnlineEvaluationConfig = OnlineEvaluationConfig.Builder.create(this, id).apply(initializer).build()
