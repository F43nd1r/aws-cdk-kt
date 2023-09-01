package com.faendir.awscdkkt.generated.services.oam

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.oam.CfnSink
import software.amazon.awscdk.services.oam.CfnSinkProps
import software.constructs.Construct

@Generated
public fun Construct.cfnSink(
  id: String,
  props: CfnSinkProps,
  initializer: @AwsCdkDsl CfnSink.() -> Unit = {},
): CfnSink = CfnSink(this, id, props).apply(initializer)

@Generated
public fun Construct.buildCfnSink(id: String, initializer: @AwsCdkDsl CfnSink.Builder.() -> Unit =
    {}): CfnSink = CfnSink.Builder.create(this, id).apply(initializer).build()
