package com.faendir.awscdkkt.services.sns

import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.sns.CfnTopic
import software.amazon.awscdk.services.sns.CfnTopicProps
import software.constructs.Construct

@Generated
public fun Construct.cfnTopic(id: String, initializer: CfnTopic.() -> Unit = {}): CfnTopic =
    CfnTopic(this, id).apply(initializer)

@Generated
public fun Construct.cfnTopic(
  id: String,
  props: CfnTopicProps,
  initializer: CfnTopic.() -> Unit = {},
): CfnTopic = CfnTopic(this, id, props).apply(initializer)
