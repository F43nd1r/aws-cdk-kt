package com.faendir.awscdkkt.generated.services.sns

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.sns.CfnTopicInlinePolicy
import software.amazon.awscdk.services.sns.CfnTopicInlinePolicyProps
import software.constructs.Construct

@Generated
public fun Construct.cfnTopicInlinePolicy(
  id: String,
  props: CfnTopicInlinePolicyProps,
  initializer: @AwsCdkDsl CfnTopicInlinePolicy.() -> Unit = {},
): CfnTopicInlinePolicy = CfnTopicInlinePolicy(this, id, props).apply(initializer)

@Generated
public fun Construct.buildCfnTopicInlinePolicy(id: String, initializer: @AwsCdkDsl
    CfnTopicInlinePolicy.Builder.() -> Unit = {}): CfnTopicInlinePolicy =
    CfnTopicInlinePolicy.Builder.create(this, id).apply(initializer).build()
