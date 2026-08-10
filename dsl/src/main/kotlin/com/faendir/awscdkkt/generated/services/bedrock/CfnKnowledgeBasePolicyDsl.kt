package com.faendir.awscdkkt.generated.services.bedrock

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.bedrock.CfnKnowledgeBasePolicy
import software.amazon.awscdk.services.bedrock.CfnKnowledgeBasePolicyProps
import software.constructs.Construct

@Generated
public fun Construct.cfnKnowledgeBasePolicy(
  id: String,
  props: CfnKnowledgeBasePolicyProps,
  initializer: @AwsCdkDsl CfnKnowledgeBasePolicy.() -> Unit = {},
): CfnKnowledgeBasePolicy = CfnKnowledgeBasePolicy(this, id, props).apply(initializer)

@Generated
public fun Construct.buildCfnKnowledgeBasePolicy(id: String, initializer: @AwsCdkDsl CfnKnowledgeBasePolicy.Builder.() -> Unit = {}): CfnKnowledgeBasePolicy = CfnKnowledgeBasePolicy.Builder.create(this, id).apply(initializer).build()
