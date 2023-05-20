@file:Generated(value = ["Generated based on CDK v2.80.0"])

package com.faendir.awscdkkt.services.imagebuilder

import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.imagebuilder.CfnComponent
import software.amazon.awscdk.services.imagebuilder.CfnComponentProps
import software.constructs.Construct

public fun Construct.cfnComponent(
  id: String,
  props: CfnComponentProps,
  initializer: CfnComponent.() -> Unit = {},
): CfnComponent = CfnComponent(this, id, props).apply(initializer)
