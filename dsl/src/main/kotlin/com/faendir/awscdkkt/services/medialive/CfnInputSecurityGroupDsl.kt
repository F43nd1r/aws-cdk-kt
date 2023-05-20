@file:Generated(value = ["Generated based on CDK v2.80.0"])

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
