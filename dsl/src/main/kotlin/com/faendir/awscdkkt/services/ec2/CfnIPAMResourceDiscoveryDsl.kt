package com.faendir.awscdkkt.services.ec2

import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.ec2.CfnIPAMResourceDiscovery
import software.amazon.awscdk.services.ec2.CfnIPAMResourceDiscoveryProps
import software.constructs.Construct

@Generated
public fun Construct.cfnIPAMResourceDiscovery(id: String,
    initializer: CfnIPAMResourceDiscovery.() -> Unit = {}): CfnIPAMResourceDiscovery =
    CfnIPAMResourceDiscovery(this, id).apply(initializer)

@Generated
public fun Construct.cfnIPAMResourceDiscovery(
  id: String,
  props: CfnIPAMResourceDiscoveryProps,
  initializer: CfnIPAMResourceDiscovery.() -> Unit = {},
): CfnIPAMResourceDiscovery = CfnIPAMResourceDiscovery(this, id, props).apply(initializer)
