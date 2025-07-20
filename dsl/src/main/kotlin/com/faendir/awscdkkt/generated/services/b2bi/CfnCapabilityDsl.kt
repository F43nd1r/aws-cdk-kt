package com.faendir.awscdkkt.generated.services.b2bi

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.b2bi.CfnCapability
import software.amazon.awscdk.services.b2bi.CfnCapabilityProps
import software.constructs.Construct

@Generated
public fun Construct.cfnCapability(
  id: String,
  props: CfnCapabilityProps,
  initializer: @AwsCdkDsl CfnCapability.() -> Unit = {},
): CfnCapability = CfnCapability(this, id, props).apply(initializer)

@Generated
public fun Construct.buildCfnCapability(id: String, initializer: @AwsCdkDsl CfnCapability.Builder.() -> Unit = {}): CfnCapability = CfnCapability.Builder.create(this, id).apply(initializer).build()
