package com.faendir.awscdkkt.services.emr

import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.emr.CfnStudioSessionMapping
import software.amazon.awscdk.services.emr.CfnStudioSessionMappingProps
import software.constructs.Construct

@Generated
public fun Construct.cfnStudioSessionMapping(
  id: String,
  props: CfnStudioSessionMappingProps,
  initializer: CfnStudioSessionMapping.() -> Unit = {},
): CfnStudioSessionMapping = CfnStudioSessionMapping(this, id, props).apply(initializer)
