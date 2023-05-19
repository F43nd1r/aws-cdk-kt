@file:Generated(value = ["Generated 2023-05-19 based on CDK 2.79.1"])

package com.faendir.awscdkkt.services.ec2

import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.ec2.CfnTrafficMirrorFilter
import software.amazon.awscdk.services.ec2.CfnTrafficMirrorFilterProps
import software.constructs.Construct

public fun Construct.cfnTrafficMirrorFilter(id: String,
    initializer: CfnTrafficMirrorFilter.() -> Unit = {}): CfnTrafficMirrorFilter =
    CfnTrafficMirrorFilter(this, id).apply(initializer)

public fun Construct.cfnTrafficMirrorFilter(
  id: String,
  props: CfnTrafficMirrorFilterProps,
  initializer: CfnTrafficMirrorFilter.() -> Unit = {},
): CfnTrafficMirrorFilter = CfnTrafficMirrorFilter(this, id, props).apply(initializer)
