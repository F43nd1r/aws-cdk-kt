package com.faendir.awscdkkt.generated.services.iot

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.iot.CfnCommand
import software.amazon.awscdk.services.iot.CfnCommandProps
import software.constructs.Construct

@Generated
public fun Construct.cfnCommand(
  id: String,
  props: CfnCommandProps,
  initializer: @AwsCdkDsl CfnCommand.() -> Unit = {},
): CfnCommand = CfnCommand(this, id, props).apply(initializer)

@Generated
public fun Construct.buildCfnCommand(id: String, initializer: @AwsCdkDsl
    CfnCommand.Builder.() -> Unit = {}): CfnCommand = CfnCommand.Builder.create(this,
    id).apply(initializer).build()
