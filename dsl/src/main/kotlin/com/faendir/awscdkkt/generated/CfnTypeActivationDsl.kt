package com.faendir.awscdkkt.generated

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.CfnTypeActivation
import software.amazon.awscdk.CfnTypeActivationProps
import software.constructs.Construct

@Generated
public fun Construct.cfnTypeActivation(id: String, initializer: @AwsCdkDsl
    CfnTypeActivation.() -> Unit = {}): CfnTypeActivation = CfnTypeActivation(this,
    id).apply(initializer)

@Generated
public fun Construct.cfnTypeActivation(
  id: String,
  props: CfnTypeActivationProps,
  initializer: @AwsCdkDsl CfnTypeActivation.() -> Unit = {},
): CfnTypeActivation = CfnTypeActivation(this, id, props).apply(initializer)

@Generated
public fun Construct.buildCfnTypeActivation(id: String, initializer: @AwsCdkDsl
    CfnTypeActivation.Builder.() -> Unit = {}): CfnTypeActivation =
    CfnTypeActivation.Builder.create(this, id).apply(initializer).build()
