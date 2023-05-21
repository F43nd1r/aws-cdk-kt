package com.faendir.awscdkkt.services.frauddetector

import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.frauddetector.CfnList
import software.amazon.awscdk.services.frauddetector.CfnListProps
import software.constructs.Construct

@Generated
public fun Construct.cfnList(
  id: String,
  props: CfnListProps,
  initializer: CfnList.() -> Unit = {},
): CfnList = CfnList(this, id, props).apply(initializer)
