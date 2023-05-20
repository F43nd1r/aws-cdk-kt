@file:Generated(value = ["Generated based on CDK v2.79.1"])

package com.faendir.awscdkkt.services.amplifyuibuilder

import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.amplifyuibuilder.CfnComponent
import software.amazon.awscdk.services.amplifyuibuilder.CfnComponentProps
import software.constructs.Construct

public fun Construct.cfnComponent(
  id: String,
  props: CfnComponentProps,
  initializer: CfnComponent.() -> Unit = {},
): CfnComponent = CfnComponent(this, id, props).apply(initializer)
