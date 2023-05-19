@file:Generated(value = ["Generated 2023-05-19 based on CDK 2.79.1"])

package com.faendir.awscdkkt.services.iot1click

import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.iot1click.CfnPlacement
import software.amazon.awscdk.services.iot1click.CfnPlacementProps
import software.constructs.Construct

public fun Construct.cfnPlacement(
  id: String,
  props: CfnPlacementProps,
  initializer: CfnPlacement.() -> Unit = {},
): CfnPlacement = CfnPlacement(this, id, props).apply(initializer)
