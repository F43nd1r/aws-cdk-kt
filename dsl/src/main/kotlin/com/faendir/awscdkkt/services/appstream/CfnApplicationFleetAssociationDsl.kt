@file:Generated(value = ["Generated 2023-05-20 based on CDK 2.79.1"])

package com.faendir.awscdkkt.services.appstream

import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.appstream.CfnApplicationFleetAssociation
import software.amazon.awscdk.services.appstream.CfnApplicationFleetAssociationProps
import software.constructs.Construct

public fun Construct.cfnApplicationFleetAssociation(
  id: String,
  props: CfnApplicationFleetAssociationProps,
  initializer: CfnApplicationFleetAssociation.() -> Unit = {},
): CfnApplicationFleetAssociation = CfnApplicationFleetAssociation(this, id,
    props).apply(initializer)
