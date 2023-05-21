package com.faendir.awscdkkt.services.sns

import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.sns.TopicPolicy
import software.amazon.awscdk.services.sns.TopicPolicyProps
import software.constructs.Construct

@Generated
public fun Construct.topicPolicy(
  id: String,
  props: TopicPolicyProps,
  initializer: TopicPolicy.() -> Unit = {},
): TopicPolicy = TopicPolicy(this, id, props).apply(initializer)
