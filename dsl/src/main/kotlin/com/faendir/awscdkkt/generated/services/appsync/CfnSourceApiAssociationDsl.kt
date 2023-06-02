package com.faendir.awscdkkt.generated.services.appsync

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.appsync.CfnSourceApiAssociation
import software.amazon.awscdk.services.appsync.CfnSourceApiAssociationProps
import software.constructs.Construct

@Generated
public fun Construct.cfnSourceApiAssociation(id: String): CfnSourceApiAssociation =
    CfnSourceApiAssociation(this, id)

@Generated
public fun Construct.cfnSourceApiAssociation(id: String, initializer: @AwsCdkDsl
    CfnSourceApiAssociation.() -> Unit): CfnSourceApiAssociation = CfnSourceApiAssociation(this,
    id).apply(initializer)

@Generated
public fun Construct.cfnSourceApiAssociation(id: String, props: CfnSourceApiAssociationProps):
    CfnSourceApiAssociation = CfnSourceApiAssociation(this, id, props)

@Generated
public fun Construct.cfnSourceApiAssociation(
  id: String,
  props: CfnSourceApiAssociationProps,
  initializer: @AwsCdkDsl CfnSourceApiAssociation.() -> Unit,
): CfnSourceApiAssociation = CfnSourceApiAssociation(this, id, props).apply(initializer)

@Generated
public fun Construct.buildCfnSourceApiAssociation(id: String, initializer: @AwsCdkDsl
    CfnSourceApiAssociation.Builder.() -> Unit): CfnSourceApiAssociation =
    CfnSourceApiAssociation.Builder.create(this, id).apply(initializer).build()
