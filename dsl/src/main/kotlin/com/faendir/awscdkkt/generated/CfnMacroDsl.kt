package com.faendir.awscdkkt.generated

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.CfnMacro
import software.amazon.awscdk.CfnMacroProps
import software.constructs.Construct

@Generated
public fun Construct.cfnMacro(
  id: String,
  props: CfnMacroProps,
  initializer: @AwsCdkDsl CfnMacro.() -> Unit = {},
): CfnMacro = CfnMacro(this, id, props).apply(initializer)

@Generated
public fun Construct.buildCfnMacro(id: String, initializer: @AwsCdkDsl CfnMacro.Builder.() -> Unit =
    {}): CfnMacro = CfnMacro.Builder.create(this, id).apply(initializer).build()
