package com.faendir.awscdkkt.generated.services.ec2

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.ec2.CfnEIPAssociation
import software.amazon.awscdk.services.ec2.CfnEIPAssociationProps
import software.constructs.Construct

@Generated
public fun Construct.cfnEIPAssociation(id: String, initializer: @AwsCdkDsl CfnEIPAssociation.() -> Unit = {}): CfnEIPAssociation = CfnEIPAssociation(this, id).apply(initializer)

@Generated
public fun Construct.cfnEIPAssociation(
  id: String,
  props: CfnEIPAssociationProps,
  initializer: @AwsCdkDsl CfnEIPAssociation.() -> Unit = {},
): CfnEIPAssociation = CfnEIPAssociation(this, id, props).apply(initializer)

@Generated
public fun Construct.buildCfnEIPAssociation(id: String, initializer: @AwsCdkDsl CfnEIPAssociation.Builder.() -> Unit = {}): CfnEIPAssociation = CfnEIPAssociation.Builder.create(this, id).apply(initializer).build()
