@file:Generated(value = ["Generated based on CDK v2.79.1"])

package com.faendir.awscdkkt.services.servicecatalogappregistry

import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.servicecatalogappregistry.CfnAttributeGroup
import software.amazon.awscdk.services.servicecatalogappregistry.CfnAttributeGroupProps
import software.constructs.Construct

public fun Construct.cfnAttributeGroup(
  id: String,
  props: CfnAttributeGroupProps,
  initializer: CfnAttributeGroup.() -> Unit = {},
): CfnAttributeGroup = CfnAttributeGroup(this, id, props).apply(initializer)
