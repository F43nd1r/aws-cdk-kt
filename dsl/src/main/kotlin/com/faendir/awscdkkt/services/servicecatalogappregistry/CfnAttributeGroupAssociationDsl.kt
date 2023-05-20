@file:Generated(value = ["Generated 2023-05-20 based on CDK 2.79.1"])

package com.faendir.awscdkkt.services.servicecatalogappregistry

import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.servicecatalogappregistry.CfnAttributeGroupAssociation
import software.amazon.awscdk.services.servicecatalogappregistry.CfnAttributeGroupAssociationProps
import software.constructs.Construct

public fun Construct.cfnAttributeGroupAssociation(
  id: String,
  props: CfnAttributeGroupAssociationProps,
  initializer: CfnAttributeGroupAssociation.() -> Unit = {},
): CfnAttributeGroupAssociation = CfnAttributeGroupAssociation(this, id, props).apply(initializer)
