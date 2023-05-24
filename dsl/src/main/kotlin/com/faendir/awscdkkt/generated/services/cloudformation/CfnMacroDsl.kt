package com.faendir.awscdkkt.generated.services.cloudformation

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.cloudformation.CfnMacro
import software.amazon.awscdk.services.cloudformation.CfnMacroProps
import software.constructs.Construct

@Generated
public fun Construct.cfnMacro(id: String, props: CfnMacroProps): CfnMacro = CfnMacro(this, id,
    props)

@Generated
public fun Construct.cfnMacro(
  id: String,
  props: CfnMacroProps,
  initializer: @AwsCdkDsl CfnMacro.() -> Unit,
): CfnMacro = CfnMacro(this, id, props).apply(initializer)

@Generated
public fun Construct.buildCfnMacro(id: String, initializer: @AwsCdkDsl CfnMacro.Builder.() -> Unit):
    CfnMacro = CfnMacro.Builder.create(this, id).apply(initializer).build()
