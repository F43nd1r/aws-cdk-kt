package com.faendir.awscdkkt.generated.services.synthetics

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.synthetics.CfnCanary
import software.amazon.awscdk.services.synthetics.CfnCanaryProps
import software.constructs.Construct

@Generated
public fun Construct.cfnCanary(id: String, props: CfnCanaryProps): CfnCanary = CfnCanary(this, id,
    props)

@Generated
public fun Construct.cfnCanary(
  id: String,
  props: CfnCanaryProps,
  initializer: @AwsCdkDsl CfnCanary.() -> Unit,
): CfnCanary = CfnCanary(this, id, props).apply(initializer)

@Generated
public fun Construct.buildCfnCanary(id: String, initializer: @AwsCdkDsl
    CfnCanary.Builder.() -> Unit): CfnCanary = CfnCanary.Builder.create(this,
    id).apply(initializer).build()
