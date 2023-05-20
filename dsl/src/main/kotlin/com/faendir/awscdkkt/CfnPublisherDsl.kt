@file:Generated(value = ["Generated 2023-05-20 based on CDK 2.79.1"])

package com.faendir.awscdkkt

import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.CfnPublisher
import software.amazon.awscdk.CfnPublisherProps
import software.constructs.Construct

public fun Construct.cfnPublisher(
  id: String,
  props: CfnPublisherProps,
  initializer: CfnPublisher.() -> Unit = {},
): CfnPublisher = CfnPublisher(this, id, props).apply(initializer)
