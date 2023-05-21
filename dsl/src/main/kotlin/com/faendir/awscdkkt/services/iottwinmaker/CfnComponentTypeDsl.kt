package com.faendir.awscdkkt.services.iottwinmaker

import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.iottwinmaker.CfnComponentType
import software.amazon.awscdk.services.iottwinmaker.CfnComponentTypeProps
import software.constructs.Construct

@Generated
public fun Construct.cfnComponentType(
  id: String,
  props: CfnComponentTypeProps,
  initializer: CfnComponentType.() -> Unit = {},
): CfnComponentType = CfnComponentType(this, id, props).apply(initializer)
