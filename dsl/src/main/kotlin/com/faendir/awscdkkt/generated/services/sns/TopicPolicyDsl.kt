package com.faendir.awscdkkt.generated.services.sns

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.sns.TopicPolicy
import software.amazon.awscdk.services.sns.TopicPolicyProps
import software.constructs.Construct

@Generated
public fun Construct.topicPolicy(id: String, props: TopicPolicyProps): TopicPolicy =
    TopicPolicy(this, id, props)

@Generated
public fun Construct.topicPolicy(
  id: String,
  props: TopicPolicyProps,
  initializer: @AwsCdkDsl TopicPolicy.() -> Unit,
): TopicPolicy = TopicPolicy(this, id, props).apply(initializer)

@Generated
public fun Construct.buildTopicPolicy(id: String, initializer: @AwsCdkDsl
    TopicPolicy.Builder.() -> Unit): TopicPolicy = TopicPolicy.Builder.create(this,
    id).apply(initializer).build()
