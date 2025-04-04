package com.faendir.awscdkkt.generated.services.ec2

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.ec2.CfnRouteServerAssociation
import software.amazon.awscdk.services.ec2.CfnRouteServerAssociationProps
import software.constructs.Construct

@Generated
public fun Construct.cfnRouteServerAssociation(
  id: String,
  props: CfnRouteServerAssociationProps,
  initializer: @AwsCdkDsl CfnRouteServerAssociation.() -> Unit = {},
): CfnRouteServerAssociation = CfnRouteServerAssociation(this, id, props).apply(initializer)

@Generated
public fun Construct.buildCfnRouteServerAssociation(id: String, initializer: @AwsCdkDsl
    CfnRouteServerAssociation.Builder.() -> Unit = {}): CfnRouteServerAssociation =
    CfnRouteServerAssociation.Builder.create(this, id).apply(initializer).build()
