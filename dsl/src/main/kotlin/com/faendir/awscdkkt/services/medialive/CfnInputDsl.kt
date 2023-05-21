package com.faendir.awscdkkt.services.medialive

import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.medialive.CfnInput
import software.amazon.awscdk.services.medialive.CfnInputProps
import software.constructs.Construct

@Generated
public fun Construct.cfnInput(id: String, initializer: CfnInput.() -> Unit = {}): CfnInput =
    CfnInput(this, id).apply(initializer)

@Generated
public fun Construct.cfnInput(
  id: String,
  props: CfnInputProps,
  initializer: CfnInput.() -> Unit = {},
): CfnInput = CfnInput(this, id, props).apply(initializer)
