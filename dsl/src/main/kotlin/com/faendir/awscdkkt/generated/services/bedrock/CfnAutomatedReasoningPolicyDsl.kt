package com.faendir.awscdkkt.generated.services.bedrock

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.bedrock.CfnAutomatedReasoningPolicy
import software.amazon.awscdk.services.bedrock.CfnAutomatedReasoningPolicyProps
import software.constructs.Construct

@Generated
public fun Construct.cfnAutomatedReasoningPolicy(
  id: String,
  props: CfnAutomatedReasoningPolicyProps,
  initializer: @AwsCdkDsl CfnAutomatedReasoningPolicy.() -> Unit = {},
): CfnAutomatedReasoningPolicy = CfnAutomatedReasoningPolicy(this, id, props).apply(initializer)

@Generated
public fun Construct.buildCfnAutomatedReasoningPolicy(id: String, initializer: @AwsCdkDsl CfnAutomatedReasoningPolicy.Builder.() -> Unit = {}): CfnAutomatedReasoningPolicy = CfnAutomatedReasoningPolicy.Builder.create(this, id).apply(initializer).build()
