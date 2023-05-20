@file:Generated(value = ["Generated based on CDK v2.80.0"])

package com.faendir.awscdkkt.services.sns

import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.sns.CfnTopic
import software.amazon.awscdk.services.sns.CfnTopicProps
import software.constructs.Construct

public fun Construct.cfnTopic(id: String, initializer: CfnTopic.() -> Unit = {}): CfnTopic =
    CfnTopic(this, id).apply(initializer)

public fun Construct.cfnTopic(
  id: String,
  props: CfnTopicProps,
  initializer: CfnTopic.() -> Unit = {},
): CfnTopic = CfnTopic(this, id, props).apply(initializer)
