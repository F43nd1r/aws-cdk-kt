package com.faendir.awscdkkt.services.ssm

import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.ssm.CfnAssociation
import software.amazon.awscdk.services.ssm.CfnAssociationProps
import software.constructs.Construct

@Generated
public fun Construct.cfnAssociation(
  id: String,
  props: CfnAssociationProps,
  initializer: CfnAssociation.() -> Unit = {},
): CfnAssociation = CfnAssociation(this, id, props).apply(initializer)
