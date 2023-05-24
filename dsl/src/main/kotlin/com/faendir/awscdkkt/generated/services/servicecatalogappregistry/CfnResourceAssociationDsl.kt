package com.faendir.awscdkkt.generated.services.servicecatalogappregistry

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.servicecatalogappregistry.CfnResourceAssociation
import software.amazon.awscdk.services.servicecatalogappregistry.CfnResourceAssociationProps
import software.constructs.Construct

@Generated
public fun Construct.cfnResourceAssociation(id: String, props: CfnResourceAssociationProps):
    CfnResourceAssociation = CfnResourceAssociation(this, id, props)

@Generated
public fun Construct.cfnResourceAssociation(
  id: String,
  props: CfnResourceAssociationProps,
  initializer: @AwsCdkDsl CfnResourceAssociation.() -> Unit,
): CfnResourceAssociation = CfnResourceAssociation(this, id, props).apply(initializer)

@Generated
public fun Construct.buildCfnResourceAssociation(id: String, initializer: @AwsCdkDsl
    CfnResourceAssociation.Builder.() -> Unit): CfnResourceAssociation =
    CfnResourceAssociation.Builder.create(this, id).apply(initializer).build()
