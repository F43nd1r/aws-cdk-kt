@file:Generated(value = ["Generated based on CDK v2.80.0"])

package com.faendir.awscdkkt.services.ssm

import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.ssm.CfnAssociation
import software.amazon.awscdk.services.ssm.CfnAssociationProps
import software.constructs.Construct

public fun Construct.cfnAssociation(
  id: String,
  props: CfnAssociationProps,
  initializer: CfnAssociation.() -> Unit = {},
): CfnAssociation = CfnAssociation(this, id, props).apply(initializer)
