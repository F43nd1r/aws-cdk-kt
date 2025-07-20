package com.faendir.awscdkkt.generated.services.medialive

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.medialive.CfnMultiplex
import software.amazon.awscdk.services.medialive.CfnMultiplexProps
import software.constructs.Construct

@Generated
public fun Construct.cfnMultiplex(
  id: String,
  props: CfnMultiplexProps,
  initializer: @AwsCdkDsl CfnMultiplex.() -> Unit = {},
): CfnMultiplex = CfnMultiplex(this, id, props).apply(initializer)

@Generated
public fun Construct.buildCfnMultiplex(id: String, initializer: @AwsCdkDsl CfnMultiplex.Builder.() -> Unit = {}): CfnMultiplex = CfnMultiplex.Builder.create(this, id).apply(initializer).build()
