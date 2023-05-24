package com.faendir.awscdkkt.generated.services.medialive

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.medialive.CfnInput
import software.amazon.awscdk.services.medialive.CfnInputProps
import software.constructs.Construct

@Generated
public fun Construct.cfnInput(id: String, props: CfnInputProps): CfnInput = CfnInput(this, id,
    props)

@Generated
public fun Construct.cfnInput(
  id: String,
  props: CfnInputProps,
  initializer: @AwsCdkDsl CfnInput.() -> Unit,
): CfnInput = CfnInput(this, id, props).apply(initializer)

@Generated
public fun Construct.cfnInput(id: String): CfnInput = CfnInput(this, id)

@Generated
public fun Construct.cfnInput(id: String, initializer: @AwsCdkDsl CfnInput.() -> Unit): CfnInput =
    CfnInput(this, id).apply(initializer)

@Generated
public fun Construct.buildCfnInput(id: String, initializer: @AwsCdkDsl CfnInput.Builder.() -> Unit):
    CfnInput = CfnInput.Builder.create(this, id).apply(initializer).build()
