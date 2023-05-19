@file:Generated(value = ["Generated 2023-05-19 based on CDK 2.79.1"])

package com.faendir.awscdkkt.services.emr

import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.emr.CfnStudioSessionMapping
import software.amazon.awscdk.services.emr.CfnStudioSessionMappingProps
import software.constructs.Construct

public fun Construct.cfnStudioSessionMapping(
  id: String,
  props: CfnStudioSessionMappingProps,
  initializer: CfnStudioSessionMapping.() -> Unit = {},
): CfnStudioSessionMapping = CfnStudioSessionMapping(this, id, props).apply(initializer)
