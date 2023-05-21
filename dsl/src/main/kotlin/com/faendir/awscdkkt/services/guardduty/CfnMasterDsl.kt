package com.faendir.awscdkkt.services.guardduty

import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.guardduty.CfnMaster
import software.amazon.awscdk.services.guardduty.CfnMasterProps
import software.constructs.Construct

@Generated
public fun Construct.cfnMaster(
  id: String,
  props: CfnMasterProps,
  initializer: CfnMaster.() -> Unit = {},
): CfnMaster = CfnMaster(this, id, props).apply(initializer)
