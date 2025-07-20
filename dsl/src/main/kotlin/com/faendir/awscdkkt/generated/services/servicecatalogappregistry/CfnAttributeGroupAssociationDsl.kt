package com.faendir.awscdkkt.generated.services.servicecatalogappregistry

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.servicecatalogappregistry.CfnAttributeGroupAssociation
import software.amazon.awscdk.services.servicecatalogappregistry.CfnAttributeGroupAssociationProps
import software.constructs.Construct

@Generated
public fun Construct.cfnAttributeGroupAssociation(
  id: String,
  props: CfnAttributeGroupAssociationProps,
  initializer: @AwsCdkDsl CfnAttributeGroupAssociation.() -> Unit = {},
): CfnAttributeGroupAssociation = CfnAttributeGroupAssociation(this, id, props).apply(initializer)

@Generated
public fun Construct.buildCfnAttributeGroupAssociation(id: String, initializer: @AwsCdkDsl CfnAttributeGroupAssociation.Builder.() -> Unit = {}): CfnAttributeGroupAssociation = CfnAttributeGroupAssociation.Builder.create(this, id).apply(initializer).build()
