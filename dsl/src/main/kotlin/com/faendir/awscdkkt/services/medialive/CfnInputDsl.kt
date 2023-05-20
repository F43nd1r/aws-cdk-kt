@file:Generated(value = ["Generated based on CDK v2.79.1"])

package com.faendir.awscdkkt.services.medialive

import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.medialive.CfnInput
import software.amazon.awscdk.services.medialive.CfnInputProps
import software.constructs.Construct

public fun Construct.cfnInput(id: String, initializer: CfnInput.() -> Unit = {}): CfnInput =
    CfnInput(this, id).apply(initializer)

public fun Construct.cfnInput(
  id: String,
  props: CfnInputProps,
  initializer: CfnInput.() -> Unit = {},
): CfnInput = CfnInput(this, id, props).apply(initializer)
