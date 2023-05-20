@file:Generated(value = ["Generated based on CDK v2.79.1"])

package com.faendir.awscdkkt.services.guardduty

import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.guardduty.CfnMaster
import software.amazon.awscdk.services.guardduty.CfnMasterProps
import software.constructs.Construct

public fun Construct.cfnMaster(
  id: String,
  props: CfnMasterProps,
  initializer: CfnMaster.() -> Unit = {},
): CfnMaster = CfnMaster(this, id, props).apply(initializer)
