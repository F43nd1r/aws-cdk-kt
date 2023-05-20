@file:Generated(value = ["Generated based on CDK v2.79.1"])

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
