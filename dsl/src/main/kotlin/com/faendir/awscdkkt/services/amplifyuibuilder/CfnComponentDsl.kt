@file:Generated(value = ["Generated 2023-05-19 based on CDK 2.79.1"])

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
