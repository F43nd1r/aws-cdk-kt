package com.faendir.awscdkkt.generated.services.sns

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.sns.CfnTopicPolicy
import software.amazon.awscdk.services.sns.CfnTopicPolicyProps
import software.constructs.Construct

@Generated
public fun Construct.cfnTopicPolicy(id: String, props: CfnTopicPolicyProps): CfnTopicPolicy =
    CfnTopicPolicy(this, id, props)

@Generated
public fun Construct.cfnTopicPolicy(
  id: String,
  props: CfnTopicPolicyProps,
  initializer: @AwsCdkDsl CfnTopicPolicy.() -> Unit,
): CfnTopicPolicy = CfnTopicPolicy(this, id, props).apply(initializer)

@Generated
public fun Construct.buildCfnTopicPolicy(id: String, initializer: @AwsCdkDsl
    CfnTopicPolicy.Builder.() -> Unit): CfnTopicPolicy = CfnTopicPolicy.Builder.create(this,
    id).apply(initializer).build()
