package com.faendir.awscdkkt.services.datasync

import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.datasync.CfnLocationSMB
import software.amazon.awscdk.services.datasync.CfnLocationSMBProps
import software.constructs.Construct

@Generated
public fun Construct.cfnLocationSMB(
  id: String,
  props: CfnLocationSMBProps,
  initializer: CfnLocationSMB.() -> Unit = {},
): CfnLocationSMB = CfnLocationSMB(this, id, props).apply(initializer)
