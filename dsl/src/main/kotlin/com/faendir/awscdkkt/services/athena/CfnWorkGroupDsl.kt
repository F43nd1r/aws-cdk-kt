package com.faendir.awscdkkt.services.athena

import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.athena.CfnWorkGroup
import software.amazon.awscdk.services.athena.CfnWorkGroupProps
import software.constructs.Construct

@Generated
public fun Construct.cfnWorkGroup(
  id: String,
  props: CfnWorkGroupProps,
  initializer: CfnWorkGroup.() -> Unit = {},
): CfnWorkGroup = CfnWorkGroup(this, id, props).apply(initializer)
