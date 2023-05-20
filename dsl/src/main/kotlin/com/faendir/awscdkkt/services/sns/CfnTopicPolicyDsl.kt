@file:Generated(value = ["Generated based on CDK v2.80.0"])

package com.faendir.awscdkkt.services.sns

import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.sns.CfnTopicPolicy
import software.amazon.awscdk.services.sns.CfnTopicPolicyProps
import software.constructs.Construct

public fun Construct.cfnTopicPolicy(
  id: String,
  props: CfnTopicPolicyProps,
  initializer: CfnTopicPolicy.() -> Unit = {},
): CfnTopicPolicy = CfnTopicPolicy(this, id, props).apply(initializer)
