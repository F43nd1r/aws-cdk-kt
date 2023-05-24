package com.faendir.awscdkkt.generated.services.appstream

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.appstream.CfnApplicationFleetAssociation
import software.amazon.awscdk.services.appstream.CfnApplicationFleetAssociationProps
import software.constructs.Construct

@Generated
public fun Construct.cfnApplicationFleetAssociation(id: String,
    props: CfnApplicationFleetAssociationProps): CfnApplicationFleetAssociation =
    CfnApplicationFleetAssociation(this, id, props)

@Generated
public fun Construct.cfnApplicationFleetAssociation(
  id: String,
  props: CfnApplicationFleetAssociationProps,
  initializer: @AwsCdkDsl CfnApplicationFleetAssociation.() -> Unit,
): CfnApplicationFleetAssociation = CfnApplicationFleetAssociation(this, id,
    props).apply(initializer)

@Generated
public fun Construct.buildCfnApplicationFleetAssociation(id: String, initializer: @AwsCdkDsl
    CfnApplicationFleetAssociation.Builder.() -> Unit): CfnApplicationFleetAssociation =
    CfnApplicationFleetAssociation.Builder.create(this, id).apply(initializer).build()
