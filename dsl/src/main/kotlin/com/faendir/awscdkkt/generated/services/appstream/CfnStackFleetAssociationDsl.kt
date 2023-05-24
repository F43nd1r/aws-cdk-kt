package com.faendir.awscdkkt.generated.services.appstream

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.appstream.CfnStackFleetAssociation
import software.amazon.awscdk.services.appstream.CfnStackFleetAssociationProps
import software.constructs.Construct

@Generated
public fun Construct.cfnStackFleetAssociation(id: String, props: CfnStackFleetAssociationProps):
    CfnStackFleetAssociation = CfnStackFleetAssociation(this, id, props)

@Generated
public fun Construct.cfnStackFleetAssociation(
  id: String,
  props: CfnStackFleetAssociationProps,
  initializer: @AwsCdkDsl CfnStackFleetAssociation.() -> Unit,
): CfnStackFleetAssociation = CfnStackFleetAssociation(this, id, props).apply(initializer)

@Generated
public fun Construct.buildCfnStackFleetAssociation(id: String, initializer: @AwsCdkDsl
    CfnStackFleetAssociation.Builder.() -> Unit): CfnStackFleetAssociation =
    CfnStackFleetAssociation.Builder.create(this, id).apply(initializer).build()
