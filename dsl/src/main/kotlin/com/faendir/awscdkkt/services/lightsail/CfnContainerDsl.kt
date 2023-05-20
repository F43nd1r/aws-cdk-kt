@file:Generated(value = ["Generated 2023-05-20 based on CDK 2.79.1"])

package com.faendir.awscdkkt.services.lightsail

import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.lightsail.CfnContainer
import software.amazon.awscdk.services.lightsail.CfnContainerProps
import software.constructs.Construct

public fun Construct.cfnContainer(
  id: String,
  props: CfnContainerProps,
  initializer: CfnContainer.() -> Unit = {},
): CfnContainer = CfnContainer(this, id, props).apply(initializer)
