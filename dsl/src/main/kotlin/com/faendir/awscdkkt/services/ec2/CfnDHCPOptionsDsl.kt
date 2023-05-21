package com.faendir.awscdkkt.services.ec2

import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.ec2.CfnDHCPOptions
import software.amazon.awscdk.services.ec2.CfnDHCPOptionsProps
import software.constructs.Construct

@Generated
public fun Construct.cfnDHCPOptions(id: String, initializer: CfnDHCPOptions.() -> Unit = {}):
    CfnDHCPOptions = CfnDHCPOptions(this, id).apply(initializer)

@Generated
public fun Construct.cfnDHCPOptions(
  id: String,
  props: CfnDHCPOptionsProps,
  initializer: CfnDHCPOptions.() -> Unit = {},
): CfnDHCPOptions = CfnDHCPOptions(this, id, props).apply(initializer)
