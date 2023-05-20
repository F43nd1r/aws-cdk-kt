@file:Generated(value = ["Generated 2023-05-20 based on CDK 2.79.1"])

package com.faendir.awscdkkt.services.ec2

import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.ec2.CfnVPCDHCPOptionsAssociation
import software.amazon.awscdk.services.ec2.CfnVPCDHCPOptionsAssociationProps
import software.constructs.Construct

public fun Construct.cfnVPCDHCPOptionsAssociation(
  id: String,
  props: CfnVPCDHCPOptionsAssociationProps,
  initializer: CfnVPCDHCPOptionsAssociation.() -> Unit = {},
): CfnVPCDHCPOptionsAssociation = CfnVPCDHCPOptionsAssociation(this, id, props).apply(initializer)
