package com.faendir.awscdkkt.services.redshiftserverless

import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.redshiftserverless.CfnWorkgroup
import software.amazon.awscdk.services.redshiftserverless.CfnWorkgroupProps
import software.constructs.Construct

@Generated
public fun Construct.cfnWorkgroup(
  id: String,
  props: CfnWorkgroupProps,
  initializer: CfnWorkgroup.() -> Unit = {},
): CfnWorkgroup = CfnWorkgroup(this, id, props).apply(initializer)
