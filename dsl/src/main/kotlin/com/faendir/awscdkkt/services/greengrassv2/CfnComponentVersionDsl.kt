@file:Generated(value = ["Generated based on CDK v2.80.0"])

package com.faendir.awscdkkt.services.greengrassv2

import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.greengrassv2.CfnComponentVersion
import software.amazon.awscdk.services.greengrassv2.CfnComponentVersionProps
import software.constructs.Construct

public fun Construct.cfnComponentVersion(id: String, initializer: CfnComponentVersion.() -> Unit =
    {}): CfnComponentVersion = CfnComponentVersion(this, id).apply(initializer)

public fun Construct.cfnComponentVersion(
  id: String,
  props: CfnComponentVersionProps,
  initializer: CfnComponentVersion.() -> Unit = {},
): CfnComponentVersion = CfnComponentVersion(this, id, props).apply(initializer)
