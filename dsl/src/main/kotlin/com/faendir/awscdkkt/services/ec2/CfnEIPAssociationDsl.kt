@file:Generated(value = ["Generated based on CDK v2.80.0"])

package com.faendir.awscdkkt.services.ec2

import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.ec2.CfnEIPAssociation
import software.amazon.awscdk.services.ec2.CfnEIPAssociationProps
import software.constructs.Construct

public fun Construct.cfnEIPAssociation(id: String, initializer: CfnEIPAssociation.() -> Unit = {}):
    CfnEIPAssociation = CfnEIPAssociation(this, id).apply(initializer)

public fun Construct.cfnEIPAssociation(
  id: String,
  props: CfnEIPAssociationProps,
  initializer: CfnEIPAssociation.() -> Unit = {},
): CfnEIPAssociation = CfnEIPAssociation(this, id, props).apply(initializer)
