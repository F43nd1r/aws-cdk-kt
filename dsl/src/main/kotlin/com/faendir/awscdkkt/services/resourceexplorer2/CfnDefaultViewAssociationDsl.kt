package com.faendir.awscdkkt.services.resourceexplorer2

import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.resourceexplorer2.CfnDefaultViewAssociation
import software.amazon.awscdk.services.resourceexplorer2.CfnDefaultViewAssociationProps
import software.constructs.Construct

@Generated
public fun Construct.cfnDefaultViewAssociation(
  id: String,
  props: CfnDefaultViewAssociationProps,
  initializer: CfnDefaultViewAssociation.() -> Unit = {},
): CfnDefaultViewAssociation = CfnDefaultViewAssociation(this, id, props).apply(initializer)
