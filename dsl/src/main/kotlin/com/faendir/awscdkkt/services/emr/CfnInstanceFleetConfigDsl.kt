package com.faendir.awscdkkt.services.emr

import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.emr.CfnInstanceFleetConfig
import software.amazon.awscdk.services.emr.CfnInstanceFleetConfigProps
import software.constructs.Construct

@Generated
public fun Construct.cfnInstanceFleetConfig(
  id: String,
  props: CfnInstanceFleetConfigProps,
  initializer: CfnInstanceFleetConfig.() -> Unit = {},
): CfnInstanceFleetConfig = CfnInstanceFleetConfig(this, id, props).apply(initializer)
