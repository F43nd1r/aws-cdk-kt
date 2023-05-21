package com.faendir.awscdkkt.services.iot1click

import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.iot1click.CfnPlacement
import software.amazon.awscdk.services.iot1click.CfnPlacementProps
import software.constructs.Construct

@Generated
public fun Construct.cfnPlacement(
  id: String,
  props: CfnPlacementProps,
  initializer: CfnPlacement.() -> Unit = {},
): CfnPlacement = CfnPlacement(this, id, props).apply(initializer)
