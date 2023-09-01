package com.faendir.awscdkkt.generated.services.iot1click

import com.faendir.awscdkkt.AwsCdkDsl
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
  initializer: @AwsCdkDsl CfnPlacement.() -> Unit = {},
): CfnPlacement = CfnPlacement(this, id, props).apply(initializer)

@Generated
public fun Construct.buildCfnPlacement(id: String, initializer: @AwsCdkDsl
    CfnPlacement.Builder.() -> Unit = {}): CfnPlacement = CfnPlacement.Builder.create(this,
    id).apply(initializer).build()
