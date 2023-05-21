package com.faendir.awscdkkt.services.sns

import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.sns.Topic
import software.amazon.awscdk.services.sns.TopicProps
import software.constructs.Construct

@Generated
public fun Construct.topic(id: String, initializer: Topic.() -> Unit = {}): Topic = Topic(this,
    id).apply(initializer)

@Generated
public fun Construct.topic(
  id: String,
  props: TopicProps,
  initializer: Topic.() -> Unit = {},
): Topic = Topic(this, id, props).apply(initializer)
