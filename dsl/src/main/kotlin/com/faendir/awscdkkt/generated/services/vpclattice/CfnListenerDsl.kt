package com.faendir.awscdkkt.generated.services.vpclattice

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.vpclattice.CfnListener
import software.amazon.awscdk.services.vpclattice.CfnListenerProps
import software.constructs.Construct

@Generated
public fun Construct.cfnListener(
  id: String,
  props: CfnListenerProps,
  initializer: @AwsCdkDsl CfnListener.() -> Unit = {},
): CfnListener = CfnListener(this, id, props).apply(initializer)

@Generated
public fun Construct.buildCfnListener(id: String, initializer: @AwsCdkDsl CfnListener.Builder.() -> Unit = {}): CfnListener = CfnListener.Builder.create(this, id).apply(initializer).build()
