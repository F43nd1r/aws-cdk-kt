@file:Generated(value = ["Generated based on CDK v2.79.1"])

package com.faendir.awscdkkt.services.cloudformation

import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.cloudformation.CfnPublisher
import software.amazon.awscdk.services.cloudformation.CfnPublisherProps
import software.constructs.Construct

public fun Construct.cfnPublisher(
  id: String,
  props: CfnPublisherProps,
  initializer: CfnPublisher.() -> Unit = {},
): CfnPublisher = CfnPublisher(this, id, props).apply(initializer)
