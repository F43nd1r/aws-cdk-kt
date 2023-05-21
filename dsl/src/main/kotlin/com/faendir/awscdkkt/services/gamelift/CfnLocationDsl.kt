package com.faendir.awscdkkt.services.gamelift

import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.gamelift.CfnLocation
import software.amazon.awscdk.services.gamelift.CfnLocationProps
import software.constructs.Construct

@Generated
public fun Construct.cfnLocation(
  id: String,
  props: CfnLocationProps,
  initializer: CfnLocation.() -> Unit = {},
): CfnLocation = CfnLocation(this, id, props).apply(initializer)
