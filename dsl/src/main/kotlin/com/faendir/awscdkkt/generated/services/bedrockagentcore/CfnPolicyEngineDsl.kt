package com.faendir.awscdkkt.generated.services.bedrockagentcore

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.bedrockagentcore.CfnPolicyEngine
import software.amazon.awscdk.services.bedrockagentcore.CfnPolicyEngineProps
import software.constructs.Construct

@Generated
public fun Construct.cfnPolicyEngine(
  id: String,
  props: CfnPolicyEngineProps,
  initializer: @AwsCdkDsl CfnPolicyEngine.() -> Unit = {},
): CfnPolicyEngine = CfnPolicyEngine(this, id, props).apply(initializer)

@Generated
public fun Construct.buildCfnPolicyEngine(id: String, initializer: @AwsCdkDsl CfnPolicyEngine.Builder.() -> Unit = {}): CfnPolicyEngine = CfnPolicyEngine.Builder.create(this, id).apply(initializer).build()
