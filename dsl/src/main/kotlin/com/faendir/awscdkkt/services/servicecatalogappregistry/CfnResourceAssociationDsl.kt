@file:Generated(value = ["Generated 2023-05-19 based on CDK 2.79.1"])

package com.faendir.awscdkkt.services.servicecatalogappregistry

import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.servicecatalogappregistry.CfnResourceAssociation
import software.amazon.awscdk.services.servicecatalogappregistry.CfnResourceAssociationProps
import software.constructs.Construct

public fun Construct.cfnResourceAssociation(
  id: String,
  props: CfnResourceAssociationProps,
  initializer: CfnResourceAssociation.() -> Unit = {},
): CfnResourceAssociation = CfnResourceAssociation(this, id, props).apply(initializer)
