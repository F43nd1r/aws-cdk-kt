@file:Generated(value = ["Generated 2023-05-20 based on CDK 2.79.1"])

package com.faendir.awscdkkt.services.ec2

import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.ec2.CfnIPAMResourceDiscoveryAssociation
import software.amazon.awscdk.services.ec2.CfnIPAMResourceDiscoveryAssociationProps
import software.constructs.Construct

public fun Construct.cfnIPAMResourceDiscoveryAssociation(
  id: String,
  props: CfnIPAMResourceDiscoveryAssociationProps,
  initializer: CfnIPAMResourceDiscoveryAssociation.() -> Unit = {},
): CfnIPAMResourceDiscoveryAssociation = CfnIPAMResourceDiscoveryAssociation(this, id,
    props).apply(initializer)
