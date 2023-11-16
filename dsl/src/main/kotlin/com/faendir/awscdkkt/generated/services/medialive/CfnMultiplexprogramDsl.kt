package com.faendir.awscdkkt.generated.services.medialive

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.medialive.CfnMultiplexprogram
import software.amazon.awscdk.services.medialive.CfnMultiplexprogramProps
import software.constructs.Construct

@Generated
public fun Construct.cfnMultiplexprogram(id: String, initializer: @AwsCdkDsl
    CfnMultiplexprogram.() -> Unit = {}): CfnMultiplexprogram = CfnMultiplexprogram(this,
    id).apply(initializer)

@Generated
public fun Construct.cfnMultiplexprogram(
  id: String,
  props: CfnMultiplexprogramProps,
  initializer: @AwsCdkDsl CfnMultiplexprogram.() -> Unit = {},
): CfnMultiplexprogram = CfnMultiplexprogram(this, id, props).apply(initializer)

@Generated
public fun Construct.buildCfnMultiplexprogram(id: String, initializer: @AwsCdkDsl
    CfnMultiplexprogram.Builder.() -> Unit = {}): CfnMultiplexprogram =
    CfnMultiplexprogram.Builder.create(this, id).apply(initializer).build()
