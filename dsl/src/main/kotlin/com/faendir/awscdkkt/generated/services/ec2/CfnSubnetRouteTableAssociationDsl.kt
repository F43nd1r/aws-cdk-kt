package com.faendir.awscdkkt.generated.services.ec2

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.ec2.CfnSubnetRouteTableAssociation
import software.amazon.awscdk.services.ec2.CfnSubnetRouteTableAssociationProps
import software.constructs.Construct

@Generated
public fun Construct.cfnSubnetRouteTableAssociation(id: String,
    props: CfnSubnetRouteTableAssociationProps): CfnSubnetRouteTableAssociation =
    CfnSubnetRouteTableAssociation(this, id, props)

@Generated
public fun Construct.cfnSubnetRouteTableAssociation(
  id: String,
  props: CfnSubnetRouteTableAssociationProps,
  initializer: @AwsCdkDsl CfnSubnetRouteTableAssociation.() -> Unit,
): CfnSubnetRouteTableAssociation = CfnSubnetRouteTableAssociation(this, id,
    props).apply(initializer)

@Generated
public fun Construct.buildCfnSubnetRouteTableAssociation(id: String, initializer: @AwsCdkDsl
    CfnSubnetRouteTableAssociation.Builder.() -> Unit): CfnSubnetRouteTableAssociation =
    CfnSubnetRouteTableAssociation.Builder.create(this, id).apply(initializer).build()
