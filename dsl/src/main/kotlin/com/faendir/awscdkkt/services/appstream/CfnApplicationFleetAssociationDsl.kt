package com.faendir.awscdkkt.services.appstream

import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.appstream.CfnApplicationFleetAssociation
import software.amazon.awscdk.services.appstream.CfnApplicationFleetAssociationProps
import software.constructs.Construct

@Generated
public fun Construct.cfnApplicationFleetAssociation(
  id: String,
  props: CfnApplicationFleetAssociationProps,
  initializer: CfnApplicationFleetAssociation.() -> Unit = {},
): CfnApplicationFleetAssociation = CfnApplicationFleetAssociation(this, id,
    props).apply(initializer)
