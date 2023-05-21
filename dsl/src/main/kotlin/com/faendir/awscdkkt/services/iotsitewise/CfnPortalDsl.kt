package com.faendir.awscdkkt.services.iotsitewise

import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.iotsitewise.CfnPortal
import software.amazon.awscdk.services.iotsitewise.CfnPortalProps
import software.constructs.Construct

@Generated
public fun Construct.cfnPortal(
  id: String,
  props: CfnPortalProps,
  initializer: CfnPortal.() -> Unit = {},
): CfnPortal = CfnPortal(this, id, props).apply(initializer)
