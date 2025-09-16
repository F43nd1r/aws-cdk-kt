package com.faendir.awscdkkt.generated.services.bedrock

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.bedrock.CfnAutomatedReasoningPolicyVersion
import software.amazon.awscdk.services.bedrock.CfnAutomatedReasoningPolicyVersionProps
import software.constructs.Construct

@Generated
public fun Construct.cfnAutomatedReasoningPolicyVersion(
  id: String,
  props: CfnAutomatedReasoningPolicyVersionProps,
  initializer: @AwsCdkDsl CfnAutomatedReasoningPolicyVersion.() -> Unit = {},
): CfnAutomatedReasoningPolicyVersion = CfnAutomatedReasoningPolicyVersion(this, id, props).apply(initializer)

@Generated
public fun Construct.buildCfnAutomatedReasoningPolicyVersion(id: String, initializer: @AwsCdkDsl CfnAutomatedReasoningPolicyVersion.Builder.() -> Unit = {}): CfnAutomatedReasoningPolicyVersion = CfnAutomatedReasoningPolicyVersion.Builder.create(this, id).apply(initializer).build()
