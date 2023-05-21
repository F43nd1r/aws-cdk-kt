package com.faendir.awscdkkt

import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.CfnMapping
import software.amazon.awscdk.CfnMappingProps
import software.constructs.Construct

@Generated
public fun Construct.cfnMapping(id: String, initializer: CfnMapping.() -> Unit = {}): CfnMapping =
    CfnMapping(this, id).apply(initializer)

@Generated
public fun Construct.cfnMapping(
  id: String,
  props: CfnMappingProps,
  initializer: CfnMapping.() -> Unit = {},
): CfnMapping = CfnMapping(this, id, props).apply(initializer)
