package com.faendir.awscdkkt.services.customerprofiles

import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.customerprofiles.CfnObjectType
import software.amazon.awscdk.services.customerprofiles.CfnObjectTypeProps
import software.constructs.Construct

@Generated
public fun Construct.cfnObjectType(
  id: String,
  props: CfnObjectTypeProps,
  initializer: CfnObjectType.() -> Unit = {},
): CfnObjectType = CfnObjectType(this, id, props).apply(initializer)
