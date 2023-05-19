@file:Generated(value = ["Generated 2023-05-19 based on CDK 2.79.1"])

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
