package com.faendir.awscdkkt.generated.services.eks

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.eks.CfnCapability
import software.amazon.awscdk.services.eks.CfnCapabilityProps
import software.constructs.Construct

@Generated
public fun Construct.cfnCapability(
  id: String,
  props: CfnCapabilityProps,
  initializer: @AwsCdkDsl CfnCapability.() -> Unit = {},
): CfnCapability = CfnCapability(this, id, props).apply(initializer)

@Generated
public fun Construct.buildCfnCapability(id: String, initializer: @AwsCdkDsl CfnCapability.Builder.() -> Unit = {}): CfnCapability = CfnCapability.Builder.create(this, id).apply(initializer).build()
