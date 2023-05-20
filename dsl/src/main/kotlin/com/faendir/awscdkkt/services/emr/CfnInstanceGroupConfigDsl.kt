@file:Generated(value = ["Generated based on CDK v2.80.0"])

package com.faendir.awscdkkt.services.emr

import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.emr.CfnInstanceGroupConfig
import software.amazon.awscdk.services.emr.CfnInstanceGroupConfigProps
import software.constructs.Construct

public fun Construct.cfnInstanceGroupConfig(
  id: String,
  props: CfnInstanceGroupConfigProps,
  initializer: CfnInstanceGroupConfig.() -> Unit = {},
): CfnInstanceGroupConfig = CfnInstanceGroupConfig(this, id, props).apply(initializer)
