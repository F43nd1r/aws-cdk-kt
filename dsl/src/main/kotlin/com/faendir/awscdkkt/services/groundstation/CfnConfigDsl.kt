@file:Generated(value = ["Generated 2023-05-20 based on CDK 2.79.1"])

package com.faendir.awscdkkt.services.groundstation

import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.groundstation.CfnConfig
import software.amazon.awscdk.services.groundstation.CfnConfigProps
import software.constructs.Construct

public fun Construct.cfnConfig(
  id: String,
  props: CfnConfigProps,
  initializer: CfnConfig.() -> Unit = {},
): CfnConfig = CfnConfig(this, id, props).apply(initializer)
