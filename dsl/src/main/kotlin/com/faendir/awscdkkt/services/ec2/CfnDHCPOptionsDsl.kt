@file:Generated(value = ["Generated based on CDK v2.79.1"])

package com.faendir.awscdkkt.services.ec2

import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.ec2.CfnDHCPOptions
import software.amazon.awscdk.services.ec2.CfnDHCPOptionsProps
import software.constructs.Construct

public fun Construct.cfnDHCPOptions(id: String, initializer: CfnDHCPOptions.() -> Unit = {}):
    CfnDHCPOptions = CfnDHCPOptions(this, id).apply(initializer)

public fun Construct.cfnDHCPOptions(
  id: String,
  props: CfnDHCPOptionsProps,
  initializer: CfnDHCPOptions.() -> Unit = {},
): CfnDHCPOptions = CfnDHCPOptions(this, id, props).apply(initializer)
