package com.faendir.awscdkkt.generated.services.iotevents

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.iotevents.CfnInput
import software.amazon.awscdk.services.iotevents.CfnInputProps
import software.constructs.Construct

@Generated
public fun Construct.cfnInput(
  id: String,
  props: CfnInputProps,
  initializer: @AwsCdkDsl CfnInput.() -> Unit = {},
): CfnInput = CfnInput(this, id, props).apply(initializer)

@Generated
public fun Construct.buildCfnInput(id: String, initializer: @AwsCdkDsl CfnInput.Builder.() -> Unit = {}): CfnInput = CfnInput.Builder.create(this, id).apply(initializer).build()
