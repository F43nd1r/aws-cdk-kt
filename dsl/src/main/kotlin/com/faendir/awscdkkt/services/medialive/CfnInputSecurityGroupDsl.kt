@file:Generated(value = ["Generated 2023-05-19 based on CDK 2.79.1"])

package com.faendir.awscdkkt.services.medialive

import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.medialive.CfnInputSecurityGroup
import software.amazon.awscdk.services.medialive.CfnInputSecurityGroupProps
import software.constructs.Construct

public fun Construct.cfnInputSecurityGroup(id: String, initializer: CfnInputSecurityGroup.() -> Unit
    = {}): CfnInputSecurityGroup = CfnInputSecurityGroup(this, id).apply(initializer)

public fun Construct.cfnInputSecurityGroup(
  id: String,
  props: CfnInputSecurityGroupProps,
  initializer: CfnInputSecurityGroup.() -> Unit = {},
): CfnInputSecurityGroup = CfnInputSecurityGroup(this, id, props).apply(initializer)
