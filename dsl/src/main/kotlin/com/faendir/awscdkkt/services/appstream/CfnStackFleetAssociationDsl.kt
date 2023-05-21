package com.faendir.awscdkkt.services.appstream

import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.appstream.CfnStackFleetAssociation
import software.amazon.awscdk.services.appstream.CfnStackFleetAssociationProps
import software.constructs.Construct

@Generated
public fun Construct.cfnStackFleetAssociation(
  id: String,
  props: CfnStackFleetAssociationProps,
  initializer: CfnStackFleetAssociation.() -> Unit = {},
): CfnStackFleetAssociation = CfnStackFleetAssociation(this, id, props).apply(initializer)
