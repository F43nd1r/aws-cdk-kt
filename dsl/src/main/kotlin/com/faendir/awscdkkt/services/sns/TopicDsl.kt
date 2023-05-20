@file:Generated(value = ["Generated based on CDK v2.79.1"])

package com.faendir.awscdkkt.services.sns

import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.sns.Topic
import software.amazon.awscdk.services.sns.TopicProps
import software.constructs.Construct

public fun Construct.topic(id: String, initializer: Topic.() -> Unit = {}): Topic = Topic(this,
    id).apply(initializer)

public fun Construct.topic(
  id: String,
  props: TopicProps,
  initializer: Topic.() -> Unit = {},
): Topic = Topic(this, id, props).apply(initializer)
