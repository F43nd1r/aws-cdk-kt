@file:Generated(value = ["Generated based on CDK v2.79.1"])

package com.faendir.awscdkkt.services.ec2

import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.ec2.CfnIPAMResourceDiscovery
import software.amazon.awscdk.services.ec2.CfnIPAMResourceDiscoveryProps
import software.constructs.Construct

public fun Construct.cfnIPAMResourceDiscovery(
  id: String,
  props: CfnIPAMResourceDiscoveryProps,
  initializer: CfnIPAMResourceDiscovery.() -> Unit = {},
): CfnIPAMResourceDiscovery = CfnIPAMResourceDiscovery(this, id, props).apply(initializer)

public fun Construct.cfnIPAMResourceDiscovery(id: String,
    initializer: CfnIPAMResourceDiscovery.() -> Unit = {}): CfnIPAMResourceDiscovery =
    CfnIPAMResourceDiscovery(this, id).apply(initializer)
