package com.faendir.awscdkkt.generated.services.sns

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.sns.Topic
import software.amazon.awscdk.services.sns.TopicProps
import software.constructs.Construct

@Generated
public fun Construct.topic(id: String, initializer: @AwsCdkDsl Topic.() -> Unit = {}): Topic =
    Topic(this, id).apply(initializer)

@Generated
public fun Construct.topic(
  id: String,
  props: TopicProps,
  initializer: @AwsCdkDsl Topic.() -> Unit = {},
): Topic = Topic(this, id, props).apply(initializer)

@Generated
public fun Construct.buildTopic(id: String, initializer: @AwsCdkDsl Topic.Builder.() -> Unit = {}):
    Topic = Topic.Builder.create(this, id).apply(initializer).build()
