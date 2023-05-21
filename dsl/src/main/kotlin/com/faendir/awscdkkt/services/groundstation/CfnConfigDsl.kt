package com.faendir.awscdkkt.services.groundstation

import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.groundstation.CfnConfig
import software.amazon.awscdk.services.groundstation.CfnConfigProps
import software.constructs.Construct

@Generated
public fun Construct.cfnConfig(
  id: String,
  props: CfnConfigProps,
  initializer: CfnConfig.() -> Unit = {},
): CfnConfig = CfnConfig(this, id, props).apply(initializer)
