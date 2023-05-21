package com.faendir.awscdkkt.services.ec2

import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.ec2.CfnEIPAssociation
import software.amazon.awscdk.services.ec2.CfnEIPAssociationProps
import software.constructs.Construct

@Generated
public fun Construct.cfnEIPAssociation(id: String, initializer: CfnEIPAssociation.() -> Unit = {}):
    CfnEIPAssociation = CfnEIPAssociation(this, id).apply(initializer)

@Generated
public fun Construct.cfnEIPAssociation(
  id: String,
  props: CfnEIPAssociationProps,
  initializer: CfnEIPAssociation.() -> Unit = {},
): CfnEIPAssociation = CfnEIPAssociation(this, id, props).apply(initializer)
